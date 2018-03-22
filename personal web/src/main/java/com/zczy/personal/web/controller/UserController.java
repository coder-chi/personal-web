package com.zczy.personal.web.controller;

import com.zczy.personal.web.model.Result;
import com.zczy.personal.web.model.User;
import com.zczy.personal.web.service.UserService;
import com.zczy.personal.web.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

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
    @RequestMapping(value = "/article")
    public Result article(HttpServletRequest httpServletRequest){
        String head = httpServletRequest.getHeader("r");
        String body = httpServletRequest.getParameter("note");
        System.out.println(head);
        String method = httpServletRequest.getMethod();
        System.out.println(method);
        System.out.println(body);
        System.out.println("jijiji");
        return ResultUtil.getResult(200,head);
    }


}
