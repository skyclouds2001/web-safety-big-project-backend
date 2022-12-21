package org.fly.sky.handler;

import jakarta.servlet.http.HttpServletRequest;
import org.fly.sky.common.Code;
import org.fly.sky.common.Result;
import org.fly.sky.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author CHENSY skyclouds2001@163.com
 * @version 0.0
 * @since 0.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(HttpServletRequest httpServletRequest, Exception e) {
        logger.error("服务错误: ", e);
        return new Result(Code.FAILURE, null);
    }

    @ExceptionHandler(CustomException.class)
    public Result customExceptionHandler(HttpServletRequest httpServletRequest, CustomException e) {
        logger.error("服务错误: ", e);
        return new Result(e.getCode(), null);
    }

}
