package com.lucas.yygh.cmn.controller;

import com.lucas.yygh.cmn.service.DictService;
import com.lucas.yygh.common.resule.Result;
import com.lucas.yygh.model.cmn.Dict;
import io.swagger.annotations.Api;
import jdk.jfr.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/10
 */

@RestController
@RequestMapping("/admin/cmn/dict")
@Api(description = "数据字典接口")
public class DictController {
    
    @Autowired
    private DictService dictService;
    
    public Result importDict(MultipartFile file) {
        dictService.importDictData(file);
        return Result.ok();
    }


}
