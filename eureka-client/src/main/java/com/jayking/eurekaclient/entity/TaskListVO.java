/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package com.jayking.eurekaclient.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 任务实体类
 *
 * @author l00627837
 * @since 2024-08-09 11:32
 */
@Data
@Entity
public class TaskListVO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String uuid;

    @Column
    private String name;

    @Column
    private String status;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date dueDate;

    @Column
    private String priority;

    @Column
    private String mark;

    @Column
    private String taskType;
}
