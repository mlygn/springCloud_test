package com.zs.springboot.controller;

import com.zs.springboot.test.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;

/**
 * @author zs
 * @date 2021/2/27 18:24
 */
@RestController
public class TestFeighController {
    @Autowired
    private TestFeign testFeign;

    @RequestMapping(value = "/testController",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object testController(){
        return testFeign.testFeignInvoke();
    }

}
