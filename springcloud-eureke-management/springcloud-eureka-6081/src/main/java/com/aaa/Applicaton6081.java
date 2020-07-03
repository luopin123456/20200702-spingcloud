package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Applicaton6081 {
    public static void main(String[] args) {
        SpringApplication.run(Applicaton6081.class,args);
    }

}
