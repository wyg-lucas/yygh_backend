package com.lucas.yygh.hosp.repository;

import com.lucas.yygh.model.hosp.Department;
import com.lucas.yygh.vo.hosp.DepartmentVo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/20
 */

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

    // 上传科室接口
    Department getDepartmentByHoscodeAndDepcode(String hoscode, String depcode);
}
