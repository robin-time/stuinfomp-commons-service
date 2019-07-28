package com.lxy.stuinfomp.commons.service.impl;

import com.lxy.stuinfomp.commons.dto.AbstractBaseDomain;
import com.lxy.stuinfomp.commons.service.BaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.MyMapper;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.util.Date;

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

    @Override
    public T save(T domain) {
        int result = 0;
        Date currentDate = new Date();
        domain.setGmtModified(currentDate);

        //id是空，判断是创建；不是空就是更新
        if (domain.getId() == null){
            domain.setGmtCreated(currentDate);
            result = mapper.insertUseGeneratedKeys(domain);
        }else {
            result = mapper.updateByPrimaryKey(domain);
        }
        if (result > 0){
            return domain;
        }
        return null;
    }
}
