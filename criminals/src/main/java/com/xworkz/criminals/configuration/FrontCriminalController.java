package com.xworkz.criminals.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.xworkz.criminals.configuration.DBConnection;
public class FrontCriminalController extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    
	private Class[] servletconfigClasses= {SpringConfiguration.class,DBConnection.class};
	private String [] servletmappings={"/"};
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("created getServletConfigClasses");
		return servletconfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
 	System.out.println("created getServletMappings");	
     return servletmappings;
	}
	
}
