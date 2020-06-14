package com.demo.dao;

import com.demo.doc.BookInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/10/06:51
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo.dao
 */
public interface ElasticMapper extends ElasticsearchRepository<BookInfo,String> {
}
