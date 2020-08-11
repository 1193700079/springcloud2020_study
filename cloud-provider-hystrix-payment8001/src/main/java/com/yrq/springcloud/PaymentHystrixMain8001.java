package com.yrq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-11 21:57
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8001 {
     public static void main(String[] args) {
             SpringApplication.run(PaymentHystrixMain8001.class, args);
         }

}
