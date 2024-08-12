/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.eurekaclient.requestVo;

import lombok.Data;

import java.util.Date;

/**
 * 请求体
 *
 * @author l00627837
 * @since 2024-08-12 20:50
 */
@Data
public class TaskListRequest {
    private String name;

    private String status;

    private Date dueData;

    private String priority;
}
