package com.zs.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zs
 * @date 2021/2/23 14:22
 */
@RestController
@CrossOrigin
@Slf4j
public class TestController {


    @RequestMapping(value = "/test",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test(){
        log.info("###info###");
        log.debug("===debug===");
        log.error("===error===");
        return "测试111";
    }
}
