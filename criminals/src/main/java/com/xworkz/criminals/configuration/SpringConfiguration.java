package com.xworkz.criminals.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguration {

		public SpringConfiguration() {
			System.out.println("create"+this.getClass().getSimpleName());
		}
		
		@Bean
		public ViewResolver resolver() {
			System.out.println("calling resolver");
			return new InternalResourceViewResolver("/", ".jsp");

	}
		@Bean
		public  MultipartResolver multipart()
		{
			System.out.println("Calling MultiPartResolver");
			return new StandardServletMultipartResolver();
		}
	}
	

