package com.yrq.springcloud.service.impl;

import com.yrq.springcloud.dao.PaymentDao;
import com.yrq.springcloud.entity.Payment;
import com.yrq.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-08 20:43
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int save(Payment payment){
        return paymentDao.save(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }


}
