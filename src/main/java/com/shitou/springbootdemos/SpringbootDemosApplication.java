package com.shitou.springbootdemos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.shitou.springbootdemos.mybatis.repository")
@SpringBootApplication
public class SpringbootDemosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemosApplication.class, args);
    }

}
