package com.lee.rbacAop.handle;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Component
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 异常处理
     */
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception ex) {

        System.out.println(ex.getMessage());
        return ex.getMessage();
    }
}
