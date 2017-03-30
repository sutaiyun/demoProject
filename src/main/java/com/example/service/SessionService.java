package com.example.service;

import com.example.domain.DemoUser;
import com.example.domain.LoginRequest;
import com.example.domain.LoginResponse;
import com.example.util.DemoException;

/**
 * Created by sutaiyun on 2017/3/28.
 */
public interface SessionService {
    public LoginResponse login(LoginRequest loginRequest) throws DemoException;

    boolean tokenIsExist(String userName);

    DemoUser getUserByToken(String token);

}
