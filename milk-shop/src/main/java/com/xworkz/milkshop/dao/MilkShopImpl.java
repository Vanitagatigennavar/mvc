package com.xworkz.milkshop.dao;

import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dto.MilkShopDTO;
@Repository
public class MilkShopImpl implements MilkShopDAO {
	
public MilkShopImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(MilkShopDTO dto) {
		System.out.println("created"+this.getClass().getSimpleName());
		return true;
	}
	
	

}
