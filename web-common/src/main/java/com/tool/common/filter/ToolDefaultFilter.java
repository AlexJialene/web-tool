package com.tool.common.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author alex-jiayu
 * @create 2017-06-09 14:39
 **/
//@WebFilter
public class ToolDefaultFilter implements Filter{
    private static final Logger log = LoggerFactory.getLogger(ToolDefaultFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("======================ToolDefaultFilter.init====================");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
