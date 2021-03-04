package test;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import java.text.SimpleDateFormat;

/**
 * @author zs
 * @date 2021/2/23 10:52
 */
public class JWTParseTest {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjYiLCJzdWIiOiLlpKfnmb0iLCJpYXQiOjE2MTQwNTExNzAsImV4cCI6MTYxNDA1MTI5MH0.64BVCIWeXrsmvEOyyXb2CdcOIitijpDsxmUzUimDFPg";
        Claims claims = Jwts.parser().setSigningKey("zssy").parseClaimsJws(token).getBody();
        System.out.println("id: " + claims.getId());
        System.out.println("subjext " + claims.getSubject());
        System.out.println("issue    at :" + sdf.format(claims.getIssuedAt()));
        System.out.println("expire time :" + sdf.format(claims.getExpiration()));
    }
}
