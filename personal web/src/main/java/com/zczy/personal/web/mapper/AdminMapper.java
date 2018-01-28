package com.zczy.personal.web.mapper;

import com.zczy.personal.web.dto.ManagerQuery;
import com.zczy.personal.web.model.Manager;

import java.util.List;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/28 16:17
 */
public interface AdminMapper {

    List<Manager> selectByConditions(ManagerQuery query);
}
