package com.example.util;

/**
 * Created by sutaiyun on 2017/3/28.
 */

public enum ErrorEnum {
    ERROR_DISPATCH_FAILD(-100001, "操作失败"),
    ERROR_USER_LOGIN_FAILD(-1000002, "登录失败"),
    ERROR_TOKEN_NOT_EXIST(-1000003, "token失效"),
    ERROR_RECYCLE_FAILD(-2000001, "回收失败"),
    ERROR_RULE_FAILD(-1000004, "无权限");

    private Integer code;
    private String msg;

    ErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
