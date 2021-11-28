package com.lucas.yygh.common.exception;

import com.lucas.yygh.common.resule.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/21
 */


@Data
@ApiModel(description = "自定义全局异常类")
public class YyghException extends RuntimeException {
    
    private Integer code;
    
    /**
     * 通过状态码和错误消息创建异常对象
     * @param message
     * @param code
     */
    public YyghException(String message, Integer code) {
        super(message);
        this.code = code;
    }
    
    /**
     * 接受枚举类型的对象
     */
    public YyghException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }
    
    
    @Override
    public String toString() {
        return "YyghException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }


}
