package dev.mb.database.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class MySqlDataSourceConfig {


    @ConfigurationProperties("spring.datasource.mysql")
    @Bean("mySqlDataSourceProperties")
    public DataSourceProperties dataSourceProperties(){
        return new DataSourceProperties();
    }


    @Primary
    @Bean
    public DataSource mySqlDataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setPassword(dataSourceProperties().getPassword());
//        dataSource.setUrl(dataSourceProperties().getUrl());
//        dataSource.setUsername(dataSourceProperties().getUsername());
//        dataSource.setDriverClassName(dataSourceProperties().getDriverClassName());
        return dataSourceProperties().initializeDataSourceBuilder().build();
    }
}
