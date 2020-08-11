package com.yrq.springcloud.controller;


import com.yrq.springcloud.entity.CommonResult;
import com.yrq.springcloud.entity.Payment;
import com.yrq.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/save")
//    @RequestBody 这个注解很重要！！
    public CommonResult save(@RequestBody Payment payment){
        int result = paymentService.save(payment);
        log.info("****插入结果"+result);
        if (result>0){
            return new CommonResult(200,"插入数据库成功 ,serverPort: "+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****插入结果"+payment+" 看来要保存才有啊 ");

        if (payment!=null){
            return new CommonResult(200,"查询成功,serverPort: "+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应的记录，查询ID"+id,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String s:services) {
            log.info("****elem  "+ s);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getInstanceId() +"\t" + instance.getHost()+"\t" + instance.getPort()+"\t"+ instance.getUri());
        }

        return discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {  TimeUnit.SECONDS.sleep(3); }
        catch (InterruptedException e) { e.printStackTrace();}
        return serverPort;
    }

}
