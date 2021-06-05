package com.zs.springboot.util;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 10d  2q   0.75
 * @author zs
 * @date 2021/2/24 10:15
 */
@ConfigurationProperties("jwt.config")
public class JWTUtil {

    public static void main(String[] args) {
        System.out.println();
    }



    
    private String key;
    private long ttl;



    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getTtl() {
        return ttl;
    }

    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    //生成jwt


}
