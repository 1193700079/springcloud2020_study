package com.yrq.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-09 15:04
 **/
@Configuration
public class ApplicationContext {

    @Bean
//    @LoadBalanced //赋予RestTemplate 负载均衡的能力
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }
}
