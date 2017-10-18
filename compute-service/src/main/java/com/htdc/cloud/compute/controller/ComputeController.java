package com.htdc.cloud.compute.controller;

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

    @GetMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return b + a;
    }

}
