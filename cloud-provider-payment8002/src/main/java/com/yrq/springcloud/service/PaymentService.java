package com.yrq.springcloud.service;

import com.yrq.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int save(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
