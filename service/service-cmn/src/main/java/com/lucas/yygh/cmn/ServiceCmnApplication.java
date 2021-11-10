package com.lucas.yygh.cmn;

import org.apache.poi.ss.formula.functions.MinaMaxa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/10
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.lucas")
public class ServiceCmnApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCmnApplication.class, args);
    }
}
