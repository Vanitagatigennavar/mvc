package com.xworkz.shoppingmall.dao;

import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.shoppingmall.entity.AdminEntity;
@Repository
public class AdminDAOImpl implements AdminDAO//AdminRepository 
{
	@Autowired
    private  EntityManagerFactory entityManagerFactory ;
	@Override
	public AdminEntity findByAdminNameAndpassword(String malladminname, String adminpassword) {
		EntityManager createEntityManager=entityManagerFactory.createEntityManager();
		
		try {
		Query createNamedQuery=createEntityManager.createNamedQuery("findByAdminNameAndpassword");
		createNamedQuery.setParameter("nm",malladminname);
		createNamedQuery.setParameter("pd",adminpassword);
		Object resultList=createNamedQuery.getSingleResult();
		System.out.println(resultList);
		if(resultList!=null) {
			AdminEntity ref=(AdminEntity)resultList;
			System.out.println("result is present"+resultList);
			return ref;		
		}else {
			System.out.println("result is not present");
			return null;
		}
		}catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		return null;
	}
	@Override
	public AdminEntity updateNoOfWrongAttemptByName(String malladminname, int noofattempts) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateNoOfWrongAttemptByName");
			query.setParameter("nm", malladminname);
			query.setParameter("na", noofattempts);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
		}catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		
		return null;
	}
	@Override
	public AdminEntity findByName(String malladminname) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		try {
			System.out.println("vanita");
		Query query = createEntityManager.createNamedQuery("findByName");
		query.setParameter("nm", malladminname);
		Object singleResult = query.getSingleResult();
		if(singleResult!=null) {
			AdminEntity refe=(AdminEntity)singleResult;
			System.out.println("list is present"+refe);
			return refe;
			
		}else {
			System.out.println("list is null");
			return null;
		}
		}catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		return null;
	}
	@Override
	public AdminEntity updateLoginStatusByName(String malladminname, int loginStatus) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateLoginStatusByName");
			query.setParameter("nm", malladminname);
			query.setParameter("lg", loginStatus);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
			
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		return null;
	}
	@Override
	public AdminEntity updateAccountLockedByName(String malladminname, String accountLocked) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateAccountLockedByName");
			query.setParameter("nm", malladminname);
			query.setParameter("al", accountLocked);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
			return null;
		}catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		
		return null;
	}
	@Override
	public AdminEntity updateGeneratedPasswordByName(String malladminname, String generatedPassword) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateGeneratePasswordByName");
			query.setParameter("nm", malladminname);
			query.setParameter("gpas", generatedPassword);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
		}catch (PersistenceException e) {
		e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		return null;
	}
	@Override
	public AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String adminpassword) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updatePasswordByGeneratedPassword");
			query.setParameter("ps", adminpassword);
			query.setParameter("gs", generatedPassword);
			
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			
			
		}catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			createEntityManager.close();
		}
		return null;
	}
	@Override
	public AdminEntity findByMallName(String shoppingmallname) {
	EntityManager createEntityManager = entityManagerFactory.createEntityManager();
	try {
		Query query = createEntityManager.createNamedQuery("findByMallName");
		query.setParameter("mn", shoppingmallname);
		Object singleResult = query.getSingleResult();
		if(singleResult!=null) {
			AdminEntity ref=(AdminEntity)singleResult;
			System.out.println("result is not null"+ref);
			return ref;
		}else {
			System.out.println("result is null");
			return null;
		}
	}catch (PersistenceException e) {
		e.printStackTrace();
	
	}finally {
		createEntityManager.close();
	}
		return null;
	}
	@Override
	public AdminEntity updateGeneratedPasswordByMallName(String shoppingmallname, String generatedPassword) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("");
			query.setParameter("smn", shoppingmallname);
			query.setParameter("gs", generatedPassword);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
			
			
		}catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			createEntityManager.close();
		}
		return null;
	}
	@Override
	public AdminEntity updateLoginCountByAdminName(String malladminname, int loginCount) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateLoginCountByAdminName");
			query.setParameter("nm", malladminname);
			query.setParameter("lc", loginCount);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
			
			
		}catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			createEntityManager.close();
		}
		return null;
	
	}
	@Override
	public AdminEntity updateTimeByMallName(String shoppingmallname, LocalTime time) {
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateLoginCountByAdminName");
			query.setParameter("mn", shoppingmallname);
			query.setParameter("ti", time);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
			
			
		}catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			createEntityManager.close();
		}
		return null;
	
	}
	@Override
	public AdminEntity updateAccountUnlockByName(String shoppingmallname, String accountLocked) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			Query query = entityManager.createNamedQuery("updateAccountUnlockByName");
			query.setParameter("mn", shoppingmallname);
			query.setParameter("al", accountLocked);
			int update = query.executeUpdate();
			System.out.println(update+"");
			transaction.commit();
		} catch (PersistenceException e) {
			
			e.printStackTrace();
			transaction.rollback();
		}
		finally {
			entityManager.close();
		}
		return null;
	}
	@Override
	public AdminEntity updateNoOfWrongAttemptsByMallName(String shoppingmallname, int noofattempts) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			Query query = entityManager.createNamedQuery("updateNoOfWrongAttemptsByMallName");
			query.setParameter("smn", shoppingmallname);
			query.setParameter("noa", noofattempts);
			int update = query.executeUpdate();
			System.out.println(update);
			transaction.commit();
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			entityManager.close();
		}
		
		return null;
	}
	@Override
	public AdminEntity findByGeneratedPassword(String generatedPassword) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findByGeneratedPassword");
			query.setParameter("gp", generatedPassword);
			Object singleResult = query.getSingleResult();
			System.out.println(singleResult);
			if(singleResult!=null) {
				AdminEntity reference=(AdminEntity) singleResult;
				return reference;
			}
		} catch (PersistenceException e) {
			
			e.printStackTrace();
		}finally {
			entityManager.close();
		}
		return null;
	}
	@Override
	public AdminEntity updateGeneratedPasswordTimeByGeneratedPassword(String generatedPassword,
			LocalTime generatedPasswordTime) {
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	try {
		transaction.begin();
		Query query = entityManager.createNamedQuery("updateGeneratedPasswordTimeByGeneratedPassword");
		query.setParameter("gp", generatedPassword);
		query.setParameter("gpt", generatedPasswordTime);
		int executeUpdate = query.executeUpdate();
		System.out.println(executeUpdate);
		transaction.commit();
	} catch (Exception e) {
		
		e.printStackTrace();
	}finally {
		entityManager.close();
	}
	
		return null;
	}
}