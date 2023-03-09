package com.xworkz.shoppingmall.service;

import com.xworkz.shoppingmall.entity.AdminEntity;

public interface AdminService {

	AdminEntity findByAdminNameAndpassword(String malladminname, String adminpassword);

	// List<AdminEntity>updateFailedAttempts(String adminName,int noOfWrongAttempt);

	default boolean sendMail(String mallemail, String adminpassword) {
		return true;
	}
	/// AdminEntity attemptByPassword(String mallemail );

	AdminEntity findByName(String malladminname);

	AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String adminpassword);

	AdminEntity findByMallName(String shoppingmallname);

	AdminEntity updateAccountUnLockedByName(String shoppingmallname,String accountlocked); 


}
