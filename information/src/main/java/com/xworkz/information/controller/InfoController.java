package com.xworkz.information.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.information.IndianStatesDTO;

@Component
@RequestMapping("/")
public class InfoController {
	
	
public InfoController() {
		System.out.println("create default constructor");
	

}
	@RequestMapping("/info.do")
	public String save(IndianStatesDTO dto) {
		System.out.println("add atributes"+ dto);
		System.out.println("running save method");
		return "index.jsp";

}
}