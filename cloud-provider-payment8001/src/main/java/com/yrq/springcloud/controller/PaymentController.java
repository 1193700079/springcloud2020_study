package com.yrq.springcloud.controller;


import com.yrq.springcloud.entity.CommonResult;
import com.yrq.springcloud.entity.Payment;
import com.yrq.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-08 20:46
 **/

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/save")
//    @RequestBody 这个注解很重要！！
    public CommonResult save(@RequestBody Payment payment){
        int result = paymentService.save(payment);
        log.info("****插入结果"+result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****插入结果"+payment+" 看来要保存才有啊 ");

        if (payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else {
            return new CommonResult(444,"没有对应的记录，查询ID"+id,null);
        }
    }

}
