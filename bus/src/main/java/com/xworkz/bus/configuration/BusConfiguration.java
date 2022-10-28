package com.xworkz.bus.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.bus")
public class BusConfiguration {

	public BusConfiguration() {
		System.out.println("busconfigaration is created :" + this.getClass().getSimpleName());

	}

	@Bean
	public ViewResolver resolver() {

		System.out.println("this is view resolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

}
