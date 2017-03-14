package com.example;

import com.example.datasource.dao.City;
import com.example.datasource.mapper.CityMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.IOException;
import java.io.Reader;
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

        try {
            initMyBatis();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SpringApplication.run(Application.class);

        System.out.println("SpringApplication run OK !!!!!! ");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("name:" + myConfig.getName());
        System.out.println("phone:" + myConfig.getPhone());

        //initMyBatis();
    }

    private static void  initMyBatis() throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(reader);

        SqlSession session = factory.openSession();
        try {
            CityMapper cityMapper = session
                    .getMapper(CityMapper.class);
            City city = cityMapper.selectByCityId(1);
            System.out.println("city: " + city.getName());
        } finally {
            session.close();
        }
    }
}

