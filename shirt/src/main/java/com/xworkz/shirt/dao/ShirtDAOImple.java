package com.xworkz.shirt.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.shirt.dto.ShirtEntity;

@Repository
public class ShirtDAOImple implements ShirtDAO {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(ShirtEntity entity) {
		System.out.println("save method created" + entity);
		EntityManager createEntityManager = factory.createEntityManager();

		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			System.out.println("exception in save dao" + e.getMessage());
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return true;
	}

}
