package com.demo.client;

import org.springframework.stereotype.Component;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/15/00:05
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo.client
 */
@Component
public class BookRemoteClientFallBack implements BookRemoteClient{
    @Override
    public String hello() {
        return "fail";
    }
}
