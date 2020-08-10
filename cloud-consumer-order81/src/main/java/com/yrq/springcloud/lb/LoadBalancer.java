package com.yrq.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {
    ServiceInstance getServiceInstance(List<ServiceInstance> serviceInstances);
}
