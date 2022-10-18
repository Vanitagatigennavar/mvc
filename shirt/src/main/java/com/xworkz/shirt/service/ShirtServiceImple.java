package com.xworkz.shirt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.shirt.dao.ShirtDAO;
import com.xworkz.shirt.dto.ShirtEntity;

@Service
public class ShirtServiceImple implements ShirtService {

	@Autowired
	private ShirtDAO dao;

	@Override
	public boolean validateAndsave(ShirtEntity entity) {
		System.out.println("created" + this.getClass().getSimpleName());
		System.out.println("created" + dao);
		dao.save(entity);
		System.out.println("validate and save");
		return true;
	}

}
