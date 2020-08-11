package com.yrq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-11 20:34
 **/
@SpringBootApplication
@EnableFeignClients
public class OrderFeign81 {
     public static void main(String[] args) {
             SpringApplication.run(OrderFeign81.class, args);
         }
}
