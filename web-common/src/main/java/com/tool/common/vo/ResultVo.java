package com.tool.common.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by Alex_ on 2017/6/10.
 */
public class ResultVo<T> {

    private int resCode;
    private int httpResCode;
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private String msg;
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private T obj;
    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private List<T> objList;

    public ResultVo() {
    }

    public ResultVo(int resCode, int httpResCode, String msg) {
        this.resCode = resCode;
        this.httpResCode = httpResCode;
        this.msg = msg;
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public List<T> getObjList() {
        return objList;
    }

    public void setObjList(List<T> objList) {
        this.objList = objList;
    }

    public int getHttpResCode() {
        return httpResCode;
    }

    public void setHttpResCode(int httpResCode) {
        this.httpResCode = httpResCode;
    }
}
