package com.lxy.stuinfomp.commons.service.impl;

import com.lxy.stuinfomp.commons.domain.Courses;
import com.lxy.stuinfomp.commons.mapper.CoursesMapper;
import com.lxy.stuinfomp.commons.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lxy
 */
@Service
public class CourseServiceImpl extends BaseCrudServiceImpl<Courses, CoursesMapper> implements CourseService {

    @Autowired
    private CoursesMapper coursesMapper;

    @Override
    public Long selectMaxId() {
        return coursesMapper.selectMaxId();
    }
}
