package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by sutaiyun on 2017/3/13.
 */
@Component
@ConfigurationProperties(prefix="my")
public class MyConfig {
    private String name;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
}
