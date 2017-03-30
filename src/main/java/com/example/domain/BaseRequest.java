package com.example.domain;

import java.util.Date;

/**
 * Created by sutaiyun on 2017/3/28.
 */
public class BaseRequest<T> {
    private Date timestamp;
    private T requestMsg;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public T getRequestMsg() {
        return requestMsg;
    }

    public void setRequestMsg(T requestMsg) {
        this.requestMsg = requestMsg;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "timestamp=" + timestamp +
                ", requestMsg=" + requestMsg.toString() +
                '}';
    }
}
