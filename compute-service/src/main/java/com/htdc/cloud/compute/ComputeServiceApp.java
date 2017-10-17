package com.htdc.cloud.compute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 * Author:Eric
 * Date:2017/8/14
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ComputeServiceApp.class, args);
    }
}
