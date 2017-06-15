package com.tool.controller.base;

import com.sun.org.apache.regexp.internal.RE;
import com.tool.common.vo.ResultVo;
import com.tool.util.JsonMapper;

import java.io.File;
import java.io.Serializable;

/**
 * @author alex-jiayu
 * @create 2017-06-09 9:44
 **/
public abstract class BaseController<T , ID extends Serializable> {

    protected static JsonMapper mapper = JsonMapper.nonDefaultMapper();
    protected ResultVo resultVo = new ResultVo();
    protected final static ResultVo SUCCESS_RESULT = new ResultVo(1 , 200 , "request success");
    protected final static ResultVo NOT_FOUND_RESULT = new ResultVo(-1 , 404 , "request not found");
    protected final static ResultVo ERROR_RESULT = new ResultVo(-1 , 500 , "system error");



    protected static final String UPLOAD_PATH ;
    static{
        UPLOAD_PATH = new StringBuilder(Thread.currentThread()
                .getContextClassLoader()
                .getResource("")
                .getPath())
                .append("static/upload")
                .toString();
        File d = new File(UPLOAD_PATH);
        if (!d.exists()){
            d.mkdirs();
        }
    }


}
