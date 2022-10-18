package com.xworkz.clips.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.clips.dto.ClipsEntity;
@Repository
public class ClipsDAOImplementation implements ClipsDAO {
	@Autowired
	private EntityManagerFactory factory;

	EntityManager manager;
	@Override
	public boolean save(ClipsEntity entity) {
		System.out.println("save"+entity);
		try {
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(entity);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return true;
	
	}

	@Override
	public List<ClipsEntity> findAll() {
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("findAll");
			List<ClipsEntity> resultList = query.getResultList();
			return resultList;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return findAll();
	
	}

}
