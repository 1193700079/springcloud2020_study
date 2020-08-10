package com.yrq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-09 15:03
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderMain81 {
     public static void main(String[] args) {
             SpringApplication.run(OrderMain81.class, args);
         }
}
