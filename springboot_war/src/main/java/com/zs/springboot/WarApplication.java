package com.zs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author zs
 * @date 2021/2/23 15:25
 */
@SpringBootApplication
public class WarApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(WarApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WarApplication.class);
    }
}