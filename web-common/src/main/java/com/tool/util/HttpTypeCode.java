package com.tool.util;

/**
 * Created by Alex_ on 2017/6/10.
 */
public enum  HttpTypeCode {
    not_found(404),
    error(500),
    success(200),
    bad_request(403);




    private int code;

    HttpTypeCode(int i) {
        code = i;
    }

    public int getCode(){
        return code;
    }
}
