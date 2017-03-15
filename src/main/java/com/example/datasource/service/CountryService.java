package com.example.datasource.service;

import com.example.datasource.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sutaiyun on 2017/3/14.
 */
@Service
public class CountryService {
    @Autowired
    private CountryMapper countryMapper;

    public String getAllCountry() {
        return countryMapper.selectByCountryId(1).toString();
    }
}
