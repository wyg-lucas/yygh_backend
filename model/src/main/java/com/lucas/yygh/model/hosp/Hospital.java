package com.lucas.yygh.model.hosp;

import com.alibaba.fastjson.JSONObject;
import com.lucas.yygh.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/8
 */

@Data
@ApiModel(description = "Hospital")
@Document("Hospital")
public class Hospital extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "医院编号")
    @Indexed(unique = true)
    private String hoscode;

    @ApiModelProperty(value = "医院名称")
    @Indexed //普通索引
    private String hosname;

    @ApiModelProperty(value = "医院类型")
    private String hostype;

    @ApiModelProperty(value = "省code")
    private String provinceCode;

    @ApiModelProperty(value = "市code")
    private String cityCode;

    @ApiModelProperty(value = "区code")
    private String districtCode;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "医院loga")
    private String logoDate;

    @ApiModelProperty(value = "医院简介")
    private String intro;

    @ApiModelProperty(value = "坐车路线")
    private String route;

    @ApiModelProperty(value = "状态 0：未上线 1：已上线")
    private Integer status;

    @ApiModelProperty(value = "预约规则")
    private BookingRule bookingRule;

    public void setbookingRule(String bookingRule) {
        this.bookingRule = JSONObject.parseObject(bookingRule, BookingRule.class);
    }



}