package com.tool.generate;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import java.io.IOException;

/**
 * @author alex-jiayu
 * @create 2017-06-09 17:18
 **/
@Configuration
//@MapperScan("com.tool.mapper")
@EnableTransactionManagement
public class MybatisConfig implements TransactionManagementConfigurer{
    private Logger log = LoggerFactory.getLogger(MybatisConfig.class);

    @Autowired
    private DruidDataSource dataSource;


    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws IOException {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
        String path = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + "/mapper/*.xml";
        sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources(path));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.tool.domain");
        sqlSessionFactoryBean.setDataSource(dataSource);
        try{

            return sqlSessionFactoryBean.getObject();
        }catch (Exception e){
            log.error("MybatisConfig.sqlSessionFactory error :{}" ,e);
            throw new RuntimeException(e);
        }
    }


    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
