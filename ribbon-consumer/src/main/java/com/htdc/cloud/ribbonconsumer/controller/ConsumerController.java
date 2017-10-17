package com.htdc.cloud.ribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 * Author:Eric
 * Date:2017/8/14
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String add() {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=1&b=2", String.class).getBody();
    }
}
