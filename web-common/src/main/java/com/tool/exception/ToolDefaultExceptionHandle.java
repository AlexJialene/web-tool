package com.tool.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author alex-jiayu
 * @create 2017-06-08 21:26
 **/

@ControllerAdvice
public class ToolDefaultExceptionHandle {
    private static final Logger log = LoggerFactory.getLogger(ToolDefaultExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object defaultErrorHandle(HttpServletRequest req , Exception e){

        log.error("defaultErrorHandle:{}" , e.getMessage());
        return "throws error !!";

    }
}
