package com.hs.ptscan.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author : Julian
 * @date : 2019/5/27 14:58
 */
@Configuration
@MapperScan(basePackages = "com.hs.ptscan.dao.ptppmc", sqlSessionTemplateRef  = "ptppmcSqlSessionTemplate")
public class MysqlDataSourceConfig {

    @Bean(name = "ptppmcDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.ptppmc")
    @Primary
    public DataSource ptppmcDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "ptppmcSqlSessionFactory")
    @Primary
    public SqlSessionFactory ptppmcSqlSessionFactory(@Qualifier("ptppmcDataSource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/ptppmc/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "ptppmcTransactionManager")
    @Primary
    public DataSourceTransactionManager testTransactionManager(@Qualifier("ptppmcDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "ptppmcSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("ptppmcSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
