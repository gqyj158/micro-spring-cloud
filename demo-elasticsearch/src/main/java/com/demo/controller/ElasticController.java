package com.demo.controller;

import com.demo.async.AsyncTaskService;
import com.demo.service.ElasticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/10/06:45
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo.controller
 */
@RestController
@RequestMapping
public class ElasticController {

    @Autowired
    ElasticService elasticService;

    @PostMapping("save")
    public void save(){
        elasticService.save();
    }

    @GetMapping("async")
    public void async(){
        AsyncTaskService service = new AsyncTaskService();
        service.sendMessage();
    }
}
