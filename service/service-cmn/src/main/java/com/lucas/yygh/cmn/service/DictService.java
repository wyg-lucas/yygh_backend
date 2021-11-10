package com.lucas.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lucas.yygh.model.cmn.Dict;
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


public interface DictService extends IService<Dict> {
    
    //根据数据ID查询子数据列表
    List<Dict> findChildData(Long id);
    
    //导出数据字典接口
    void exportDictData(HttpServletResponse response);
    
    //导入数据字典
    void importDictData(MultipartFile data);
    
    //根据dictCode和value查询
    String getDictName(String dictCode, String value);
    
    //根据dictCode获取下级节点
    List<Dict> findByDictCode(String dictCode);
    
    
}
