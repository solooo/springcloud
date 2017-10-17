package com.htdc.feignconsumer.interf;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description:
 * Author:Eric
 * Date:2017/8/14
 */
@FeignClient("compute-service")
public interface ComputeClient {

    @GetMapping("/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
