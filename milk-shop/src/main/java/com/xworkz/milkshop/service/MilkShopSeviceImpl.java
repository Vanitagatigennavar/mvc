package com.xworkz.milkshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.milkshop.dao.MilkShopDAO;
import com.xworkz.milkshop.dto.MilkShopDTO;
@Service
public class MilkShopSeviceImpl implements MilkShopService {
	
@Autowired	
 private MilkShopDAO dao;
	@Override
	public boolean validateAndsave(MilkShopDTO dto) {
		System.out.println("create "+this.getClass().getSimpleName());
		System.out.println("MilkShopDAO"+dao);
		return true;
	}

	
	

}
