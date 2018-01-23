package com.zczy.personal.web.controller;

import com.zczy.personal.web.model.TestModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/first")
    public TestModel first() {
        TestModel zhang = new TestModel();
        zhang.setId(1);
        zhang.setName("张致远");
        return zhang;
    }
}
