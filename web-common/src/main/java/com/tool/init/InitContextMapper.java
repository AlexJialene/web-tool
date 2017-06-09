package com.tool.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Alex_ on 2017/6/9.
 */
@Component
public class InitContextMapper implements ApplicationContextAware , CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(InitContextMapper.class);
    private static ApplicationContext applicationContext;

    @Override
    public void run(String... strings) throws Exception {

        //applicationContext.getBean("");
    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
