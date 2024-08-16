/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.consumer.controller;

import com.jayking.consumer.service.ProviderAppClient;

import lombok.extern.slf4j.Slf4j;
import requestVo.TaskRequestAdditionVo;
import requestVo.TaskRequestVo;
import responseVo.ResponseRest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TaskWorkController
 *
 * @author l00627837
 * @since 2024-08-14 17:39
 */
@RequestMapping("/taskWork")
@RestController
@Slf4j
public class TaskWorkController {
    // 注入该 feign 接口对象
    @Resource
    private ProviderAppClient providerAppClient;

    /**
     * 根据名称查找任务列表
     *
     * @param taskRequest req
     * @return res
     */
    @RequestMapping("/getTaskListByName/")
    public ResponseRest getTaskListByName(@RequestBody TaskRequestVo taskRequest) {
        log.info("start query task list by name:" + taskRequest.toString());
        Object result = providerAppClient.getTaskByName(taskRequest);
        return ResponseRest.success(result);
    }

    /**
     * Query All Task
     *
     * @param taskRequestVo taskVo
     * @return res
     */
    @RequestMapping(value = "/getAllTaskList/", method = RequestMethod.POST)
    public ResponseRest getAllTaskList(@RequestBody TaskRequestVo taskRequestVo) {
        log.info("start query task list, and query params is:" + taskRequestVo.toString());
        Object result = providerAppClient.getTaskByCondition(taskRequestVo);
        return ResponseRest.success(result);
    }

    /**
     * Query Single Task
     *
     * @param taskRequestVo taskVo
     * @return res
     */
    @RequestMapping(value = "/getTaskDetailById/", method = RequestMethod.POST)
    public ResponseRest getTaskDetailById(@RequestBody TaskRequestVo taskRequestVo) {
        log.info("start query task list, and query params uuid is:" + taskRequestVo.getUuid());
        Object result = providerAppClient.getTaskDetailById(taskRequestVo);
        return ResponseRest.success(result);
    }

    /**
     * Query Single Task
     *
     * @param taskRequestVo taskVo
     * @return res
     */
    @RequestMapping(value = "/insertOrUpdateTask/", method = RequestMethod.POST)
    public ResponseRest insertOrUpdateTASK(@RequestBody TaskRequestVo taskRequestVo) {
        log.info("start insert or update task:" + taskRequestVo.toString());
        Object result = providerAppClient.insertOrUpdateTask(taskRequestVo);
        return ResponseRest.success(result);
    }

    /**
     * Query Single Task
     *
     * @param taskRequestAdditionVo taskVo
     * @return res
     */
    @RequestMapping(value = "/batchDeleteTaskByUuids/", method = RequestMethod.POST)
    public ResponseRest batchDeleteTaskByUuids(@RequestBody TaskRequestAdditionVo taskRequestAdditionVo) {
        log.info("start batch delete task:" + taskRequestAdditionVo.toString());
        Object result = providerAppClient.batchDeleteTaskByUuids(taskRequestAdditionVo);
        return ResponseRest.success(result);
    }

}
