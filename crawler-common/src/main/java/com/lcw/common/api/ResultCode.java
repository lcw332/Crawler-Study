package com.lcw.common.api;


public enum ResultCode implements IErrorCode{

    SUCCESS(200,"操作成功",System.currentTimeMillis()),
    FAILED(500,"请求失败,服务器内部错误",System.currentTimeMillis()),
    FORBIDDEN(403,"没有相关权限,或者Token已过期",System.currentTimeMillis()),
    REQUEST_TIME_OUT(408,"服务请求超时",System.currentTimeMillis());

    private long code;
    private String message;
    private long timeStamp;

    ResultCode(long code, String message, long timeStamp) {
        this.code = code;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}