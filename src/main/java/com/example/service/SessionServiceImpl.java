package com.example.service;

import com.example.Util;
import com.example.datasource.service.CountryService;
import com.example.domain.DemoUser;
import com.example.domain.LoginRequest;
import com.example.domain.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sutaiyun on 2017/3/28.
 */
@Service
public class SessionServiceImpl implements SessionService {
    //@Autowired
    //private UserService userService;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        System.out.println("user: " + loginRequest.getUserName());
        System.out.println("pwd: " + loginRequest.getPassword());

        //check user/pwd from mysql user table(from UserService)
        //check redis token
        String token = Util.getUUID();
        //store token , userName to redis and mysql

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setUserName(loginRequest.getUserName());
        loginResponse.setToken(token);

        return loginResponse;
    }

    @Override
    public boolean tokenIsExist(String userName) {
        return false;
    }

    @Override
    public DemoUser getUserByToken(String token) {
        return null;
    }
}
