package com.example.service;

import com.example.domain.DemoUser;
import com.example.domain.LoginRequest;
import com.example.domain.LoginResponse;

/**
 * Created by sutaiyun on 2017/3/28.
 */
public interface SessionService {
    public LoginResponse login(LoginRequest loginRequest);

    boolean tokenIsExist(String userName);

    DemoUser getUserByToken(String token);

}
