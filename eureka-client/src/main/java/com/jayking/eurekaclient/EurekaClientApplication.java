package com.jayking.eurekaclient;

import lombok.extern.log4j.Log4j2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.jayking.eurekaclient.mapper")
@Log4j2
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
        log.info("===============server start...====================");
        log.info("===============Connect Mysql DB...================");
    }

}
