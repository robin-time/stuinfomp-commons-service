package com.lxy.stuinfomp.commons.service;

import com.github.pagehelper.PageInfo;
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
     * 保存、更新
     * @param domain
     * @return
     */
    default T save(T domain){
        return null;
    }

    /**
     * 分页查询
     * @param domain
     * @param pageNum
     * @param pageSize
     * @return
     */
    default PageInfo<T> page(T domain,int pageNum,int pageSize){
        return null;
    }


    /**
     * 这个是逻辑删除，更新isdelete的状态。
     * @param domain
     * @return
     */
    default T deleteById(T domain, Long stuId){
        return null;
    }

}
