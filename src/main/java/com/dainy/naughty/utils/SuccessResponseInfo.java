package com.dainy.naughty.utils;

public class SuccessResponseInfo extends ResponseInfo{
    private Object data;

    public SuccessResponseInfo(String result, Object data) {
        super(result);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-30 15:39
 **/
