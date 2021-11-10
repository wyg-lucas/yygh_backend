package com.lucas.yygh.cmn.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lucas.yygh.cmn.mapper.DictMapper;
import com.lucas.yygh.cmn.service.DictService;
import com.lucas.yygh.model.cmn.Dict;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/10
 */

@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {
    
    //根据数据ID查询子数据列表
    @Override
    public List<Dict> findChildData(Long id) {
        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", id);
        List<Dict> dictList = baseMapper.selectList(wrapper);
        //向list集合每个dict对象中设置hasChildren
        for (Dict dict : dictList) {
            Long dictId = dict.getId();
            boolean isChild = this.isChildren(dictId);
            dict.setHasChildren(isChild);
        }
        return dictList;
    
    
    }
    
    @Override
    public void exportDictData(HttpServletResponse response) {
    
    }
    
    @Override
    public void importDictData(MultipartFile data) {
    
    }
    
    @Override
    public String getDictName(String dictCode, String value) {
        return null;
    }
    
    @Override
    public List<Dict> findByDictCode(String dictCode) {
        return null;
    }
    
    //判断ID下面是否有子节点
    public boolean isChildren(Long id) {
        QueryWrapper<Dict> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_id", id);
        Integer count = baseMapper.selectCount(wrapper);
        
        return count > 0;
    }
}
