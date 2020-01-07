package com.hxr;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @ClassName: PasswordEncoderTests
 * @Description:
 * @Author: xsh
 * @Date: 2020-01-06 11:59
 * @Version: 1.0
 **/
public class PasswordEncoderTests {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
//        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
