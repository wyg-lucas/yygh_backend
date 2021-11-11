package com.lucas.yygh.cmn.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.lucas.yygh.cmn.mapper.DictMapper;
import com.lucas.yygh.cmn.service.DictService;
import com.lucas.yygh.model.cmn.Dict;
import com.lucas.yygh.vo.cmn.DictEeVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.Map;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/11
 * @description: 不建议把listener交给spring管理
 */


public class DictListener extends AnalysisEventListener<DictEeVo> {
    
    private DictMapper dictMapper;
    
    public DictListener(DictMapper dictMapper) {
        this.dictMapper = dictMapper;
    }
    
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
    
    }
    
    //一行一行读取
    @Override
    public void invoke(DictEeVo dictEeVo, AnalysisContext analysisContext) {
        //调用方法添加到数据库
        Dict dict = new Dict();
        BeanUtils.copyProperties(dictEeVo, dict);
        dictMapper.insert(dict);
    }
    
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    
    }
}
