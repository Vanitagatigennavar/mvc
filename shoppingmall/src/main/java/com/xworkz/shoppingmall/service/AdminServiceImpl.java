package com.xworkz.shoppingmall.service;

import java.time.LocalTime;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.google.protobuf.Duration;
import com.xworkz.shoppingmall.dao.AdminDAO;
import com.xworkz.shoppingmall.entity.AdminEntity;
@Service
public class AdminServiceImpl implements AdminService {
//private static final int MAX_ATTEMPTS=3;
	
	@Autowired
	private AdminDAO dao;
	
	AdminEntity Entity; 
	int loginCount=0;
	int countFirstLogin=0;
	
	@Override
		public AdminEntity findByAdminNameAndpassword(String malladminname, String adminpassword) {
			AdminEntity findByAdminNameAndpassword = dao.findByAdminNameAndpassword(malladminname, adminpassword);
			
			if(findByAdminNameAndpassword!=null) {
				loginCount++;
				findByAdminNameAndpassword.setLoginCount(loginCount);
				dao.updateLoginCountByAdminName(malladminname,findByAdminNameAndpassword.getLoginCount());
				if(findByAdminNameAndpassword.getFirstLogin() < 1) {
					countFirstLogin++;
					System.out.println(countFirstLogin);
					findByAdminNameAndpassword.setFirstLogin(countFirstLogin);
					dao.updateLoginStatusByName(malladminname,findByAdminNameAndpassword.getFirstLogin());
					System.out.println(findByAdminNameAndpassword);
					System.out.println("first login running");
					//String string=generatedPassword(count).toString();
					//System.out.println(string);
					findByAdminNameAndpassword.setGeneratedPassword(generatedPassword(8));
					System.out.println(generatedPassword(8));
						dao.updateGeneratedPasswordByName( malladminname,findByAdminNameAndpassword.getGeneratedPassword());
					String mallemail = findByAdminNameAndpassword.getMallemail();
					String generatedPassword = findByAdminNameAndpassword.getGeneratedPassword();
					sendMail(mallemail,generatedPassword);
					return findByAdminNameAndpassword;
					}
				return findByAdminNameAndpassword;
				}
			
				else {
					int count1=0;
					AdminEntity findByName = dao.findByName(malladminname);
					if(findByName != null) {
						
						count1=findByName.getNoofattempts();
					System.out.println("checking the count before++"+count1);
					}
					
					if(count1 < 3) {
						count1++;
						System.out.println("checking the count after"+count1);
						System.out.println("update the wrong attempts");
						dao.updateNoOfWrongAttemptByName(malladminname, count1);
					}
					if(count1 >=3) {
						System.out.println("count is graeter than 3 locking the account");
						findByName.setAccountlocked("Locked");
						dao.updateAccountLockedByName(malladminname, findByName.getAccountlocked());
					}
				
			return null;
        }
	}

	@Override
	public boolean sendMail(String mallemail, String generatedPassword) {
		
		final String username="vanitabg2126@outlook.com";
		final String password="V@nIT@21";
		Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", "smtp.gmail.com");
		   props.put("mail.smtp.port", "587");
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		         return new PasswordAuthentication(username,password);
		      }
		   });
		   session.setDebug(true);
		   try {
			   Message msg = new MimeMessage(session);
			   msg.setFrom(new InternetAddress(username));

			   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mallemail));
			   msg.setSubject("login password");
			   msg.setText("this is temporary password for the first login please change the password"+"\n"+generatedPassword(8));
			   Transport.send(msg);
			   System.out.println("Message done");
		   
			
		} catch (MessagingException e) {
			 throw new RuntimeException(e);
		}
		
		return true;
	}
	
	public static String generatedPassword(int length){
		
		System.out.println("generate password");
		String[] ref= {"abcdfghjk","sghjlkjhgf","gjjhkjhgf","124568765"};
		String combinedChars=ref[0]+ref[1]+ref[2]+ref[3];
		Random random=new Random();
		
		char[] password=new char[length];
		password[0]=ref[0].charAt(random.nextInt(ref[0].length()));
		password[1]=ref[1].charAt(random.nextInt(ref[1].length()));
		password[2]=ref[2].charAt(random.nextInt(ref[2].length()));
		password[3]=ref[3].charAt(random.nextInt(ref[3].length()));
		
		for(int i=4;i<password.length;i++) {
			password[i]=combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		System.out.println(password);
		String string =password.toString();
		return string;
		}

	@Override
		public AdminEntity findByName(String malladminname) {
			
			return dao.findByName(malladminname);
		}

	@Override
	public AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String adminpassword) {
		return dao.updatePasswordByGeneratedPassword(generatedPassword,adminpassword);
		
	}
	@Override
		public AdminEntity findByMallName(String shoppingmallname) {
			AdminEntity findByMallName = dao.findByMallName(shoppingmallname);
			if(findByMallName!=null) {
				findByMallName.setTime(LocalTime.now());
				dao.updateTimeByMallName(shoppingmallname,findByMallName.getTime());
				dao.updateTimeByMallName(shoppingmallname,findByMallName.getGeneratedPasswordTime());
				sendMail(findByMallName.getMallemail(),findByMallName.getGeneratedPassword());
			}
					return null;
			
		}
public static String encryption(String value,int secretKey) {
	String encrypt="";
	for(int i=0;i<value.length();i++) {
		char ch=value.charAt(i);
		ch+=secretKey;
		encrypt=encrypt+ch;
	}
	return encrypt;
	
}
public static String decryption(String encrypt,int secretKey) {
	String decrypt="";
	for(int i=0;i<encrypt.length();i++) {
		char ch=encrypt.charAt(i);
		ch+=secretKey;
		encrypt=encrypt+ch;
	}
	return decrypt;
	}

@Override
public AdminEntity updateAccountUnLockedByName(String shoppingmallname, String accountlocked) {
	
	return dao.updateAccountLockedByName(shoppingmallname, accountlocked);
}
}
