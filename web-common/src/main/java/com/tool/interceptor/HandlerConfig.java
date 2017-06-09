package com.tool.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author alex-jiayu
 * @create 2017-06-09 15:23
 **/

@Configuration
public class HandlerConfig extends WebMvcConfigurerAdapter{
    private static final Logger log = LoggerFactory.getLogger(HandlerConfig.class);
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("==================HandlerConfig.addInterceptors===============");
        registry.addInterceptor(new ToolDefaultHandler()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
