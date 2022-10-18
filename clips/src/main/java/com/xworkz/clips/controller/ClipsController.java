package com.xworkz.clips.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.clips.dto.ClipsEntity;
import com.xworkz.clips.service.ClipsService;

@Controller
@RequestMapping("/clips")
public class ClipsController  {
	@Autowired
	private ClipsService clipsservice;

	public ClipsController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(ClipsEntity criminalsDTO,Model model ) {
		System.out.println("Calling on save method");
		System.out.println("CriminalsDTO" + criminalsDTO);
		boolean validateAndSave = clipsservice.validateAndSave(criminalsDTO);
		if (validateAndSave) {
			System.out.println("Data is valid and Save");
			model.addAttribute("records", "Records are Saved");
			return "succes";
		} else {
			System.out.println("Data is notvalid and notSave");
			return "index";
		}

	}

	@GetMapping
	public String readAll(Model model) {
		System.out.println("Calling Read All Method");
		List<ClipsEntity> dtos =clipsservice .findAll();
		if (dtos != null && !dtos.isEmpty()) {
			System.out.println("dtos are found" + dtos.size());
			model.addAttribute("ClipsDetails", dtos);
			model.addAttribute("size", "Total Criminals found:" + dtos.size());

		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "Data is Empty");
		}

		return "ShowAll";

	}


}
