package com.yrq.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-10 17:36
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule(); //定义为随机
    }
}
