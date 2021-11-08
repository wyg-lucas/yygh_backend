package com.lucas.yygh.hosp.controller;

import com.lucas.yygh.hosp.service.HospitalSetService;
import com.lucas.yygh.model.hosp.HospitalSet;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.service.Tags;

import java.util.List;

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
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;

    @GetMapping("findAll")
    public void findAllHospital() {

        List<HospitalSet> list = hospitalSetService.list();
        System.out.println(list);
    }

}
