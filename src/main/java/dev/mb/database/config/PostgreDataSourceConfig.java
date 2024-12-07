package dev.mb.database.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PostgreDataSourceConfig {


    @ConfigurationProperties("spring.datasource.pg")
    @Bean
    public DataSourceProperties postgreDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    public DataSource postgreDataSource(){
        return postgreDataSourceProperties().initializeDataSourceBuilder().build();
    }
}
