package com.example.library.db;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Snippet {
	@Autowired Environment env;
	
	@Bean
	public DataSource dataSource() {
	    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName(env.getProperty("driverClassName"));
	    dataSource.setUrl(env.getProperty("url"));
	    dataSource.setUsername(env.getProperty("user"));
	    dataSource.setPassword(env.getProperty("password"));
	    return dataSource;
	}
}

