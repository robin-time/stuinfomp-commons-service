package com.lxy.stuinfomp.commons.service;

import com.lxy.stuinfomp.commons.domain.Students;

public interface StudentService extends BaseCrudService<Students> {

    default Long selectMaxId(){
        return null;
    }


}
