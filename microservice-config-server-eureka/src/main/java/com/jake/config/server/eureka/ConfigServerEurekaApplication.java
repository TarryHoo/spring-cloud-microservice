package com.jake.config.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * All rights Reserved, Designed By 特斯联观翼
 * Copyright:    Copyright(C) 2016-2018
 * Company       特斯联观翼(北京)智能科技有限公司
 *
 * @author 吴少东
 * @version 1.0
 * @date 2019-03-25 16:40
 * @Description
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaApplication.class, args);
    }
}
