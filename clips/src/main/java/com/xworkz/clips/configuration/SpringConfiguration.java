package com.xworkz.clips.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan(basePackages = "com.xworkz.clips")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("create constructor");
	}
	@Bean
	public ViewResolver viewResolver() {
		
		System.out.println("calling view resolver");
		return new InternalResourceViewResolver();
	}

}
