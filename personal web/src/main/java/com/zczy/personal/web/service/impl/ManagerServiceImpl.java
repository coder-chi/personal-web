package com.zczy.personal.web.service.impl;

import com.zczy.personal.web.constant.StateConst;
import com.zczy.personal.web.dto.ManagerQuery;
import com.zczy.personal.web.mapper.AdminMapper;
import com.zczy.personal.web.model.Manager;
import com.zczy.personal.web.model.Result;
import com.zczy.personal.web.service.ManagerService;
import com.zczy.personal.web.util.CollectionUtil;
import com.zczy.personal.web.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/28 15:42
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private AdminMapper managerMapper;

    @Override
    public Result login(ManagerQuery query) {
        query.setState(StateConst.AVAILABLE);
        List<Manager> managers = managerMapper.selectByConditions(query);
        if(CollectionUtil.isListNotEmpty(managers)){
            return ResultUtil.getResult(200,managers.get(0));
        }
        else{
            return ResultUtil.getResult(500,null);
        }
    }

}
