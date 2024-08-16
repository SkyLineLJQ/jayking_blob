/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.eurekaclient.controller;

import com.jayking.eurekaclient.entity.TaskListVO;
import com.jayking.eurekaclient.service.TaskListService;

import lombok.extern.slf4j.Slf4j;
import requestVo.TaskRequestAdditionVo;
import requestVo.TaskRequestVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TaskController
 *
 * @author l00627837
 * @since 2024-08-09 15:49
 */
@RestController
@RequestMapping("/task")
@Slf4j
public class TaskController {

    @Autowired
    private TaskListService taskListService;

    @PostMapping("/getAllTask")
    public List<TaskListVO> findAllTask() {
        log.info("start query all task...");
        List<TaskListVO> res = taskListService.findAllTask();
        return res;
    }

    @PostMapping("/getTaskByName")
    public List<TaskListVO> findTaskByName(@RequestBody TaskRequestVo taskRequest) {
        log.info("start query task by name..." + taskRequest.toString());
        List<TaskListVO> res = taskListService.findTaskListByName(taskRequest.getName());
        return res;
    }

    @PostMapping("/getTaskByCondition")
    public List<TaskListVO> findTaskByCondition(@RequestBody TaskRequestVo taskRequest) {
        log.info("start query task by name..." + taskRequest.toString());
        List<TaskListVO> res = taskListService.findAllTaskByCondition(taskRequest);
        return res;
    }

    @PostMapping("/geTaskDetailsById")
    public TaskListVO findTaskDetailsById(@RequestBody TaskRequestVo taskRequestVo){
        log.info("start to query task by uuid:" + taskRequestVo.getUuid());
        return taskListService.findTaskByUuid(taskRequestVo);
    }

    @PostMapping("/insertOrUpdateTask")
    public int insertOrUpdateTask(@RequestBody TaskRequestVo taskRequestVo){
        log.info("start to insert or update task:" + taskRequestVo.toString());
        return taskListService.saveOrUpdateTask(taskRequestVo);
    }

    @PostMapping("/batchDeleteTaskByUuids")
    public int batchDeleteTaskByUuids(@RequestBody TaskRequestAdditionVo taskRequestAdditionVo){
        log.info("start to batch delete task:" + taskRequestAdditionVo.toString());
        return taskListService.batchDeleteTaskByUuid(taskRequestAdditionVo);
    }
}
