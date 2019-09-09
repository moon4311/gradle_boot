package com.boot;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

    @Value("${mybatis.config-location}")
    private Resource configLocation;

    @Value("${mybatis.mapper-locations}")
    private Resource[] mapperLocations;

    @Value("${spring.datasource.driverClassName}")
    private String dbDriverName;
    @Value("${spring.datasource.url}")
    private String dbUrl;
    @Value("${spring.datasource.username}")
    private String dbUserName;
    @Value("${spring.datasource.password}")
    private String dbPassword;
    @Value("${spring.datasource.tomcat.test-on-borrow}")
    private boolean dbTestOnBorrow;
    @Value("${spring.datasource.tomcat.time-between-eviction-runs-millis}")
    private int dbTimeBetweenEvictionRunsMills;
    @Value("${spring.datasource.tomcat.validation-query}")
    private String dbValidationQuery;

    @Bean(name="dataSource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource() {
        org.apache.tomcat.jdbc.pool.DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
        dataSource.setDriverClassName(dbDriverName);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUserName);
        dataSource.setPassword(dbPassword);
//        dataSource.setTestWhileIdle(dbTestWhileIdle);
        dataSource.setTestOnBorrow(dbTestOnBorrow);
        dataSource.setTimeBetweenEvictionRunsMillis(dbTimeBetweenEvictionRunsMills);
        dataSource.setValidationQuery(dbValidationQuery);
        return dataSource;
//        return DataSourceBuilder.create().build();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(configLocation);
        factoryBean.setMapperLocations(mapperLocations);
        return factoryBean;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
