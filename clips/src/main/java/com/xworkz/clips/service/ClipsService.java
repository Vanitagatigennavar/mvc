package com.xworkz.clips.service;

import java.util.List;

import com.xworkz.clips.dto.ClipsEntity;

public interface ClipsService {

	boolean validateAndSave( ClipsEntity entity);

	List<ClipsEntity> findAll();
}
