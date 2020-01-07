package com.hxr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName: OAuth2ResourceApplication
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-07 13:24
 * @Version: 1.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.hxr.mapper")
public class OAuth2ResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class,args);

    }
}
