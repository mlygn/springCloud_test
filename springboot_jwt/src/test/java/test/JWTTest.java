package test;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @author zs
 * @date 2021/2/23 10:09
 */
public class JWTTest {
    //测试最好拉倒test目录下面，这样不用进行项目编译就可以直接调试，如果在项目目录下则需要先编译才能进行测试
    public static void main(String[] args) {
        //issue at 签发地，签发时间，  issue问题
        long now = System.currentTimeMillis();
        long exp = System.currentTimeMillis() + 2*60*1000;
        JwtBuilder jwtBuilder = Jwts.builder().setId("666")
                .setSubject("大白")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256,"zssy")
                .setExpiration(new Date(exp));//设置过期时间，在过期后该token不能正常解析，报错已过期
        //signWith的第二个参数如果为String类型，则长度最少为3位，否则要转换成其字节数组,不然报错
        //compact  com 表加强  pact合同  compact合同，契约
        System.out.println(jwtBuilder.compact());
    }
}
