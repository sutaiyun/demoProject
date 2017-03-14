package com.example.datasource.mapper;

import com.example.datasource.dao.Country;

/**
 * Created by sutaiyun on 2017/3/14.
 */
public interface CountryMapper {
    public Country selectByCountryId(int country_id);
}
