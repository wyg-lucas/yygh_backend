package com.lucas.yygh.vo.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/21
 */
@Data
@ApiModel(description = "签名信息")
public class SignInfoVo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "api基础路径")
    private String apiUrl;
    
    @ApiModelProperty(value = "签名密钥")
    private String signKey;
    
    
    
    
}
