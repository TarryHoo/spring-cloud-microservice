package com.jake.consumer.feign.user.client;

import com.jake.consumer.feign.user.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * All rights Reserved, Designed By 特斯联观翼
 * Copyright:    Copyright(C) 2016-2018
 * Company       特斯联观翼(北京)智能科技有限公司
 *
 * @author 吴少东
 * @version 1.0
 * @date 2019-03-22 17:20
 * @Description
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping("/{id}")
    public User findByid(@RequestParam("id") Long id);
}
