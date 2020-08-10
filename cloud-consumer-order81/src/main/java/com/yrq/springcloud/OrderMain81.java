package com.yrq.springcloud;

import com.yrq.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-09 15:03
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain81 {
     public static void main(String[] args) {
             SpringApplication.run(OrderMain81.class, args);
         }
}
