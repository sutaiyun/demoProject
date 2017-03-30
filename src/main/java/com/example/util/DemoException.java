package com.example.util;

/**
 * Created by sutaiyun on 2017/3/30.
 */

public class DemoException extends Exception {
    private Integer code;
    private String msg;
    public DemoException(ErrorEnum errorEnum){
        this.code = errorEnum.getCode();
        this.msg = errorEnum.getMsg();
    }


    public DemoException(Integer code, String msg) {
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
