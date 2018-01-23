package com.zczy.personal.web.model;

/**
 * @Author: zhangzhiyuan
 * @Date: Created in 2018/1/23 14:54
 */
public class Result {
    private int code;
    private Object data;

    public Result(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", data=" + data +
                '}';
    }
}
