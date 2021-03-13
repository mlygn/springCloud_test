package test.com.zs.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import test.JWTTest;

/**
 * @author zs
 * @date 2021/2/24 15:49
 */
@StrawBerryAnnotation(type = "小草莓",size = "3cm",price = "1.5RMB")
@Component
public class TestStrawBerryAnnotation {

    public static void main(String[] args) throws Exception{

//ServiceAnnotationSupport
        Class testStrawBerryAnnotationClass = TestStrawBerryAnnotation.class;//获取所有的类遍历判断是否打上了注解
        if(testStrawBerryAnnotationClass.isAnnotationPresent(StrawBerryAnnotation.class)){
            System.out.println(testStrawBerryAnnotationClass.getSimpleName()+"配置了"+ "StrawBerryAnnotation注解");
            StrawBerryAnnotation strawBerryAnnotation = (StrawBerryAnnotation) testStrawBerryAnnotationClass.getAnnotation(StrawBerryAnnotation.class);
            System.out.println("注解内容");
            System.out.println("type:"+strawBerryAnnotation.type());
            System.out.println("size:"+strawBerryAnnotation.size());
            System.out.println("price:"+strawBerryAnnotation.price());
        }else {
            System.out.println("没配置StrawBerryAnnotation注解");
        }
       /* String s = "";
       如果让我处理（spring中注解如何处理）：
        项目中的直接应该是放到指定的几个包下，有多少注解也是一定的，注解的功能也是确定的
        定义一个注解肯定知道他的功能--有通用的注解--有特殊的注解--特殊注解归为一类

        首先扫描读取所有类-然后按照注解类型进行归类-
        找到对应的注解调用其注解处理类-注解处理类处理对应的类-
        生产者消费者模式--读线程为生产者
        各类型的注解处理类线程为消费者-各自处理自己的事
        并发读操作--按照模块生成模块个数个线程-共享操作
        读取如何读--先将所有类加载到内存？--内存够用吗--或者一个模块一个模块的加载到内存-不能没读一次文件都访问一次磁盘。如果内存足够大，则一次加载也不是不可以
        --根据需要进行加载--可改成可配置


        switch (s){//switch从jdk7开始支持String类型的变量 之前只支持数字类型和char-不确定是否支持 枚举类型的
            case "1":
                System.out.println("dd");
                break;
        }*/
    }
}
