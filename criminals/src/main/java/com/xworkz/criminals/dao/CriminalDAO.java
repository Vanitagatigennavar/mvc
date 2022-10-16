package com.xworkz.criminals.dao;

import java.util.List;

import com.xworkz.criminals.dto.CriminalDTO;

public interface CriminalDAO {
    
	boolean save(CriminalDTO dto);
	List<CriminalDTO> findAll();
}
