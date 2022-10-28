package com.xworkz.bus.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BusSpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	private Class[] servletConfigClasses = { BusConfiguration.class };
	private String[] servletMappings = { "/" };

	public BusSpringMvcInitializer() {

		System.out.println("initializer is created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created getServletConfigClasses");
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMapping");
		return servletMappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
