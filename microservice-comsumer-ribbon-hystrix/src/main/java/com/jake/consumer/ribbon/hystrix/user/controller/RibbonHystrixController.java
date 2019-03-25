package com.jake.consumer.ribbon.hystrix.user.controller;

import com.jake.consumer.ribbon.hystrix.user.entity.User;
import com.jake.consumer.ribbon.hystrix.user.service.RibbonHystrixService;
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
 * @date 2019-03-25 09:22
 * @Description
 */
@RestController
public class RibbonHystrixController {

    @Resource
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbon/hystrix/{id}")
    public User findById(@PathVariable Long id){
        return ribbonHystrixService.findById(id);
    }
}
