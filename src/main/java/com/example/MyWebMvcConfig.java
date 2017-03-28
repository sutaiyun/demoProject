package com.example;

import com.example.controller.SessionHandlerInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by sutaiyun on 2017/3/15.
 */
@Configuration
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {
    @Value("${demo.project.static.web.path}")
    private String staticPath; // /web_release

    @Bean
    SessionHandlerInterceptor localInterceptor() {
        return new SessionHandlerInterceptor();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations(staticPath);
    }

    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {
        registry.addRedirectViewController("/", "/index.html");
        //registry.addRedirectViewController("/", "/dist/index.html"); //kity-minder
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
        super.addViewControllers( registry );
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //除session外，所有的请求均被拦截器处理，以进行用户鉴权判定
        registry.addInterceptor(localInterceptor()).excludePathPatterns("/session/*","/");
        super.addInterceptors(registry);
    }
}
