package com.aquarius.usercenter.common;

/**
 * 返回工具类
 *
 * @author aquarius
 */
public class ResultUtils {

    /**
     * 成功
     *
     * @param data 返回数据
     * @param <T>  泛形
     * @return 统一返回类信息
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(20000, data, "ok");
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @return 统一返回类信息
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

}
