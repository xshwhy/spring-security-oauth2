package com.hxr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName: OAuth2ServerApplication
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-06 11:09
 * @Version: 1.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.hxr.mapper")
public class OAuth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class,args);
    }
}
