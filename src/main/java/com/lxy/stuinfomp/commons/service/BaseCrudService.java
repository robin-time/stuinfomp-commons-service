package com.lxy.stuinfomp.commons.service;

import com.lxy.stuinfomp.commons.dto.AbstractBaseDomain;

/**
 * 通用的业务逻辑
 */
public interface BaseCrudService<T extends AbstractBaseDomain> {

    /**
     * 查询属性值是否唯一
     * @param property
     * @param value
     * @return true 代表唯一，false代表不唯一
     */
    default boolean unique(String property,String value){
        return false;
    }

    /**
     * 保存
     * @param domain
     * @return
     */
    default T save(T domain){
        return null;
    }
}
