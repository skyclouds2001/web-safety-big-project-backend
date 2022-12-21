package org.fly.sky.handler;

import jakarta.servlet.http.HttpServletRequest;
import org.fly.sky.common.RequestCode;
import org.fly.sky.common.RequestResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public RequestResult exceptionHandler(HttpServletRequest httpServletRequest, Exception e) {
        logger.error("服务错误: ", e);
        return new RequestResult(RequestCode.FAILURE, null);
    }

}
