package com.zczy.personal.web.controller;

import com.zczy.personal.web.dto.UserQuery;
import com.zczy.personal.web.model.Result;
import com.zczy.personal.web.model.TestModel;
import com.zczy.personal.web.model.User;
import com.zczy.personal.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    UserService userService;

    @RequestMapping("/first")
    public TestModel first() {
        TestModel zhang = new TestModel();
        zhang.setId(1);
        zhang.setName("张致远");
        return zhang;
    }

    @RequestMapping("login")
    public Result login() {
        UserQuery query = new UserQuery();
        query.setName("zhangzhiyuan");
        User user = userService.getUser(query);
        return new Result(200,user);
    }
}
