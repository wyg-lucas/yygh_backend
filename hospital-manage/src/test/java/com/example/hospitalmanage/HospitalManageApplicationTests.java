package com.example.hospitalmanage;

import com.lucas.hospital.mapper.HospitalSetMapper;
import com.lucas.hospital.model.HospitalSet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HospitalManageApplicationTests {
    @Autowired
    HospitalSetMapper hospitalSetMapper;
    
    @Test
    void contextLoads() {
        HospitalSet hospitalSet = hospitalSetMapper.selectById(1);
        System.out.println(hospitalSet);
    }
    
    
}
