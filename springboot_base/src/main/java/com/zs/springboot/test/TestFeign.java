package com.zs.springboot.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.attribute.standard.Media;

/**
 * @author zs
 * @date 2021/2/27 18:20
 */
@FeignClient("springboot-jwt")
public interface TestFeign {

    @RequestMapping(value = "/test",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String testFeignInvoke();

}
