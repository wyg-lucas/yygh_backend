package com.lucas.yygh.hosp.service.impl;

import com.lucas.yygh.hosp.service.ScheduleService;
import com.lucas.yygh.model.hosp.Schedule;
import com.lucas.yygh.vo.hosp.ScheduleOrderVo;
import com.lucas.yygh.vo.hosp.ScheduleQueryVo;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description:
 * @author: lucas_w
 * @date: 2021/11/21
 */

@Service
public class ScheduleServiceImpl implements ScheduleService {
    
    @Override
    public void save(Map<String, Object> paramMap) {
    
    }
    
    @Override
    public Page<Schedule> findPageSchedule(int page, int limit, ScheduleQueryVo scheduleQueryVo) {
        return null;
    }
    
    @Override
    public void remove(String hoscode, String hosScheduleId) {
    
    }
    
    @Override
    public Map<String, Object> getRuleSchedule(long page, long limit, String hoscode, String depcode) {
        return null;
    }
    
    @Override
    public List<Schedule> getDetailSchedule(String hoscode, String depcode, String workDate) {
        return null;
    }
    
    @Override
    public Map<String, Object> getBookingScheduleRule(int page, int limit, String hoscode, String depcode) {
        return null;
    }
    
    @Override
    public Schedule getScheduleId(String scheduleId) {
        return null;
    }
    
    @Override
    public ScheduleOrderVo getScheduleOrderVo(String scheduleId) {
        return null;
    }
    
    @Override
    public void update(Schedule schedule) {
    
    }
}
