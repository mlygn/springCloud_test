package com.zs.springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zs
 * @date 2021/2/23 15:43
 */
@RestController
@CrossOrigin
public class TestController {

    @RequestMapping("/testWar")
    public Object test(){
        return "springboot打成war发布";
    }
}
