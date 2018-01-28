package com.zczy.personal.web.util;

import com.google.common.base.Preconditions;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/28 15:35
 */
public class NullCheckUtil {
    public static void checkNotNull(Object... params) {
        for(Object obj : params){
            Preconditions.checkNotNull(obj);
        }
    }
}
