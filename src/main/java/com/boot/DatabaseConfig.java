package com.boot;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan(basePackages="com.user.service.dao")
@EnableTransactionManagement
public class DatabaseConfig {

@Bean
public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
sessionFactory.setDataSource(dataSource);
PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//System.err.println(resolver.getResources(location));
sessionFactory.setMapperLocations(resolver.getResources("classpath:sqlmap/mapper/*.xml"));
return sessionFactory.getObject();
}

@Bean
public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
return sqlSessionTemplate;
}

}

