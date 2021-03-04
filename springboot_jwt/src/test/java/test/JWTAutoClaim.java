package test;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

/**
 * @author zs
 * @date 2021/2/25 10:13
 */
public class JWTAutoClaim {
    public static void main(String[] args) {
        JwtBuilder jwtBuilder = Jwts.builder().claim("role","admin")
                .claim("logo","logo.png");
    }
}
