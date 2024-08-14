/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package requestVo;

import lombok.Data;

import java.util.Date;

/**
 * req
 *
 * @author l00627837
 * @since 2024-08-14 10:46
 */
@Data
public class TaskRequestVo {
    private String name;

    private String status;

    private Date dueData;

    private String priority;
}
