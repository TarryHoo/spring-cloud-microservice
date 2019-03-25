package com.jake.consumer.ribbon.user.service;

import com.jake.consumer.ribbon.user.entity.User;
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
 * @date 2019-03-22 17:06
 * @Description
 */
@Service
public class UserRibbonService {

    @Resource
    private RestTemplate restTemplate;

    public User findById(Long id) {

        return restTemplate.getForObject(String.format("http://microservice-provider-user/%s",id), User.class);
    }
}
