package com.yrq.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-11 21:58
 **/
@Service

public class PaymentService {
    public String paymentInfo_OK(Integer id) {
        return "线程池： " + Thread.currentThread().getName()
                + " paymentInfo_OK,id:" + id + " 正常访问！";
    }
    public String paymentInfo_Timeout(Integer id) {

        int timeout = 3;
        try {  TimeUnit.SECONDS.sleep(timeout); }
        catch (InterruptedException e) { e.printStackTrace();}
        return "线程池： " + Thread.currentThread().getName()
                + " paymentInfo_Timeout,id:" + id + " 正常访问！ 耗时"+timeout;
    }

}
