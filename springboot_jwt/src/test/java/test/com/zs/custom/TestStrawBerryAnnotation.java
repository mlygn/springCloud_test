package test.com.zs.custom;
/**
 * @author zs
 * @date 2021/2/24 15:49
 */
@StrawBerryAnnotation(type = "小草莓",size = "3cm",price = "1.5RMB")
public class TestStrawBerryAnnotation {

    public static void main(String[] args) {
        Class testStrawBerryAnnotationClass = TestStrawBerryAnnotation.class;
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
        switch (s){//switch从jdk7开始支持String类型的变量 之前只支持数字类型和char-不确定是否支持 枚举类型的
            case "1":
                System.out.println("dd");
                break;
        }*/
    }
}
