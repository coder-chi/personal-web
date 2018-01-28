package com.zczy.personal.web.controller;

import com.zczy.personal.web.dto.ManagerQuery;
import com.zczy.personal.web.model.Result;
import com.zczy.personal.web.service.ManagerService;
import com.zczy.personal.web.util.NullCheckUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/28 14:58
 */
@RestController
@RequestMapping("/manager")
public class ManagerAdminPortalController extends AbstractController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping(value = "/login")
    public Result login(HttpServletRequest request){
        ManagerQuery query = constructEntity(request, ManagerQuery.class);
        NullCheckUtil.checkNotNull(query.getName(), query.getPassword());
        return managerService.login(query);
    }
}
