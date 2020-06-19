package com.lcw.common.exception;

import com.lcw.common.api.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created By lcw332
 * Time : 2020 06 18 22:13
 * Describe : 全局异常处理
 **/
@RestControllerAdvice(value = {"com.lcw.member.controller"})
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(ApiException.class)
    public CommonResult handler(ApiException e){
        if (e.getErrorCode() != null){
            return CommonResult.failed(e.getErrorCode());
        }
        return CommonResult.failed(e.getErrorCode());
    }
}
