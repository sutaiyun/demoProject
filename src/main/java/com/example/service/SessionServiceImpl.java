package com.example.service;

import com.example.util.DemoException;
import com.example.util.ErrorEnum;
import com.example.util.Util;
import com.example.domain.DemoUser;
import com.example.domain.LoginRequest;
import com.example.domain.LoginResponse;
import org.springframework.stereotype.Service;

/**
 * Created by sutaiyun on 2017/3/28.
 */
@Service
public class SessionServiceImpl implements SessionService {
    //@Autowired
    //private UserService userService;

    @Override
    public LoginResponse login(LoginRequest loginRequest) throws DemoException {
        LoginResponse loginResponse = new LoginResponse();

        //check user/pwd from mysql user table(from UserService)
        //check redis token
        String token = Util.getUUID();
        //store token , userName to redis and mysql

        if (!loginRequest.getUserName().equals(DemoUser.getInstance().getLoginName()) ||
                !loginRequest.getPassword().equals(DemoUser.getInstance().getPassword()))
        {
            System.out.println("user/password error>> LoginRequest: " + loginRequest.getUserName() + " " + loginRequest.getPassword() +
                                "    DemoUser: " + DemoUser.getInstance().getLoginName() + " " + DemoUser.getInstance().getPassword());
            throw new DemoException(ErrorEnum.ERROR_USER_LOGIN_FAILD);
        }

        loginResponse.setUserName(loginRequest.getUserName());
        loginResponse.setToken(token);

        DemoUser.getInstance().setToken(token);
        return loginResponse;
    }

    @Override
    public boolean tokenIsExist(String userName) {
        //get token from redis by userName
        return null != DemoUser.getInstance().getToken();
    }

    @Override
    public DemoUser getUserByToken(String token) {
        //get user by token from redis;

        return DemoUser.getInstance();
    }
}
