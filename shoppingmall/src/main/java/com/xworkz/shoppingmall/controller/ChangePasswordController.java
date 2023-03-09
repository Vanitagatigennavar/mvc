package com.xworkz.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.shoppingmall.dao.AdminDAO;
import com.xworkz.shoppingmall.entity.AdminEntity;
import com.xworkz.shoppingmall.service.AdminService;

@Controller
@RequestMapping("/forgotPassword")
public class ChangePasswordController {
	@Autowired
	private AdminService adminsevice;
	
	public ChangePasswordController() {
		System.out.println(getClass().getSimpleName());
	}
	@GetMapping
	public String onClick(@RequestParam String generatedPassword,@RequestParam String adminpassword,@RequestParam String password1, Model model) {
		if(generatedPassword!=null && adminpassword.equals(password1)) {
			adminsevice.updatePasswordByGeneratedPassword(generatedPassword, password1);
		//AdminEntity adminEntity = adminsevice.findByAdminNameAndpassword(generatedPassword, adminpassword);
		
			
			model.addAttribute("message", "password is rest and updated ");
			return "ChangePassword";
		}else {
			model.addAttribute("error", "password is rest and Notupdated");
			return "ChangePassword";
		}
		
		
	}

}
