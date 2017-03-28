package com.example.domain;

/**
 * Created by sutaiyun on 2017/3/28.
 */

public class BaseResponse<T> {
    private String retMsg = "success";
    private Integer code = 1;
    private T responseMsg;

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(T responseMsg) {
        this.responseMsg = responseMsg;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "msg='" + retMsg + '\'' +
                ", code=" + code +
                ", bizData=" + responseMsg.toString() +
                '}';
    }

    public static BaseResponse<Object> makeResponse(Object pl){
        BaseResponse<Object> response = getObjectBaseResponse(pl, 1, "success");
        return response;
    }

    private static BaseResponse<Object> getObjectBaseResponse(Object pl, Integer code, String msg) {
        BaseResponse<Object> response = new BaseResponse<>();
        response.setCode(code);
        response.setRetMsg(msg);
        response.setResponseMsg(pl);
        return response;
    }
}
