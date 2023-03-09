package com.xworkz.userData.dao.impl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.userData.dao.UserDAO;
import com.xworkz.userData.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public Boolean save(UserDTO userDTO) {
		System.out.println("calling DAO Save");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		try {

			transaction.begin();
			manager.persist(userDTO);

			transaction.commit();

		} catch (PersistenceException p) {
			p.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return true;

	}

	@Override
	public List<UserDTO> getByEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			manager = factory.createEntityManager();
			Query query = manager.createNamedQuery("getByEmail");
			query.setParameter("mail", email);
			List<UserDTO> resultList = query.getResultList();
			System.out.println(resultList);
			if (resultList.isEmpty()) {
				return null;
			} else if (!resultList.isEmpty()) {
				return resultList;
			}
		} catch (PersistenceException p) {
			p.printStackTrace();
		} finally {
			manager.close();
		}

		return null;
	}
}
//	@Override
//	public List<UserDTO> findByEmailAndPassword(String userEmail, String password) {
//		EntityManager manager = factory.createEntityManager();
//		
//		try {
//			manager = factory.createEntityManager();
//			Query query = manager.createNamedQuery("findByEmailAndPassword");
//			query.setParameter("mail", userEmail);
//			query.setParameter("pass", password);
//			List<UserDTO> resultList = query.getResultList();
//			System.out.println(resultList);
//			if (resultList.isEmpty()) {
//				return null;
//			} else if (!resultList.isEmpty()) {
//				return resultList;
//			}
//		} catch (PersistenceException p) {
//			p.printStackTrace();
//		} finally {
//			manager.close();
//		}
//		return null;
//	}
//
//	@Override
//	public Boolean updateStatusByEmail(String email, String status) {
//		//EntityManager manager = null;
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		try {
//			//manager = this.factory.createEntityManager();
//			//EntityTransaction transaction = manager.getTransaction();
//			transaction.begin();
//			Query query2 = manager.createNamedQuery("changeStatus");
//			query2.setParameter("stat", status);
//			query2.setParameter("mail", email);
//			query2.executeUpdate();
//			transaction.commit();
//		} catch (PersistenceException p) {
//			p.printStackTrace();
//		} finally {
//			manager.close();
//		}
//		return true;
//	}
//
//	@Override
//	public Boolean updatePasswordByEmail(String password, String userEmail) {
//		System.out.println("Update password method is called");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		try {
//			//EntityManager manager = null;
//			//manager = this.factory.createEntityManager();
//			//EntityTransaction transaction = manager.getTransaction();
//			transaction.begin();
//			Query query1 = manager.createNamedQuery("updatePassword");
//			query1.setParameter("pass", password);
//			query1.setParameter("mail", userEmail);
//			query1.executeUpdate();
//			transaction.commit();
//
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//			System.out.println("Exception is handled");
//		} finally {
//			manager.close();
//		}
//		return true;
//	}
//
//	@Override
//	public Boolean sendEmail(String userEmail, String password, UserDTO userDTO) {
//
//		return true;
//	}
//
//	@Override
//	public Boolean updateCountByEmail(Integer count, String userEmail) {
//		//EntityManager manager = null;
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		try {
//			//manager = this.factory.createEntityManager();
//			//EntityTransaction transaction = manager.getTransaction();
//			transaction.begin();
//			Query query2 = manager.createNamedQuery("updateCount");
//			query2.setParameter("cnt", count);
//			query2.setParameter("mail", userEmail);
//			query2.executeUpdate();
//			transaction.commit();
//			System.out.println("UpdateCountByEmail is created");
//		}
//
//		catch (PersistenceException p) {
//			p.printStackTrace();
//			System.out.println("Exception is catched");
//		} finally {
//			manager.close();
//
//		}
//		return true;
//
//	}
//
//	@Override
//	public Boolean resetPasswordByEmailAndOTP(String userEmail, String password, String status, Integer count,
//			Integer otp) {
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		//manager = factory.createEntityManager();
//		try {
//			//EntityTransaction transaction = manager.getTransaction();
//			transaction.begin();
//			Query query = manager.createNamedQuery("resetPasswordByEmailAndOTP");
//			query.setParameter("mail", userEmail);
//			query.setParameter("pass", password);
//			query.setParameter("stat", status);
//			query.setParameter("count", count);
//			query.setParameter("otp", otp);
//			query.executeUpdate();
//			transaction.commit();
//			System.out.println("persitence Exception may occur");
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//		} finally {
//			manager.close();
//		}
//		return true;
//
//	}
//
//	@Override
//	public Boolean generateOTPByEmail(String userEmail, Integer otp, LocalTime time, LocalDate date) {
////		manager = factory.createEntityManager();
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		try {
//			//EntityTransaction transaction = manager.getTransaction();
//			transaction.begin();
//			Query query = manager.createNamedQuery("generateOTPTimeAndDateByEmail");
//			query.setParameter("mail", userEmail);
//			query.setParameter("otp", otp);
//			query.setParameter("time", time);
//			query.setParameter("date", date);
//			query.executeUpdate();
//			transaction.commit();
//			System.out.println("persistence Exception may occur");
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//			System.out.println("Persistence Exception Occured");
//		} finally {
//			manager.close();
//		}
//		return true;
//	}
//}
