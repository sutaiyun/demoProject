package com.example.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sutaiyun on 2017/3/28.
 */

public class DemoUser {
    private DemoUser() {
        this.loginName = "demo-project";
        this.password = "demo";
        this.token = null;
    }

    private static DemoUser demoUser = null;

    public static DemoUser getInstance() {
        if (demoUser == null) {
            demoUser = new DemoUser();
        }
        return demoUser;
    }

    private String id;

    private String loginName;

    private String realName;

    private String password;

    private String number;

    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
