package com.ljc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka001Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka001Application.class, args);
        System.out.println("eureka001 running ......");
    }

}
