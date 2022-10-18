package com.xworkz.shirt.service;

import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

import com.xworkz.shirt.dto.ShirtEntity;

public interface ShirtService {

	public boolean validateAndsave(ShirtEntity entity);

}
