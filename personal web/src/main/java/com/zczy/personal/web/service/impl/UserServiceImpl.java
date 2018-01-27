package com.zczy.personal.web.service.impl;

import com.zczy.personal.web.dto.UserQuery;
import com.zczy.personal.web.mapper.UserMapper;
import com.zczy.personal.web.model.Result;
import com.zczy.personal.web.model.User;
import com.zczy.personal.web.service.UserService;
import com.zczy.personal.web.util.ResultUtil;
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
    public User getUser(UserQuery query) {
        return userMapper.getUserById(query);
    }

    @Override
    public Result login(User user) {
        UserQuery query = new UserQuery();
        query.setName(user.getName());
        User userFromData = userMapper.getUserById(query);
        if(userFromData.getPassword() == userFromData.getPassword()){
            return ResultUtil.getResult(200,userFromData);
        } else {
            return ResultUtil.getResult(500,null);
        }
    }
}
