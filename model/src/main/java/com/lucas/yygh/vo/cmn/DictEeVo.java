package com.lucas.yygh.vo.cmn;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/11
 */


@Data
public class DictEeVo {
    
    @ExcelProperty(value = "id", index = 0)
    private Long id;
    
    @ExcelProperty(value = "上级ID", index = 1)
    private Long parentId;
    
    @ExcelProperty(value = "名称", index = 2)
    private String name;
    
    @ExcelProperty(value = "值", index = 3)
    private String value;
    
    @ExcelProperty(value = "编码", index = 4)
    private String dictCode;
    
}
