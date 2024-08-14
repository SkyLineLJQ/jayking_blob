/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.consumer.service;

import requestVo.TaskRequestVo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Demo
 *
 * @author l00627837
 * @since 2024-08-06 08:49
 */
@FeignClient("SERVICE-SUPPORT")
public interface ProviderAppClient {
    @RequestMapping(value = "/support?name=DDD", method = RequestMethod.GET)
    String getProviderData();

    @RequestMapping(value = "/task/getTaskByName", method = RequestMethod.POST)
    Object getTaskByName(@RequestBody TaskRequestVo requestVo);
}
