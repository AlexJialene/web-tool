package com.tool;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ServletComponentScan 扫描WebFilter ， WebListener
 */

@SpringBootApplication
@ServletComponentScan
@RestController
public class Application {



    @RequestMapping("/")
    public String index(Model model){
        return "Hello ! alex's System";
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class , args);
    }

}
