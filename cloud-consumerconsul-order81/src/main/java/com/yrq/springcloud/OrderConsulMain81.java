package com.yrq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-10 16:46
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain81 {
     public static void main(String[] args) {
             SpringApplication.run(OrderConsulMain81.class, args);
         }

}
