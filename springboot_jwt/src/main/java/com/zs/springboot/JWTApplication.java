package com.zs.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zs
 * @date 2021/2/23 10:07
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
public class JWTApplication {
    public static void main(String[] args) {
        /**
         * 搭建日志框架  log4j slf4j
         * 使用aop记录日志(注解) 声明式-注解式
         */
        SpringApplication.run(JWTApplication.class);
    }
}
