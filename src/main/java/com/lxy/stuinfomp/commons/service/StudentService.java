package com.lxy.stuinfomp.commons.service;

import com.lxy.stuinfomp.commons.domain.Students;

/**
 * @author lxy
 */
public interface StudentService extends BaseCrudService<Students> {

    /**
     * 查询最大id值
     * @return
     */
    default Long selectMaxId(){
        return null;
    }


}
