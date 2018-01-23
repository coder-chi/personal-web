package com.zczy.personal.web.controller;

import com.zczy.personal.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/23 17:11
 */
@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;


}
