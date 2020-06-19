package com.lcw.common.api;

/**
 * Created By lcw332
 * Time : 2020 06 18 21:42
 * Describe :
 **/
public interface IErrorCode {
    /**
     * 获取当前Code
     */
    long getCode();

    /**
     * 获取当前message
     * @return
     */
    String getMessage();

    /**
     * 获取当前时间戳
     * @return
     */
    long getTimeStamp();

}
