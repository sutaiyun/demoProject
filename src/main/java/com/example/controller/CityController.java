package com.example.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sutaiyun on 2017/3/13.
 */
@RestController
@RequestMapping("/cities")
public class CityController {

    @RequestMapping(value = {"", "/"} )
    public String getAllCities() {
        return "beijing, shanghai";
    }
}
