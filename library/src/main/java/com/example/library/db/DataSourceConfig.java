package com.example.library.db;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class DataSourceConfig {
    
	@Autowired Environment env;
	
	@Bean
	public DataSource dataSource() {
	        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
	        dataSourceBuilder.url("jdbc:library:db/library.db");
	        return dataSourceBuilder.build();   
	}
}