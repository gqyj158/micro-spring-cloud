package com.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/14/23:59
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo
 */
@RestController
@RequestMapping
public class HelloController {

    @GetMapping("hello")
    @HystrixCommand(fallbackMethod = "defaultHello")
    public String hello(){
        return "hello,you are so briliant";
    }

    public String defaultHello(){
        return "fail";
    }
}
