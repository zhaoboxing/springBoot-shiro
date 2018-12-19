package com.unistrong.springbootshirodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan(value = { "com.unistrong.springbootshirodemo.dao"})
@SpringBootApplication
public class SpringbootShiroDemoApplication extends SpringBootServletInitializer {
    //打war包的时候必须让启动类继承SpringBootServletInitializer类，并重写configure方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootShiroDemoApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootShiroDemoApplication.class, args);
    }
}
