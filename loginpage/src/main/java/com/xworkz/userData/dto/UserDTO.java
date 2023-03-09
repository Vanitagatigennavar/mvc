package com.xworkz.userData.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "travel_info")
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
		@NamedQuery(name = "getByEmail", query = "select user.userEmail from UserDTO user where user.userEmail=:mail"),
//		@NamedQuery(name = "findByEmailAndPassword", query = "select user from UserDTO user where user.userEmail=:mail And user.password =:pass"),
//		@NamedQuery(name = "changeStatus", query = "update UserDTO user set user.status = :stat where user.userEmail = :mail"),
//		@NamedQuery(name = "updateCount", query = "update UserDTO user set user.count = :cnt where user.userEmail = :mail"),
//		@NamedQuery(name = "updatePassword", query = "update UserDTO user set user.password=:pass where user.userEmail=:mail"),
//		@NamedQuery(name = "resetPasswordByEmailAndOTP", query = "update UserDTO as user set user.password=:pass ,user.status=:stat,user.count=:count where user.userEmail=:mail and user.otp=otp"),
//		@NamedQuery(name = "generateOTPTimeAndDateByEmail", query = "update UserDTO user set user.otp=:otp,user.time=:time,user.date=:date where user.userEmail=:mail"),
		})

public class UserDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
//	@NotNull
//	@NotEmpty
//	@Length(min = 3)
//	@Length(max = 50)
	private String userName;
//	@NotNull
//	@NotEmpty
//	@Length(min = 3)
//	@Length(max = 50)
	private String userEmail;
//	@NotNull
//	@NotEmpty
//	@Length(min = 10)
//	@Length(max = 13)
	private String contactInfo;
	private String password;
	private String status;
	private Integer count;
//	private Integer otp;
//	private LocalTime time;
//	private LocalDate date;
//	private String fileName;
	public UserDTO(String userName, String userEmail, String contactInfo, String password) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.contactInfo = contactInfo;
		this.password = password;
	}
	

	
	}

//	public UserDTO(@NotNull @NotEmpty @Length(min = 3) @Length(max = 50) String userName,
//			@NotNull @NotEmpty @Length(min = 3) @Length(max = 50) String userEmail,
//			@NotNull @NotEmpty @Length(min = 10) @Length(max = 13) String contactInfo, String password, String status,
//			Integer count, Integer otp, LocalTime time, LocalDate date, String fileName) {
//		super();
//		this.userName = userName;
//		this.userEmail = userEmail;
//		this.contactInfo = contactInfo;
//		this.password = password;
//		this.status = status;
//		this.count = count;
//		this.otp = otp;
//		this.time = time;
//		this.date = date;
//		this.fileName = fileName;
//	}


