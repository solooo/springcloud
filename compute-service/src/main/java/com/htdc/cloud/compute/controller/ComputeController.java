package com.htdc.cloud.compute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author:Eric
 * Date:2017/8/14
 */
@RestController
public class ComputeController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        Integer sum = a + b;
        System.out.println("/add, host:" + instance.getHost() + ", service id:" + instance.getServiceId() + ", result:" + sum);
        return sum;
    }


}
