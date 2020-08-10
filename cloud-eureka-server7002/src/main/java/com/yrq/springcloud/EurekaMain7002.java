package com.yrq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-10 11:06
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
     public static void main(String[] args) {
             SpringApplication.run(EurekaMain7002.class, args);
         }
}
