package com.xworkz.shirt.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
	private Class[] servletConfigClasses = { SpringConfiguration.class, DBConfiguration.class };
	private String[] servletmappings = { "/" };

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return servletmappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
