package com.yrq.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-08 20:24
 **/
@Data
@NoArgsConstructor   //无参构造器
@AllArgsConstructor    //全参构造器
//json 类 给前端的
public class CommonResult<T> {

    private Integer code;
    private String message;
    private  T    data;

    //自定义一个两个参数的构造器
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
