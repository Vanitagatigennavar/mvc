package com.xworkz.shirt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.shirt.dto.ShirtEntity;
import com.xworkz.shirt.service.ShirtService;

@Controller
@RequestMapping("/shirt")
public class ShirtController {

	@Autowired
	private ShirtService shirtservice;

	public ShirtController() {
		System.out.println("created constructor");
	}

	@PostMapping
	public String Onsave(ShirtEntity entity) {
		System.out.println("saved " + entity);
		boolean validateAndsave = shirtservice.validateAndsave(entity);
		System.out.println(validateAndsave);
		if (validateAndsave) {
			System.out.println("data is valid and save");
			return "succes";
		} else {
			System.out.println("data is not valid and not save");
			return "index";
		}

	}
}
