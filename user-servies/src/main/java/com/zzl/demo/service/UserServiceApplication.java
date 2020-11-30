package com.zzl.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zzl
 * @version 1.0
 * @date 2020/11/30 21:30
 * @describe
 */
@SpringBootApplication
//@EnableEurekaClient //只支持eurekaClient
@EnableDiscoveryClient

public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
