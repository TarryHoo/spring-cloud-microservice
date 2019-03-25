package com.jake.config.client.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * All rights Reserved, Designed By 特斯联观翼
 * Copyright:    Copyright(C) 2016-2018
 * Company       特斯联观翼(北京)智能科技有限公司
 *
 * @author 吴少东
 * @version 1.0
 * @date 2019-03-25 16:46
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApplication.class, args);
    }
}
