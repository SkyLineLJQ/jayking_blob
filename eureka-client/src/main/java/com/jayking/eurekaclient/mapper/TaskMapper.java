/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.eurekaclient.mapper;

import com.jayking.eurekaclient.entity.TaskListVO;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * mapper
 *
 * @author l00627837
 * @since 2024-08-09 15:34
 */
public interface TaskMapper {

    @Select("select * from jayking_works.tb_task where name = #{name}")
    TaskListVO findTaskListByName(String name);

    @Select("SELECT * FROM jayking_works.tb_task")
    List<TaskListVO> findAllTask();
}
