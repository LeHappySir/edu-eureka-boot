package com.lagou.edu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * LagouEurekaApplication
 *
 * @author xianhongle
 * @data 2022/1/8 5:05 下午
 **/
@SpringBootApplication
@EnableEurekaServer
public class LagouEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LagouEurekaApplication.class,args);
    }

}
