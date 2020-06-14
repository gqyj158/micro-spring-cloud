package com.demo.async;

import org.springframework.scheduling.annotation.Async;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/12/06:46
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo.async
 */
public class AsyncTaskService {

    @Async
    public void sendMessage(){
        System.err.println(Thread.currentThread().getName());
    }
}
