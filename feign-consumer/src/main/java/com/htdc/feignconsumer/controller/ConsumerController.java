package com.htdc.feignconsumer.controller;

import com.htdc.feignconsumer.interf.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author:Eric
 * Date:2017/8/14
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeClient computeClient;

    @GetMapping("/add")
    public Integer add() {
        return computeClient.add(1, 2);
    }
}
