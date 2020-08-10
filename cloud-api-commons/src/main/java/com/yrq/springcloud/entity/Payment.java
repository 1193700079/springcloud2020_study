package com.yrq.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-08 20:19
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
//实现序列化 在微服务当中
public class Payment  implements Serializable {
    private Long id;
    private String serial;
}
