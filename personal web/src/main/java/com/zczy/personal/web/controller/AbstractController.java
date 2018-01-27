package com.zczy.personal.web.controller;

import com.alibaba.fastjson.JSON;
import com.zczy.personal.web.constant.CommonSymbol;
import com.zczy.personal.web.model.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/27 15:46
 */
public class AbstractController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractController.class);

    protected <T> T constructEntity(HttpServletRequest request, Class<T> tClass) {
        String reqStr = request.getParameter(CommonSymbol.REQUEST_STRING);
        LOGGER.info("req url is : " + request.getRequestURI());
        LOGGER.info(reqStr);
        return JSON.parseObject(reqStr, tClass);
    }

}
