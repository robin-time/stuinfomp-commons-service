package com.lxy.stuinfomp.commons.service.impl;

import com.lxy.stuinfomp.commons.dto.AbstractBaseDomain;
import com.lxy.stuinfomp.commons.service.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.MyMapper;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;

public class BaseCrudServiceImpl<T extends AbstractBaseDomain,M extends MyMapper<T>> implements BaseCrudService<T> {

    @Autowired
    protected M mapper;

    /**
     * 得到泛型的class
     */
    private Class<T> entityClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    @Override
    public boolean unique(String property, String value) {
        Example example = new Example(entityClass);
        example.createCriteria().andEqualTo(property,value);
        int result = mapper.selectCountByExample(example);
        if(result > 0 ){
            return false;
        }
        return true;
    }
}
