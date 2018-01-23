package com.zczy.personal.web.mapper;

import com.zczy.personal.web.dto.UserQuery;
import com.zczy.personal.web.model.User;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/23 14:58
 */
public interface UserMapper {

    User getUserById(UserQuery query);

}
