package com.xworkz.userData.service;

import java.util.List;

import com.xworkz.userData.dto.UserDTO;

public interface UserService {
	public String passwordGenerator();

	public Boolean validateAndSave(UserDTO dto);

	public List<UserDTO> getByEmail(String email);

//	public List<UserDTO> findByNameAndPassword(String email, String password);
//
//	List<UserDTO> findByEmailAndPassword(String userEmail, String password, UserDTO dto);
//
//	public void updateStatus(String userEmail, String status);
//
	public Boolean sendEmail(String userEmail, String Password, UserDTO dto);
//
//	public Boolean updatePasswordByEmail(String password, String userEmail);
//
//	public void updateCountByEmail(int count, String userEmail);
//
//	public Boolean resetPasswordByEmailAndOTP(String password, String userEmail, Integer otp, UserDTO dto);
//
//	Integer OTPGenerator();
//
//	Boolean generateOTPByEmail(String userEmail, UserDTO dto);
//
//	Boolean sendOTP(String userEmail, Integer otp);
//
//	String encryptPassword();
//
//	String encryptPassword(String password);
//
//	String decryptPassword(String password);
//
}