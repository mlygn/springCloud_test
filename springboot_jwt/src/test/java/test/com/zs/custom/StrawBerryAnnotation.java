package test.com.zs.custom;

import java.lang.annotation.*;

/**
 * @author zs
 * @date 2021/2/24 15:18
 */
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface StrawBerryAnnotation {
/**
 * 在底层实现上所有的注解都会自动继承 java.lang.annotaion,Annotation接口
 * 实际开发中使用的都是Retention = RUNTIME  通过反射获取对应注解然后执行相关的操作
 */
    String type() default "大草莓";
    String size() default "8cm";
    String price() default "100.00RMB";
}
