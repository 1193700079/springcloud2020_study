package com.yrq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-10 14:30
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
     public static void main(String[] args) {
             SpringApplication.run(PaymentMain8004.class, args);
         }
}
