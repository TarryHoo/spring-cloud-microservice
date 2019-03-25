package com.jake.consumer.ribbon.hystrix.user.service;

import com.jake.consumer.ribbon.hystrix.user.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * All rights Reserved, Designed By 特斯联观翼
 * Copyright:    Copyright(C) 2016-2018
 * Company       特斯联观翼(北京)智能科技有限公司
 *
 * @author 吴少东
 * @version 1.0
 * @date 2019-03-25 09:15
 * @Description
 */
@Service
public class RibbonHystrixService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id) {
        return restTemplate.getForObject("http://microservice-provider-user/"+id, User.class);
    }

    public User fallback(Long id) {
        System.out.println("Hystrix Exception. call back!");
        User user = new User();

        user.setId(-1L);
        user.setUsername("Fallback Username");
        user.setAge(0);

        return user;
    }
}
