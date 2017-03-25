package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
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

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations(staticPath);
    }

    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {
        //registry.addRedirectViewController("/", "/index.html");
        registry.addRedirectViewController("/", "/dist/index.html");
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
        super.addViewControllers( registry );
    }
}
