package com.tool.base;

import org.springframework.web.servlet.ModelAndView;

/**
 * @author alex-jiayu
 * @create 2017-06-09 9:44
 **/
public class BaseController {





    public ModelAndView $return(String viewName){
        return new ModelAndView(viewName);
    }
}
