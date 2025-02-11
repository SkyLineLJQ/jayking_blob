/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.eurekaclient.service;

import com.jayking.eurekaclient.entity.TaskListVO;

import requestVo.TaskRequestAdditionVo;
import requestVo.TaskRequestVo;

import java.util.List;

/**
 * Service
 *
 * @author l00627837
 * @since 2024-08-09 15:45
 */
public interface TaskListService {
    List<TaskListVO> findTaskListByName(String name);

    List<TaskListVO> findAllTask();

    List<TaskListVO> findAllTaskByCondition(TaskRequestVo taskRequestVo);

    TaskListVO findTaskByUuid(TaskRequestVo taskRequestVo);

    int saveOrUpdateTask(TaskRequestVo taskRequestVo);

    int batchDeleteTaskByUuid(TaskRequestAdditionVo taskRequestAdditionVo);
}
