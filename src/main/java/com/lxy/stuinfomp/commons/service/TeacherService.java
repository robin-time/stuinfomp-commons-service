package com.lxy.stuinfomp.commons.service;

import com.lxy.stuinfomp.commons.domain.Teachers;
import com.lxy.stuinfomp.commons.service.BaseCrudService;

/**
 * @author lxy
 */
public interface TeacherService extends BaseCrudService<Teachers> {
    /**
     * 查询最大id值
     * @return
     */
    default Long selectMaxId(){
        return null;
    }
}
