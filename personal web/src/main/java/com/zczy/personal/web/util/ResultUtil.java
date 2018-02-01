package com.zczy.personal.web.util;

import com.zczy.personal.web.model.Result;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/27 16:23
 */
public class ResultUtil {
    public static final int SUCCESS_CODE = 200;
    public static final String SUCCESS_MESSAGE = "成功";

    public static final int FAIL_CODE = 500;
    public static final String FAIL_MESSAGE = "失败";

    public static final Result getResult(int code,Object object){
        return new Result(code, object);
    }



}
