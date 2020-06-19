package com.lcw.common.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By lcw332
 * Time : 2020 06 18 20:46
 * Describe : 通用返回对象
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private long code;
    private String message;
    private long ts;
    private T data;

    /**
     * 成功请求返回
     * @param data 任意值
     * @param <T> 任意返回类型
     * @return 操作成功
     */
    public static <T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),ResultCode.SUCCESS.getTimeStamp(),data);
    }

    /**
     * 失败请求返回
     * @param data 任意值
     * @param <T> 任意返回类型
     * @return 操作失败
     */
    public static <T> CommonResult<T> failed(T data){
        return new CommonResult<T>(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMessage(),ResultCode.FAILED.getTimeStamp(),data);
    }

    /**
     * 越权请求返回
     * @param data 任意值
     * @param <T> 任意返回类型
     * @return 越权请求
     */
    public static <T> CommonResult<T> forbidden(T data){
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(),ResultCode.FORBIDDEN.getMessage(),ResultCode.FORBIDDEN.getTimeStamp(),data);
    }

    /**
     * 请求超时返回
     * @param data 任意值
     * @param <T> 任意返回类型
     * @return 请求超时返回
     */
    public static <T> CommonResult<T> requestTimeOut(T data){
        return new CommonResult<T>(ResultCode.REQUEST_TIME_OUT.getCode(),ResultCode.REQUEST_TIME_OUT.getMessage(),ResultCode.REQUEST_TIME_OUT.getTimeStamp(),data);
    }

}
