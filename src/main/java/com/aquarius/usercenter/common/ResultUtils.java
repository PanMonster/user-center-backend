package com.aquarius.usercenter.common;

/**
 * 返回工具类
 *
 * @author aquarius
 */
public class ResultUtils {

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

}
