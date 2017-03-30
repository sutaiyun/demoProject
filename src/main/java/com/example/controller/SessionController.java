package com.example.controller;

import com.example.domain.BaseRequest;
import com.example.domain.BaseResponse;
import com.example.domain.LoginRequest;
import com.example.domain.LoginResponse;
import com.example.service.SessionService;
import com.example.util.DemoException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sutaiyun on 2017/3/27.
 */
@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse<Object> login(@RequestBody BaseRequest<LoginRequest> request) throws DemoException {
        System.out.println("RequestBody: " + request.toString());

        LoginRequest loginRequest = request.getRequestMsg();
        System.out.println("LoginRequest: " + loginRequest.toString());

        LoginResponse loginResponse = sessionService.login(loginRequest); //error, throws DemoException
        return BaseResponse.makeResponse(loginResponse);
    }

    @ExceptionHandler(DemoException.class)
    public BaseResponse<Object> exceptionHandler(DemoException e) {
        BaseResponse<Object> response = BaseResponse.makeErrResponse(e, null);
        return response;
    }
}
