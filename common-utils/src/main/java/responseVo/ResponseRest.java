/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
 */

package responseVo;

import lombok.Data;
import utils.ResponseCode;

/**
 * 消息响应实体
 *
 * @author l00627837
 * @since 2024-08-14 14:59
 */
@Data
public class ResponseRest {
    private int code;

    private String message;

    private Object data;

    /**
     * 成功
     *
     * @return response
     */
    public static ResponseRest success() {
        ResponseRest responseRest = new ResponseRest();
        responseRest.setResultResponse(ResponseCode.SUCCESS);
        return responseRest;
    }

    /**
     * success
     *
     * @param message message
     * @param data    data
     * @return res
     */
    public static ResponseRest success(String message, Object data) {
        ResponseRest restResponse = new ResponseRest();
        restResponse.setResultResponse(ResponseCode.SUCCESS);
        restResponse.setData(data);
        restResponse.setMessage(message);
        return restResponse;

    }

    /**
     * success
     *
     * @param data data
     * @return res
     */
    public static ResponseRest success(Object data) {
        ResponseRest restResponse = new ResponseRest();
        restResponse.setResultResponse(ResponseCode.SUCCESS);
        restResponse.setData(data);
        return restResponse;

    }

    /**
     * 失败
     *
     * @return response
     */
    public static ResponseRest fail() {
        ResponseRest responseRest = new ResponseRest();
        responseRest.setResultResponse(ResponseCode.FAIL);

        return responseRest;
    }

    /**
     * succfailess
     *
     * @param message message
     * @param data    data
     * @return res
     */
    public static ResponseRest fail(String message, Object data) {
        ResponseRest restResponse = new ResponseRest();
        restResponse.setResultResponse(ResponseCode.FAIL);
        restResponse.setData(data);
        restResponse.setMessage(message);
        return restResponse;

    }

    /**
     * fail
     *
     * @param data data
     * @return res
     */
    public static ResponseRest fail(Object data) {
        ResponseRest restResponse = new ResponseRest();
        restResponse.setResultResponse(ResponseCode.FAIL);
        restResponse.setData(data);
        return restResponse;

    }

    private void setResultResponse(ResponseCode responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
    }
}
