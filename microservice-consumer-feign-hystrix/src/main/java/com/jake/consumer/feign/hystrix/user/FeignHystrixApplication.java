package com.jake.consumer.feign.hystrix.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * All rights Reserved, Designed By 特斯联观翼
 * Copyright:    Copyright(C) 2016-2018
 * Company       特斯联观翼(北京)智能科技有限公司
 *
 * @author 吴少东
 * @version 1.0
 * @date 2019-03-22 17:18
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class FeignHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixApplication.class, args);
    }
}
