package com.lucas.yygh.hosp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lucas.yygh.model.hosp.HospitalSet;
import com.lucas.yygh.vo.order.SignInfoVo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/8
 */


public interface HospitalSetService extends IService<HospitalSet> {
    
    //2 根据传递过来医院编码，查询数据库，查询签名
    String getSignKey(String hoscode);
    
    //获取医院签名信息
    SignInfoVo getSignInfoVo(String hoscode);
    

}
