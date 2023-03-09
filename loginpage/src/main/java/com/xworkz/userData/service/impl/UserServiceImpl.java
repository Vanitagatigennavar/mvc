package com.xworkz.userData.service.impl;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.userData.dao.UserDAO;
import com.xworkz.userData.dto.UserDTO;
import com.xworkz.userData.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UserServiceImpl serviceImpl;
	private int count;
	@Override
	public String passwordGenerator() {
		
		return null;
	}

	@Override
	public Boolean validateAndSave(UserDTO userDTO) {
		System.out.println("validate an save method is running in the service class");
		ValidatorFactory validator = Validation.buildDefaultValidatorFactory();
		Validator valid = validator.getValidator();
		Set<ConstraintViolation<UserDTO>> set = valid.validate(userDTO);
		if (set.size() > 0) {
			System.out.println("Details Entered Are Invalid");
			return false;
		} else {
			System.out.println("Details Entered Are Valid");
			String password = passwordGenerator();
			String status = "unblocked";
			System.out.println(status);
			Integer count = 0;
			if (password != null) {
				System.out.println("Password Is Not Empty");
				userDTO.setPassword(password);
				userDTO.setStatus(status);
				userDTO.setCount(count);
				System.out.println("Service Impvchdhj"+ userDTO);
				Boolean save = userDAO.save(userDTO);

				if (save) {
					Boolean sendEmail = this.sendEmail(userDTO.getUserEmail(), userDTO.getPassword(), userDTO);
					System.out.println(sendEmail);

				}
			}
			return true;
		}}
	
	

	

	@Override
	public List<UserDTO> getByEmail(String email) {
		System.out.println("Calling findByEmail Method");
		List<UserDTO> byEmail = userDAO.getByEmail(email);
		if (byEmail != null) {
			System.out.println("No Email found");
			return byEmail;
		} else {
			return null;
		}
	}


//	@Override
//	public List<UserDTO> findByEmailAndPassword(String userEmail, String password, UserDTO dto) {
//		 String decPassword = LoginDTO.getPassword();
//				 String passWordEncrypt2 = passWordEncrypt(decPassword);
////				 loginDTO.setPassword(passWordEncrypt2);
//
//				List<UserDTO> findByEmailAndPassword = userDAO.findByEmailAndPassword(dto.getUserEmail(), dto.getPassword());
//				System.out.println("Find By Email and password " + findByEmailAndPassword);
//				if (findByEmailAndPassword != null) {
//					this.count = 0;
//					this.userDAO.updateCountByEmail(count, userEmail);
//					return findByEmailAndPassword;
//				} else if (this.count < 3) {
//					this.count++;
//					System.out.println("checking the password" + this.count);
//					this.userDAO.updateCountByEmail(count, userEmail);
//				}
//				if (this.count >= 3) {
//					System.out.println("checking the condtion" + this.count);
//					dto.setStatus("Blocked");
//
//					userDAO.updateStatusByEmail(userEmail, dto.getStatus());
//				}
//				return findByEmailAndPassword;
//
//	}
//
//	@Override
//	public void updateStatus(String userEmail, String status) {
//		System.out.println("updateStatus by email");
//		Boolean statusUpdated = userDAO.updateStatusByEmail(userEmail, status);
//		System.out.println(statusUpdated);
//	}
//
	@Override
	public Boolean sendEmail(String userEmail, String Password, UserDTO dto) {
		String name = dto.getUserName();
		String security = dto.getPassword();
		String to = userEmail;
		String from = "vanitabg2126@outlook.com";
		String host = "smtp.office365.com";
		String pass = "V@nIT@21";
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.debug", "true");
		properties.put("mail.transport.protocol", "smtp");
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(from, pass);

			}
		});
		session.setDebug(false);
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom();
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Resgistration is Confirmed");
			message.setText("hi" + "" + name + "" + "" + security + ""
					+ "this is to confirm u that registration is succesfull" + "" + "Thankyou");
			System.out.println("sending....");
			Transport.send(message);
			System.out.println("Message sent succefully");
		} catch (MessagingException me) {
			me.printStackTrace();
			System.err.println("Exception catched succesfully");

		}
		return true;
	}
	}
//	@Override
//	public Boolean updatePasswordByEmail(String password, String userEmail) {
//		System.out.println("UpdatedPassword by Email method is called");
//		if (password.length() < 10) {
//			System.out.println("password did'nt match the criteria");
//		} else {
//			List<UserDTO> byEmail = userDAO.getByEmail(userEmail);
//			if (byEmail == null) {
//				System.out.println("Password is incorrect");
//			} else {
//				Boolean updatePasswordByEmail = userDAO.updatePasswordByEmail(password, userEmail);
//				{
//					if (updatePasswordByEmail) {
//						return true;
//					} else {
//						return false;
//					}
//				}
//
//			}
//		}
//		return true;
//	}
//
//	@Override
//	public void updateCountByEmail(int count, String userEmail) {
//		System.out.println("Calling update Count by email Method");
//		userDAO.updateCountByEmail(count, userEmail);
//		System.out.println("Count Updated");
//	
//		
//	}
//
//	@Override
//	public Boolean resetPasswordByEmailAndOTP(String password, String userEmail, Integer otp, UserDTO dto) {
//		System.out.println("Calling ResetPassword Method");
//		if(password.length()<10 && password.length() >12 && password==null)
//		{
//			System.out.println("Password Length is Incorrect");
//		}
//		else
//		{
//			System.out.println("password is valid");
//	 
//		}
//		return true;
//	}
//
//	@Override
//	public Integer OTPGenerator() {
//		System.out.println("Calling OTP generator method");
//		int random = (int) (Math.random() * 9000) + 1000;
//		Integer otp = Integer.valueOf(random);
//		return otp;
//	}
//
//	@Override
//	public Boolean generateOTPByEmail(String userEmail, UserDTO dto) {
//		System.out.println("Calling Generate OTP By Email Method");
//		Integer otp = this.OTPGenerator();
//		dto.setOtp(otp);
//		LocalDateTime mailDateAndTime = LocalDateTime.now();
//		LocalDate date = mailDateAndTime.toLocalDate();
//		LocalTime time = mailDateAndTime.toLocalTime();
//		System.out.println(mailDateAndTime);
//		dto.setDate(date);
//		dto.setTime(time);
//		Boolean otpsent = userDAO.generateOTPByEmail(userEmail, otp, time, date);
//		if (otpsent) {
//			Boolean sendingOTP = this.sendOTP(userEmail, otp);
//			if (sendingOTP) {
//				System.out.println("OTP Sent to Mail Successfully");
//			} else {
//				System.out.println("OTP Not Sent,Unable to Send Mail");
//			}
//		}
//		return true;
//	}
//
//	@Override
//	public Boolean sendOTP(String userEmail, Integer otp) {
//		String to = userEmail;
//		Integer otpSent = otp;
//
//		// Senders email needs to be mentioned
//		String from = "vanitabg2126@outlook.com";
//
//		// Assuming that you are sending mail through outlook smtp
//		String host = "smtp.office365.com";
//
//		// password for the mail
//		String password = "V@nIT@21";
//
//		// get System properties
//		Properties properties = System.getProperties();
//
//		// Setup mail server
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.port", "587");
//		properties.put("mail.smtp.starttls.enable", "true");
//		properties.put("mail.smtp.auth", "true");
//		properties.put("mail.debug", "true");
//		properties.put("mail.transport.protocol", "smtp");
//
//		// Get the Session Object.//and pass username and password
//		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(from, password);
//			}
//		});
//
//		// used to debug smtp issues
//		session.setDebug(true);
//
//		try {
//			// Create a default mime message object.
//			MimeMessage message = new MimeMessage(session);
//
//			// Set From header field of the header
//			message.setFrom(new InternetAddress(from));
//
//			// Set To Header Field of the header
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//
//			// Set Subject header field
//			message.setSubject("Registration Confirmation mail");
//
//			// Set the actual message
//			message.setText("Hi Your OTP to reset password is: " + otpSent);
//
//			System.out.println("Sending......");
//			// Send message
//			Transport.send(message);
//			System.out.println("OTP Sent Successfully");
//
//		} catch (MessagingException max) {
//			max.printStackTrace();
//		}
//		return true;
//	}
//
//	@Override
//	public String encryptPassword() {
//		Encoder encode=Base64.getEncoder();
//		String password =passwordGenerator();
//		String encodeToString=encode.encodeToString(password.getBytes());
//		return encodeToString;
//	}
//
//	@Override
//	public String encryptPassword(String password) {
//
//		Encoder encode=Base64.getEncoder();
//		String password1 = password;
//		String encodeToString=encode.encodeToString(password1.getBytes());
//		return encodeToString;
//		
//	}
//
//	@Override
//	public String decryptPassword(String password) {
//		Decoder decoder= Base64.getDecoder();
//	    byte[] decodePassword =decoder.decode(password);
//	    String decryptedPassword=new String(decodePassword);
//	    System.out.println("Decrypted password:" + decryptedPassword);
//		return decryptedPassword;	
//		}
//
//	@Override
//	public List<UserDTO> findByNameAndPassword(String email, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}		

//	}
		
