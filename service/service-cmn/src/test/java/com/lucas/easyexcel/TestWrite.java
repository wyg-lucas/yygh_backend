package com.lucas.easyexcel;

import com.alibaba.excel.EasyExcel;
import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/10
 */


public class TestWrite {
    
    public static void main(String[] args) {
        String fileName = "D:\\1.xlsx";
        List<UserData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserData user = new UserData();
            user.setUid(i);
            user.setName("lucas" + i);
            list.add(user);
        }
    
        EasyExcel.write(fileName, UserData.class).sheet("用户信息")
                .doWrite(list);
    }
}
