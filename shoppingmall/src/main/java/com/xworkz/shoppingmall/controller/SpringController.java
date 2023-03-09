package com.xworkz.shoppingmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.shoppingmall.entity.AdminEntity;
import com.xworkz.shoppingmall.service.AdminService;

@Controller
@RequestMapping("/login")
public class SpringController {

	@Autowired
	private AdminService adminService;

	public SpringController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onLogin(Model model, @RequestParam String malladminname, @RequestParam String adminpassword) {
		System.out.println("running on login methods");
		AdminEntity findByAdminNameAndpassword = adminService.findByAdminNameAndpassword(malladminname, adminpassword);
		AdminEntity findByName=adminService.findByName(malladminname);
		
		if(findByAdminNameAndpassword==null || findByName==null) {
			System.out.println("given credencials are invalid");
			model.addAttribute("error","credencials are not matching");
			
		if(findByName.getAccountlocked().equals("locked"));{
			System.out.println("given credencials are invalid");
			model.addAttribute("error","your account is locked please reset password");
			return "adminLogin";
		}
		}		
		
		if (findByAdminNameAndpassword != null) {
			if(findByAdminNameAndpassword.getAccountlocked().equals("UnLocked")) {
				System.out.println("Account is locked");
				model.addAttribute("message", "credencials not matched");
				return "ChangePassword";
			}
			if(findByAdminNameAndpassword.getFirstLogin()< 1 && findByAdminNameAndpassword.getLoginCount()<1) {
				System.out.println("welcome to our page please change your password");
				model.addAttribute("message", "congratulations you have in logged plese change your password");
			return "ChangePassword";
			}
			return "adminlogin";
			}
		return "adminlogin";
	}
}
