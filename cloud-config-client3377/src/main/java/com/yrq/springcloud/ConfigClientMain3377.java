package com.yrq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-12 21:30
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3377.class,args);
    }
}
