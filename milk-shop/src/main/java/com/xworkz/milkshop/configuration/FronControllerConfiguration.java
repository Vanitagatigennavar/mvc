package com.xworkz.milkshop.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FronControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
	private Class[] servletConfigClasses= {SpringConfiguration.class};
	private String[] servletmappings= {"/"};
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Create getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Create getServletConfigClasses");
		return servletConfigClasses ;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("create getServletMappings ");
		return servletmappings;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
}
