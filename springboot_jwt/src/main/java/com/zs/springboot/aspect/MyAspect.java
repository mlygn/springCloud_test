package com.zs.springboot.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author zs
 * @date 2021/3/10 16:40
 */
@Aspect
@Component
@Slf4j
public class MyAspect {

    @Before("com.zs.springboot.aspect.PointCutDefinition.test()")
    public void beforeAdvice(JoinPoint joinPoint){
        log.error("前置通知执行了");
        //下面这个getSignature().getDeclaringTypeName()是获取包+类名的   然后后面的joinPoint.getSignature.getName()获取了方法名
        log.error(joinPoint.getSignature().getDeclaringTypeName()+"."+"."+joinPoint.getSignature().getName());
    }
}
