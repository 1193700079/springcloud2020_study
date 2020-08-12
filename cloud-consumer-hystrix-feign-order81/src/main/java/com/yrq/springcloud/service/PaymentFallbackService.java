package com.yrq.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-12 11:16
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back paymentInfo_Timeout,o(╥﹏╥)o";
    }
}
