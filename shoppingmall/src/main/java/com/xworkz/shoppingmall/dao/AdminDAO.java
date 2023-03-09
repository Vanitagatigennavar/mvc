package com.xworkz.shoppingmall.dao;

import java.time.LocalTime;
import java.util.List;

import com.xworkz.shoppingmall.entity.AdminEntity;

public interface AdminDAO {

	AdminEntity findByAdminNameAndpassword(String malladminname, String adminpassword);

	AdminEntity updateNoOfWrongAttemptByName(String malladminname, int noofattempts);

	AdminEntity findByName(String malladminname);

	AdminEntity updateLoginStatusByName(String malladminname, int loginStatus);

	AdminEntity updateAccountLockedByName(String malladminname, String accountLocked);

	AdminEntity updateGeneratedPasswordByName(String malladminname, String generatedPassword);

	AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String adminpassword);

	AdminEntity findByMallName(String shoppingmallname);

	AdminEntity updateGeneratedPasswordByMallName(String shoppingmallname, String generatedPassword);

	AdminEntity updateLoginCountByAdminName(String malladminname, int loginCount);

	AdminEntity updateTimeByMallName(String shoppingmallname, LocalTime time);
	
	AdminEntity updateAccountUnlockByName(String shoppingmallname,String accountLocked);
	
	AdminEntity updateNoOfWrongAttemptsByMallName(String shoppingmallname,int noofattempts);
	
	AdminEntity findByGeneratedPassword(String generatedPassword);
	
	AdminEntity updateGeneratedPasswordTimeByGeneratedPassword(String generatedPassword,LocalTime generatedPasswordTime);

}
