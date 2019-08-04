package com.lxy.stuinfomp.commons.service.impl;

import com.lxy.stuinfomp.commons.domain.Students;
import com.lxy.stuinfomp.commons.mapper.StudentsMapper;
import com.lxy.stuinfomp.commons.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends BaseCrudServiceImpl<Students, StudentsMapper> implements StudentService {

    @Autowired
    private StudentsMapper studentsMapper;


    public Long selectMaxId() {
        return studentsMapper.selectStudentMaxId();
    }


}
