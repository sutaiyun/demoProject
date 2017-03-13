package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by sutaiyun on 2017/3/13.
 */
@RestController
@EnableAutoConfiguration
public class Application {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String nowTime() {
        return "now time: " + (new Date()).toString();
    }

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }
}

