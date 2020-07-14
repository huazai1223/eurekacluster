package com.jiadonghua.eurekacluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StartEurekaServe1 {
    public static void main(String[] args) {
        System.out.println("注册中心1启动了");
        SpringApplication.run(StartEurekaServe1.class);
    }
}
