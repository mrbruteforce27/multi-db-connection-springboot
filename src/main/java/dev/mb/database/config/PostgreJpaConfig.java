package dev.mb.database.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@EnableTransactionManagement
@Configuration
@EnableJpaRepositories(
        basePackages = "dev.mb.database.repo.postgre",
        entityManagerFactoryRef = "postgreEntityManagerFactory",
        transactionManagerRef = "postgreTransactionManager"
)
public class PostgreJpaConfig {

    @Bean("postgreEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean postgreEntityManagerFactory(
            EntityManagerFactoryBuilder entityManagerFactoryBuilder,
            @Qualifier("postgreDataSource") DataSource dataSource
    ){
        return entityManagerFactoryBuilder
                .dataSource(dataSource)
                .packages("dev.mb.database.entity.postgre")
                .build();
    }



    @Bean
    PlatformTransactionManager postgreTransactionManager(@Qualifier("postgreEntityManagerFactory") LocalContainerEntityManagerFactoryBean factoryBean){
        return new JpaTransactionManager(factoryBean.getObject());
    }
}
