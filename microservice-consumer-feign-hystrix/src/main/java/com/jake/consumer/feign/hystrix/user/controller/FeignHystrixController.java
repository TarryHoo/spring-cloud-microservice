package com.jake.consumer.feign.hystrix.user.controller;

import com.jake.consumer.feign.hystrix.user.client.UserFeignHystrixClient;
import com.jake.consumer.feign.hystrix.user.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * All rights Reserved, Designed By 特斯联观翼
 * Copyright:    Copyright(C) 2016-2018
 * Company       特斯联观翼(北京)智能科技有限公司
 *
 * @author 吴少东
 * @version 1.0
 * @date 2019-03-22 17:22
 * @Description
 */
@RestController
public class FeignHystrixController {

    @Resource
    private UserFeignHystrixClient userFeignClient;

    @GetMapping("/feign/hystrix/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findByid(id);
    }
}
