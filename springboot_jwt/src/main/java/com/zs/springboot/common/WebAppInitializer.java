package com.zs.springboot.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * @author zs
 * @date 2021/3/10 17:23
 *
 * web应用初始化环境
 */
public class WebAppInitializer implements ServletContextAware,ApplicationContextAware,InitializingBean{

    //实现ServletContextAware中的方法
    public void setServletContext(ServletContext var1){}

    //实现ApplicationContextAware中的方法
    public void setApplicationContext(ApplicationContext var1) throws BeansException{}

    //实现InitializingBean中的方法--需要很清楚整个spring容器的加载过程
    public void afterPropertiesSet() throws Exception{

    }

    public void initApplication(){
        //Web应用根路径设置  最低回撤30就很多了，考虑布局，不肯能一跌到底--现在再买就是死 正常人这样想--所以明天跌，跌了也没人敢买
        //主力：人都都完了，拉几个大涨，吸引人气，等人来了在收割--先抬起来10个点，
        //现在的目标很明确，聚人气，在大跌现在聚人气有啥用，白聚人气，涨半个月，大家都有收益了，特别是新买基金的，这样这些人才会原意接着买，然后在收割
        //周五再买-- -- -- -- -- -- -- --
    }

}
