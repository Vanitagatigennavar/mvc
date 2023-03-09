package com.xworkz.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/save")
public class CustomerController {
	@Autowired
	private CustomerService service;

	public CustomerController(CustomerService service) {
		System.out.println("default constructor");
	}
	
@GetMapping
public String onSave() {
	return null;
}
}
