package com.myibatis;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan(basePackages = {"com.myibatis"})
@MapperScan("com.myibatis.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Application {

    public static void main(String args[]){

        SpringApplication.run(Application.class, args);

    }




}