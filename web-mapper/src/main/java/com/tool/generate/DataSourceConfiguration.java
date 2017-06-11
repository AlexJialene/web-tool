package com.tool.generate;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.SQLException;

/**
 * @author alex-jiayu
 * @create 2017-06-09 16:07
 **/

@Configuration
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {

    private Logger logger = LoggerFactory.getLogger(DataSourceConfiguration.class);
    @Value("${jdbc.driverClass}")
    private String jdbcDriverClass;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.password}")
    private String password;

    @Value("${initialSize}")
    private int initialSize;
    @Value("${maxActive}")
    private int maxActive;
    @Value("${minIdle}")
    private int minIdle;
    @Value("${maxWait}")
    private long maxWait;
    @Value("${validationQuery}")
    private String validationQuery;
    @Value("${testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${testOnBorrow}")
    private boolean testOnBorrow;
    @Value("${testOnReturn}")
    private boolean testOnReturn;

    @Value("${timeBetweenEvictionRunsMillis}")
    private long timeBetweenEvictionRunsMillis;
    @Value("${minEvictableIdleTimeMillis}")
    private long minEvictableIdleTimeMillis;
    @Value("${removeAbandoned}")
    private boolean removeAbandoned;
    @Value("${removeAbandonedTimeout}")
    private int removeAbandonedTimeout;
    @Value("${logAbandoned}")
    private boolean logAbandoned;
    @Value("${filters}")
    private String filters;
    @Value("${poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;


    @Bean
    @Primary
    public DruidDataSource dataSource() throws SQLException {
        logger.info("============DataSourceConfiguration.dataSource==============");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcDriverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxActive(maxActive);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxWait(maxWait);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setRemoveAbandoned(removeAbandoned);
        dataSource.setRemoveAbandonedTimeout(removeAbandonedTimeout);
        dataSource.setLogAbandoned(logAbandoned);
        dataSource.setFilters(filters);
        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        return dataSource;
    }


    /*@Bean
    @Primary
    public DataSourceTransactionManager masterTransactionManager() throws SQLException {
        return new DataSourceTransactionManager(dataSource());
    }*/



}
