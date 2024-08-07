/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 *
 * @author l00627837
 * @since 2024-08-05 10:45
 */
@RestController
public class TestController {
    @Value("${server.port}")
    String port;


    @RequestMapping(value = "/support",method = RequestMethod.GET)
    public String home(@RequestParam String name)
    {
        return "hi " + name + ",i am from port:" + port;
    }
}
