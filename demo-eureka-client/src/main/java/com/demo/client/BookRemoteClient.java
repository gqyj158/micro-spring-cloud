package com.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/14/23:44
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo.client
 */
@FeignClient(value = "demo-book-service",fallback = BookRemoteClientFallBack.class)
public interface BookRemoteClient {

    @GetMapping("/book/hello")
    String hello();
}
