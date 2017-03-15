package com.example.controller;

import com.example.datasource.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by sutaiyun on 2017/3/14.
 */
@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @RequestMapping(value = {"", "/"})
    public String getAllCountries() {
        return countryService.getAllCountry();
    }
}
