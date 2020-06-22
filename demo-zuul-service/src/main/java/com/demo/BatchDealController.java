package com.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoyang
 * @email gaoy@hb-sx.net
 * @date 2020/2020/6/18/16:53
 * @copyright ©2019 版权所属 华博胜讯信息科技股份有限公司
 * @description com.demo
 */
public class BatchDealController {

    public static void main(String[] args) {
        String filepath = "/Users/environment/三11班";
        getFiles(filepath);
//        String name = "一1 杨知恒.jpg";
//        name =name.replace("一1","");
//        System.out.println(name.trim());

    }



    public static void getFiles(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if(files[i].isDirectory()) {
                    System.out.println("目录："+ files[i].getPath());
                    getFiles(files[i].getPath());
                }else{
                    String fileName = files[i].getName();
                    String newName = fileName.replace("三(11)班-","").trim();
                    File f_new = new File(files[i].getParent(), newName);
                    files[i].renameTo(f_new);
                }
            }
        }else{
            System.out.println("文件："+ file.getPath());
        }
    }


}
