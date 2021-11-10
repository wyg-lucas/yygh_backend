package com.lucas.yygh.vo.hosp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/8
 */


@Data
public class HospitalSetQueryVo {
    
    @ApiModelProperty(value = "医院名称")
    private String hosname;
    
    @ApiModelProperty(value = "医院编号")
    private String hoscode;
}
