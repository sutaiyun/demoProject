package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by sutaiyun on 2017/3/13.
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Application implements CommandLineRunner {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @Autowired
    private MyConfig myConfig;

    @RequestMapping("/now")
    String nowTime() {

        return "now time: " + (new Date()).toString();
    }

    public static void main(String args[]) {
        System.out.println("SpringApplication run BEGIN ****** ");

        SpringApplication.run(Application.class);

        System.out.println("SpringApplication run OK !!!!!! ");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("name:" + myConfig.getName());
        System.out.println("phone:" + myConfig.getPhone());
    }
}

