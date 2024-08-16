/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package requestVo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 扩展列
 *
 * @author l00627837
 * @since 2024-08-16 11:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TaskRequestAdditionVo extends TaskRequestVo{
    private List<String> uuidList;
}
