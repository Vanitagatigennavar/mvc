package com.xworkz.milkshop.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.milkshop.dto.MilkShopDTO;

@Repository
public class MilkShopImpl implements MilkShopDAO {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(MilkShopDTO dto) {
		System.out.println("calling save method ");
		EntityManager createEntityManager = factory.createEntityManager();

		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(dto);
			transaction.commit();

		} catch (PersistenceException e) {
			System.out.println("exceptinon in save dao" + e.getMessage());
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return true;
	}

}