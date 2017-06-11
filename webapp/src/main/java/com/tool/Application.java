package com.tool;

import org.apache.log4j.PropertyConfigurator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @ServletComponentScan 扫描WebFilter ， WebListener
 */

@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@MapperScan(basePackages = "com.tool.mapper")
public class Application {






    public static void main(String[] args) {
        SpringApplication.run(Application.class , args);
    }

}
