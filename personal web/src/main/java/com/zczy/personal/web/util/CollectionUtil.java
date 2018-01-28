package com.zczy.personal.web.util;

import java.util.List;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/28 18:11
 */
public class CollectionUtil {

    public static final boolean isListNotEmpty(List list) {
        return !isListEmpty(list);
    }
    public static final boolean isListEmpty(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }
}
