package com.htdc.cloud.compute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description:
 * Author:Eric
 * Date:2017/8/14
 */
@SpringBootApplication
@EnableEurekaClient
public class ComputeServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ComputeServiceApp.class, args);
    }
}
