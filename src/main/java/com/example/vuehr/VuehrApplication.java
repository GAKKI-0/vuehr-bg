package com.example.vuehr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.vuehr.base.mapper"})
public class VuehrApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuehrApplication.class, args);
    }

}
