package com.xworkz.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.shoppingmall.entity.AdminEntity;
import com.xworkz.shoppingmall.service.AdminService;
@Controller
@RequestMapping("/reset")
public class ResetPasswordController {
	
	@Autowired
	private AdminService service;

	public ResetPasswordController() {
		System.out.println("default Resetconstructor ");
	}
	
	@GetMapping
	public String onForgot(@RequestParam String name,Model model) {
	//AdminEntity findByMallName=service.findByMallName(name);
		if(name!=null) {
			service.findByMallName(name);
			model.addAttribute("message","password is sent to yout mail id");
			return "ChangePassword";
		}else {
			if(name == null) {
				model.addAttribute("error","selected mall is not found");
				return "ResetPassword";
			}
		}
		return null;
	}
}
