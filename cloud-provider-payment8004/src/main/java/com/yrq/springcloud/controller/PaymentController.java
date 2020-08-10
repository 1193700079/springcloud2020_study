package com.yrq.springcloud.controller;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-08 20:46
 **/

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper:" + serverPort + "\t"
                + UUID.randomUUID().toString();
    }
}
