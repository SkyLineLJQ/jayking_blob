/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.eurekaclient.service.impl;

import com.jayking.eurekaclient.entity.TaskListVO;
import com.jayking.eurekaclient.mapper.TaskMapper;
import com.jayking.eurekaclient.service.TaskListService;

import lombok.extern.slf4j.Slf4j;
import requestVo.TaskRequestAdditionVo;
import requestVo.TaskRequestVo;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

/**
 * Impl
 *
 * @author l00627837
 * @since 2024-08-09 15:46
 */
@Service
@Slf4j
public class TaskListServiceImpl implements TaskListService {
    @Resource
    TaskMapper taskMapper;

    @Override
    public List<TaskListVO> findTaskListByName(String name) {
        List<TaskListVO> result = taskMapper.findTaskListByName(name);
        return result;
    }

    @Override
    public List<TaskListVO> findAllTask() {
        List<TaskListVO> res = taskMapper.findAllTask();
        return res;
    }

    @Override
    public List<TaskListVO> findAllTaskByCondition(TaskRequestVo taskRequestVo) {
        List<TaskListVO> res = taskMapper.findAllTaskByCondition(taskRequestVo);
        return res;
    }

    @Override
    public TaskListVO findTaskByUuid(TaskRequestVo taskRequestVo) {
        return taskMapper.findTaskByUuid(taskRequestVo);
    }

    @Override
    public int saveOrUpdateTask(TaskRequestVo taskRequestVo) {
        try {
            String uuid = taskRequestVo.getUuid();
            if (StringUtils.isEmpty(uuid)) {
                UUID id = UUID.randomUUID();
                log.info("prepare insert new task:" + id.toString());
                taskRequestVo.setUuid(id.toString());
            }
            taskMapper.saveOrUpdateTask(taskRequestVo);
        } catch (Exception e) {
            log.error("insert or update is exception, taskRequest is:" + taskRequestVo.toString() + ", error is:"
                    + ExceptionUtils.getStackTrace(e));
            return -1;
        }
        return 0;
    }

    @Override
    public int batchDeleteTaskByUuid(TaskRequestAdditionVo taskRequestAdditionVo) {
        try {
            taskMapper.deleteTaskByUuids(taskRequestAdditionVo);
        } catch (Exception e) {
            log.error("delete task is exception, err reason is:" + ExceptionUtils.getStackTrace(e));
            return -1;
        }
        return 0;
    }
}
