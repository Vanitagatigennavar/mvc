package com.xworkz.criminals.service;

import java.util.List;

import com.xworkz.criminals.dto.CriminalDTO;

public interface CriminalService {

	boolean validateAndsave(CriminalDTO dto);

	List<CriminalDTO> findAll();
}
