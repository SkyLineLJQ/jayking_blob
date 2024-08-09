/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.eurekaclient.service.impl;

import com.jayking.eurekaclient.entity.TaskListVO;
import com.jayking.eurekaclient.mapper.TaskMapper;
import com.jayking.eurekaclient.service.TaskListService;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * Impl
 *
 * @author l00627837
 * @since 2024-08-09 15:46
 */
@Service
public class TaskListServiceImpl implements TaskListService {
    @Resource
    TaskMapper taskMapper;

    @Override
    public TaskListVO findTaskListByName(String name) {
        TaskListVO result = taskMapper.findTaskListByName(name);
        return null;
    }

    @Override
    public List<TaskListVO> findAllTask() {
        List<TaskListVO> res = taskMapper.findAllTask();
        return res;
    }
}
