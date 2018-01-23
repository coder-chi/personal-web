package com.zczy.personal.web.service.impl;

import com.zczy.personal.web.dto.UserQuery;
import com.zczy.personal.web.mapper.UserMapper;
import com.zczy.personal.web.model.User;
import com.zczy.personal.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/23 14:56
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(UserQuery query) {
        return userMapper.getUserById(query);
    }
}
