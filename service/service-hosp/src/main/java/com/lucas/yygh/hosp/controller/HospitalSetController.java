package com.lucas.yygh.hosp.controller;

import com.alibaba.excel.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lucas.yygh.common.resule.Result;
import com.lucas.yygh.common.utils.MD5;
import com.lucas.yygh.hosp.service.HospitalSetService;
import com.lucas.yygh.model.hosp.HospitalSet;
import com.lucas.yygh.vo.hosp.HospitalSetQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.service.Tags;

import java.util.List;
import java.util.Random;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/8
 */

@Api(tags = "医院设置管理")
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
@CrossOrigin
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;
    
    
    /**
     * 查询医院设置表所有信息
     */
    @ApiOperation(value = "获取所有的医院设置")
    @GetMapping("findAll")
    public Result findAllHospitalSet() {
        List<HospitalSet> list = hospitalSetService.list();
        return Result.ok(list);
    }
    
    
    /**
     * 根据ID删除医院,逻辑删除
     */
    @ApiOperation(value = "逻辑删除指定医院设置")
    @DeleteMapping("{id}")
    public Result removeHospSet(@PathVariable Long id) {
        boolean flag = hospitalSetService.removeById(id);
        if (flag) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }
    
    /**
     * 带条件的分页查询
     * @param current
     * @param limit
     * @param hospitalSetQueryVo
     * @return
     */
    @ApiOperation(value = "条件分页查询")
    @PostMapping("findPage/{current}/{limit}") // post提交才能RequestBody
    public Result findPageHospSet(@PathVariable Long current,
                                  @PathVariable Long limit,
                                  //这个注解是指用JSON传参
                                  @RequestBody(required = false) HospitalSetQueryVo hospitalSetQueryVo) {
        Page<HospitalSet> page = new Page(current,limit);
        String hosname = hospitalSetQueryVo.getHosname();
        String hoscode = hospitalSetQueryVo.getHoscode();
        //条件查询
        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(hosname)) {
            wrapper.like("hosname", hosname);
        }
        if (!StringUtils.isEmpty(hoscode)) {
            wrapper.eq("hoscode",hoscode);
        }
        
        Page<HospitalSet> hospitalSetPage = hospitalSetService.page(page, wrapper);
        return Result.ok(hospitalSetPage);
    }
    
    /**
     * 添加医院设置
     * @param hospitalSet
     * @return
     */
    @PostMapping("saveHospitalSet")
    public Result saveHospital(@RequestBody HospitalSet hospitalSet) {
        // 设置状态 1：可用 0：不可用
        hospitalSet.setStatus(1);
        // 签名密钥
        Random random = new Random();
        hospitalSet.setSignKey(MD5.encrypt(System.currentTimeMillis() + "" +
                random.nextInt(1000)));
        boolean save = hospitalSetService.save(hospitalSet);
        if (save) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }
    
    /**
     * 根据ID获取医院设置
     * @param id
     * @return
     */
    @GetMapping("getHospSet/{id}")
    public Result getHospSet(@PathVariable Long id) {
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        System.out.println(hospitalSet);
        return Result.ok(hospitalSet);
    }
    
    /**
     * 修改医院设置
     * @param hospitalSet
     * @return
     */
    @PostMapping("updateHospSet")
    public Result updateHospSet(@RequestBody HospitalSet hospitalSet) {
        boolean flag = hospitalSetService.updateById(hospitalSet);
        if (flag) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }
    
    /**
     * 批量删除
     * @param idList
     * @return
     */
    @DeleteMapping("batchRemove") //RequestBody表示用JSON传递参数
    public Result batchRemove(@RequestBody List<Long> idList) {
        boolean flag = hospitalSetService.removeByIds(idList);
        if (flag) {
            return Result.ok();
        } else {
            return Result.fail();
        }
    }
    
    /**
     * 医院设置锁定和解锁
     * @param id
     * @param status
     * @return
     */
    @PutMapping("lockHospSet/{id}/{status}")
    public Result lockHospSet(@PathVariable long id,
                              @PathVariable Integer status) {
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        hospitalSet.setStatus(status);
        hospitalSetService.updateById(hospitalSet);
        return Result.ok();
    }
    
    
    /**
     * 发送签名和密钥KEY
     * @param id
     * @return
     */
    @PutMapping("sendKey/{id}")
    public Result lockHospSet(@PathVariable long id) {
        HospitalSet hospitalSet = hospitalSetService.getById(id);
        String signKey = hospitalSet.getSignKey();
        String hoscode = hospitalSet.getHoscode();
        
        //TODO:给后期发送短息之类的需求
        
        return Result.ok();
        
    }
    

}
