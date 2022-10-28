package com.xworkz.bus.dbconnection;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConnection {

	public DBConnection() {
		System.out.println("DBconnection is created " + this.getClass().getSimpleName());
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPackagesToScan("com");
		factoryBean.setDataSource(dataSource);
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("hibernate.show_sql", true);
		factoryBean.setJpaPropertyMap(hashMap);
		return factoryBean;

	}

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/bus");
		source.setPassword("@Vanita123");
		source.setUsername("root");

		return source;

	}

}
