package com.xworkz.clips.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.clips.connection.DBConnection;

public class FrontControllerIntitilization extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
 private Class[] servletconfigClasses= {SpringConfiguration.class,DBConnection.class};
 private String[] servletmappings= {"/"};
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created");
		return servletconfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created");
		return servletmappings;
	}

}
