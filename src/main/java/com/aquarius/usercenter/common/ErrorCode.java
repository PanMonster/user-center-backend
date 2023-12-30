package com.aquarius.usercenter.common;

/**
 * 错误码
 *
 * @author aquarius
 */
public enum ErrorCode {

    SUCCESS(20000, "success!", ""),
    PARAMS_ERROR(40000, "请求参数错误", ""),
    NULL_ERROR(40001, "数据为空", ""),
    NO_LOGON(40100, "未登录", ""),
    NO_AUTH(40101, "无权限访问", ""),
    SYSTEM_ERROR(50000, "系统内部异常", ""),
    ;

    /**
     * 状态码
     */
    private final int code;

    /**
     * 状态码信息
     */
    private final String message;

    /**
     * 错误描述
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
