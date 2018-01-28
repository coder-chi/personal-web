package com.zczy.personal.web.service;

import com.zczy.personal.web.dto.ManagerQuery;
import com.zczy.personal.web.model.Result;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/28 15:01
 */
public interface ManagerService {
    Result login(ManagerQuery query);
}
