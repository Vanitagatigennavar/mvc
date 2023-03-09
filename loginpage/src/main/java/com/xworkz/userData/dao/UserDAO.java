package com.xworkz.userData.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.xworkz.userData.dto.UserDTO;

public interface UserDAO {
	public Boolean save(UserDTO userDTO );

	public List<UserDTO> getByEmail(String email);

//	public List<UserDTO> findByEmailAndPassword(String userEmail, String password);
//
//	public Boolean updateStatusByEmail(String email, String status);
//
//	public Boolean updatePasswordByEmail(String password, String userEmail);
//
//	Boolean sendEmail(String userEmail, String password, UserDTO userDTO);
//
//	public Boolean updateCountByEmail(Integer count, String userEmail);
//	
//	public Boolean resetPasswordByEmailAndOTP(String userEmail,String password,String status,Integer count,Integer otp);
//	
//	public Boolean generateOTPByEmail(String email, Integer otp, LocalTime time, LocalDate date);


}
