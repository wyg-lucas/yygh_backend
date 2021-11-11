package com.lucas.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/10
 */

@Data
public class UserData {
    
    @ExcelProperty(value = "用户编号", index = 0)
    private int uid;
    
    @ExcelProperty(value = "用户名称", index = 1)
    private String name;
}
