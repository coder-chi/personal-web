package com.zczy.personal.web.controller;

import com.zczy.personal.web.dto.UserQuery;
import com.zczy.personal.web.model.Result;
import com.zczy.personal.web.model.User;
import com.zczy.personal.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/23 17:11
 */
@RestController
@RequestMapping("/user")
public class UserController extends AbstractController{

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Result login(@RequestParam(value = "username") String username, @RequestParam(value = "password")
                             String password){
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        return userService.login(user);
    }

}
