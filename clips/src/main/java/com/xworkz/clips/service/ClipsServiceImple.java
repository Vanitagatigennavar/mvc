package com.xworkz.clips.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.clips.dao.ClipsDAO;
import com.xworkz.clips.dto.ClipsEntity;

public class ClipsServiceImple implements ClipsService {
	@Autowired
	private ClipsDAO dao;
	@Override
	public boolean validateAndSave(ClipsEntity entity) {
		System.out.println("validate and save");
		return false;
	}

	@Override
	public List<ClipsEntity> findAll() {
		System.out.println("Calling FindAll Method From Service");
		List<ClipsEntity> find = dao.findAll();
		return this.dao.findAll();
	
	}

}
