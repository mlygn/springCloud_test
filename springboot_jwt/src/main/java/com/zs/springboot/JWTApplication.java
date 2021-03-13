package com.zs.springboot;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zs
 * @date 2021/2/23 10:07
 */
@SpringBootApplication
public class JWTApplication {
    public static void main(String[] args) {
        /**
         * @EnableEurekaClient
         @EnableFeignClients
         @EnableDiscoveryClient
         测试的时候先不需要设置eureka
         *
         * 搭建日志框架  log4j slf4j
         * 使用aop记录日志(注解) 声明式-注解式
         */
        SpringApplication.run(JWTApplication.class);
    }
}
