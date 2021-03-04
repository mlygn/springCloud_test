package com.zs.springboot.controller;

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
public class TestController {

    @RequestMapping(value = "/test",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test(){
        return "测试111";
    }
}
