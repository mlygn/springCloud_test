package com.zs.springboot.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zs
 * @date 2021/3/10 16:36
 */
@Aspect
@Component
public class PointCutDefinition {

    @Pointcut("execution(* test(..))")
    void test(){}


}
