package com.xworkz.milkshop.configuration;

import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DBConfiguration {

	public DBConfiguration() {
		System.out.println("created dbconfiguration ");
	}

	// persistence.xml
	// factory----datasource
	// packages to scan : @Entity
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManager(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setPackagesToScan("com.xworkz.milkshop");
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		System.out.println("getting datasource from spring ");
		factoryBean.setDataSource(dataSource);

		Map<String, Object> jpaproperties = new HashMap<String, Object>();
		jpaproperties.put("hibernate.show_sql", true);

		factoryBean.setJpaPropertyMap(jpaproperties);
		return factoryBean;
	}

//persistence.xml:db properties---->connection

	@Bean
	public DataSource datasource() {
		System.out.println("created datasource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/milkshop");
		dataSource.setPassword("@Vanita123");
		dataSource.setUsername("root");
		return dataSource;
	}

}
