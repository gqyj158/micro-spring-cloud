package com.demo.doc;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/10/06:51
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo.doc
 */
@Data
@Document(indexName = "bookinfo",type = "_doc")
public class BookInfo {

    @Id
    private String id;

    @Field(type = FieldType.Text,analyzer = "ik_smart")
    private String bookname;

    @Field(type = FieldType.Keyword)
    private String author;

    @Field(type = FieldType.Keyword)
    private String isbn;

    private String price;

}
