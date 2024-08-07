/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.consumer.controller;

import com.jayking.consumer.service.ProviderAppClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * DEMO
 *
 * @author l00627837
 * @since 2024-08-06 08:55
 */
@RequestMapping("/consumer")
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    //注入该 feign 接口对象
    @Resource
    private ProviderAppClient providerAppClient;

    @RequestMapping("/getData1/")
    public String GetData1() {

        //采用 restTemplate 调用 PROVIDER-APP 的接口
        String url = "http://SERVICE-SUPPORT/support?name=sss";
        String result = restTemplate.getForEntity(url, String.class).getBody();
        return "remark, 采用 restTemplate 调用返回的结果" + result;
    }

    @RequestMapping("/getData2/")
    public String GetData2() {

        //采用 feign 的接口中的方法，实现对 PROVIDER-APP 服务接口的调用
        String result = providerAppClient.getProviderData();
        return "remark, 采用 feign 声明式接口调用返回的结果是:" + result;
    }
}
