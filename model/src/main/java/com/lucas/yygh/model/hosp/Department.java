package com.lucas.yygh.model.hosp;

import com.lucas.yygh.model.base.BaseMongoEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.management.ValueExp;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/20
 */

@Data
@ApiModel(description = "Department")
@Document("Department")
public class Department extends BaseMongoEntity {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "医院编号")
    @Indexed
    private String hosCode;
    
    @ApiModelProperty(value = "科室编号")
    @Indexed(unique = true) //唯一索引
    private String depcode;
    
    @ApiModelProperty(value = "科室名称")
    private String depname;
    
    @ApiModelProperty(value = "科室描述")
    private String intro;
    
    @ApiModelProperty(value = "大科室编号")
    private String bigcode;
    
    @ApiModelProperty(value = "大科室名称")
    private String bigname;
    
    public String getDepcode() {
        return depcode;
    }
    
    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }
    
    public String getDepname() {
        return depname;
    }
    
    public void setDepname(String depname) {
        this.depname = depname;
    }
    
    public String getIntro() {
        return intro;
    }
    
    public void setIntro(String intro) {
        this.intro = intro;
    }
    
    public String getBigcode() {
        return bigcode;
    }
    
    public void setBigcode(String bigcode) {
        this.bigcode = bigcode;
    }
    
    public String getBigname() {
        return bigname;
    }
    
    public void setBigname(String bigname) {
        this.bigname = bigname;
    }
    
    public void setHoscode(String hoscode) {
        this.hosCode = hoscode;
    }
    
    public String getHoscode() {
        return hosCode;
    }
}
