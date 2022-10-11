package com.xworkz.milkshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.milkshop.dto.MilkShopDTO;
import com.xworkz.milkshop.service.MilkShopService;

@Controller
@RequestMapping("/milk")
public class MilkShopController {
	
	@Autowired
	private MilkShopService milkShopService;

	public MilkShopController() {
		System.out.println("create"+this.getClass().getSimpleName());
	}
	@PostMapping
	public String Onsave(MilkShopDTO dto) {
		System.out.println("saved "+dto);
		milkShopService.validateAndsave(dto);
		
		return "success";
		
		
	}

}
