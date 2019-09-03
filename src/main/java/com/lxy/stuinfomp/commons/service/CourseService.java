package com.lxy.stuinfomp.commons.service;

import com.lxy.stuinfomp.commons.domain.Courses;

/**
 * @author lxy
 */
public interface CourseService extends BaseCrudService<Courses> {
    /**
     * 查询最大id值
     * @return
     */
    default Long selectMaxId(){
        return null;
    }
}
