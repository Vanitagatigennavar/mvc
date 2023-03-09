package com.xworkz.bigboss.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
@RequestMapping("/")
public class BigBossController {

	public BigBossController() {
		System.out.println("create default constructor"+ this.getClass().getSimpleName());
	}
	@RequestMapping("/start.do")
	public String onClick() {
		
		System.out.println("running the bigboss controller");
		return "index.jsp";
		
	}

}
