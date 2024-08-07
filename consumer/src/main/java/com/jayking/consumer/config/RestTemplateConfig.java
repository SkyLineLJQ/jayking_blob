/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Demo
 *
 * @author l00627837
 * @since 2024-08-06 09:23
 */
@Configuration
@Component
public class RestTemplateConfig {
    @Bean(value = "restTemplate")
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
