package com.lxy.stuinfomp.commons.service.impl;

import com.lxy.stuinfomp.commons.domain.Teachers;
import com.lxy.stuinfomp.commons.mapper.TeachersMapper;
import com.lxy.stuinfomp.commons.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lxy
 */
@Service
public class TeacherServiceImpl extends BaseCrudServiceImpl<Teachers, TeachersMapper> implements TeacherService {

    @Autowired
    private TeachersMapper teachersMapper;

    @Override
    public Long selectMaxId() {
        return teachersMapper.selectStudentMaxId();
    }
}
