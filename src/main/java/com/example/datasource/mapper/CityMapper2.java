package com.example.datasource.mapper;

import com.example.datasource.dao.City;
import org.apache.ibatis.annotations.Select;

/**
 * Created by sutaiyun on 2017/3/16.
 */
public interface CityMapper2 {
    @Select(value = "select id , name, state from city where id = #{id}")
    public City selectByPrimaryKey(Long id);
}
