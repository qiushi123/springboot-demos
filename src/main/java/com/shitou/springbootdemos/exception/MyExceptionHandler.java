package com.shitou.springbootdemos.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * Created by qcl on 2019-06-12
 * 微信：2501902696
 * desc: 捕获全局异常
 */
@ControllerAdvice//controller增强器，用来捕获controller里的异常
public class MyExceptionHandler {

    @ResponseBody
    @ResponseStatus
    @ExceptionHandler(Exception.class)
    public String handlerMethodArgumentException(Exception e) {
        System.out.println(e.getClass().getName());
        if (e instanceof MaxUploadSizeExceededException) {
            return "文件过大";
        }
        return "错误信息：" + e.getMessage();
    }
}

