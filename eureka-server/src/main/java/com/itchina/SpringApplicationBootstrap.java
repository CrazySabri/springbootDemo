package com.itchina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: sabri
 * @date: 2018/11/12 23:22
 * @description: 耐得住寂寞，守得住繁华--寂寞高手
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringApplicationBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationBootstrap.class, args);
    }
}
