package com.yrq.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: cloud2020
 * @description:
 * @author: yrq
 * @create: 2020-08-10 21:40
 **/
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        } while(!this.atomicInteger.compareAndSet(current,next));
        //两个相等就返回false 对于compareAndSet
//        do {
//            current = this.atomicInteger.get();
//            next = current + 1;
//        } while(current==next);
//        atomicInteger.set(next);
        System.out.println("****第几次访问，次数next: " + next);
        return  next;
    }
    @Override
    public ServiceInstance getServiceInstance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
