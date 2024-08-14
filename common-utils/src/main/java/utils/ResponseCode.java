/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package utils;

/**
 * 响应枚举
 *
 * @author l00627837
 * @since 2024-08-14 15:03
 */
public enum ResponseCode {
    /* 成功状态码 */
    SUCCESS(0, "Successful"),
    FAIL(-1, "Request is failed"),
    TOKEN_INVALID(401, "Token is null or invalid");

    private Integer code;
    private String message;
    ResponseCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }
}
