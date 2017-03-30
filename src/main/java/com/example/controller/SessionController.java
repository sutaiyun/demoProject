package com.example.controller;

import com.example.domain.BaseRequest;
import com.example.domain.BaseResponse;
import com.example.domain.LoginRequest;
import com.example.domain.LoginResponse;
import com.example.service.SessionService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sutaiyun on 2017/3/27.
 */
@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse<Object> login(@RequestBody BaseRequest<LoginRequest> request) {
        System.out.println("RequestBody: " + request.toString());

        LoginRequest loginRequest = request.getRequestMsg();
        System.out.println("LoginRequest: " + loginRequest.toString());

        LoginResponse loginResponse = sessionService.login(loginRequest);
        return BaseResponse.makeResponse(loginResponse);
    }
}
