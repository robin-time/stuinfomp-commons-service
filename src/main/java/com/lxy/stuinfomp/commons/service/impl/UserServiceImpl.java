package com.lxy.stuinfomp.commons.service.impl;

import com.lxy.stuinfomp.commons.domain.Users;
import com.lxy.stuinfomp.commons.mapper.UsersMapper;
import com.lxy.stuinfomp.commons.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lxy
 */
@Service
public class UserServiceImpl extends BaseCrudServiceImpl<Users,UsersMapper> implements UserService {

    @Resource
    private UsersMapper usersMapper;


    @Override
    public Users selectByUserName(String userName) {
        return usersMapper.selectByUserName(userName);
    }
}
