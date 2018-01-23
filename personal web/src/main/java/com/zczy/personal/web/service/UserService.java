package com.zczy.personal.web.service;

import com.zczy.personal.web.dto.UserQuery;
import com.zczy.personal.web.model.Result;
import com.zczy.personal.web.model.User;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/23 14:53
 */
public interface UserService {
    User login(UserQuery query);
}
