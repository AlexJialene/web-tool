package com.tool.generate;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author alex-jiayu
 * @create 2017-06-09 17:32
 **/
//@Configuration
//@AutoConfigureAfter(MybatisConfig.class)
public class MybatisMapperConfig {


    //@Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){

        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");


        return mapperScannerConfigurer;
    }
}
