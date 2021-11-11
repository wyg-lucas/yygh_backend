package com.lucas.easyexcel;

import com.alibaba.excel.EasyExcel;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/11
 */


public class TestRead {
    public static void main(String[] args) {
        //文件路径
        String fileName = "D://1.xlsx";
        //调用方法实现读取操作
        EasyExcel.read(fileName, UserData.class, new ExcelListener()).sheet().doRead();
    }
}
