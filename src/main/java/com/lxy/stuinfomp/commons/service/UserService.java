package com.lxy.stuinfomp.commons.service;

import com.lxy.stuinfomp.commons.domain.Users;

/**
 * @author lxy
 */
public interface UserService extends BaseCrudService<Users> {

    Users selectByUserName(String userName);
}
