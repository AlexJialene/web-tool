package com.tool.common.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author alex-jiayu
 * @create 2017-06-09 14:23
 **/

//@WebListener
public class ToolDefaultListener implements ServletContextListener{
    private static final Logger log = LoggerFactory.getLogger(ToolDefaultListener.class);
    //private Timer timer;


    @Override
    public void contextInitialized(ServletContextEvent sec) {
        log.info("==================启动时候初始化定时器===============");
        //timer = new Timer();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.info("==================定时器任务结束===============");

        /*if (null == timer){
            timer.cancel();
        }*/
    }
}
