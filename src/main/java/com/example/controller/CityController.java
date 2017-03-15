package com.example.controller;

import com.example.datasource.dao.City;
import com.example.datasource.mapper.CityMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by sutaiyun on 2017/3/13.
 */
@RestController
@RequestMapping("/cities")
public class CityController {

    @RequestMapping(value = {"", "/"} )
    public String getAllCities() {
        try {
            return getCite();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Error City!!!!!!!!!";
    }

    private String  getCite() throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);

        SqlSession session = factory.openSession();
        try {
            CityMapper cityMapper = session
                    .getMapper(CityMapper.class);
            City city = cityMapper.selectByCityId(1);
            return "city: " + city.toString();
        } finally {
            session.close();
        }
    }
}
