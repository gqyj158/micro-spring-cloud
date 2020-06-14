package com.demo.exception;

import org.apache.http.protocol.ResponseDate;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/11/07:26
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo.exception
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map defaultErrorHandler(HttpServletRequest request,Exception e){
        Map map = new HashMap();
        map.put("code",404);
        map.put("message",e.getMessage());
        map.put("data",null);
        map.put("status",false);
        return map;
    }
}
