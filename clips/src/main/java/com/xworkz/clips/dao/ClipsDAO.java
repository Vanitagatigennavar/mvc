package com.xworkz.clips.dao;

import java.util.List;

import com.xworkz.clips.dto.ClipsEntity;

public interface ClipsDAO {
	boolean save(ClipsEntity entity);

	List<ClipsEntity> findAll();
}
