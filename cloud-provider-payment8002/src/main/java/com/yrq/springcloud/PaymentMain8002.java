package com.yrq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-10 11:21
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
     public static void main(String[] args) {
             SpringApplication.run(PaymentMain8002.class, args);
         }
}
