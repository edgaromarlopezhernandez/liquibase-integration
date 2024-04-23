package com.demo.liquibase.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    //@Value("${spring.liquibase.change-log}")
    //private String changelog;


    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        String changelog = "classpath:/db/changelog/database_changelog.sql";
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog(changelog);
        return liquibase;
    }
}
