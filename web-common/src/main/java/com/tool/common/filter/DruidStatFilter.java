package com.tool.common.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by Alex_ on 2017/6/10.
 */
@WebFilter(filterName = "druidWebStatFilter" ,  urlPatterns = "/*" ,initParams = {
        @WebInitParam(name = "exclusions" , value="/css,/style,/jslib,*.js,*.css,/druid*,/attached,*.jsp,/front-end,*.html")
})
public class DruidStatFilter extends WebStatFilter {
}
