package com.demo.service;

import com.demo.dao.ElasticMapper;
import com.demo.doc.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/10/06:50
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo.service
 */
@Service
public class ElasticService {

    @Autowired
    ElasticMapper mapper;

    @Autowired
    ElasticsearchRestTemplate elasticsearchTemplate;

    public void save(){
        BookInfo bookInfo=new BookInfo();
        bookInfo.setId(UUID.randomUUID().toString());
        bookInfo.setBookname("SPRING CLOUD");
        bookInfo.setAuthor("glosing");
        bookInfo.setIsbn("783199302348");
        bookInfo.setPrice("32.00");
        mapper.save(bookInfo);
    }

}
