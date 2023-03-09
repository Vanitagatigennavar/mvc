package com.xworkz.shoppingmall.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mall")
@NamedQuery(name = "findByAdminNameAndpassword",query = "select mall from AdminEntity mall where mall.malladminname=:nm and mall.adminpassword=:pd")
@NamedQuery(name = "updateNoOfWrongAttemptByName",query = "update AdminEntity mall set mall.noofattempts=:na where mall.malladminname=:nm")
@NamedQuery(name = "findByName",query = "select mall from AdminEntity mall where mall.malladminname=:nm")
@NamedQuery(name = "updateLoginStatusByName",query = "update AdminEntity mall set mall.loginStatus=:lg where mall.malladminname=:nm")
@NamedQuery(name = "updateAccountLockedByName",query = "update AdminEntity mall set mall.accountlocked=:al where mall.malladminname=:nm")
@NamedQuery(name = "updateGeneratePasswordByName",query = "update AdminEntity mall set mall.generatedPassword=:gpas where mall.malladminname=:nm")
@NamedQuery(name = "updatePasswordByGeneratedPassword",query = "update AdminEntity mall set mall.adminpassword=:ps,mall.confirmPassword=:cn where mall.generatedPassword=:gs")
@NamedQuery(name = "findByMallName",query = "select mall from AdminEntity mall where mall.shoppingmallname=:sn")
@NamedQuery(name = "updateGeneratedPasswordByMallName",query = "update AdminEntity mall set mall.generatedPassword=:gs where mall.shoppingmallname=:ps")
public class AdminEntity extends AbstractEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Column(name = "shoppingmallname")
	private String shoppingmallname;
	@Column(name = "mall_admin_name")
	private String malladminname;
	@Column(name = "admin_password")
	private String adminpassword;
	@Column(name = "active")
	private boolean active;
	@Column(name = "account_locked")
	private String accountlocked;
	@Column(name = "no_of_attempts")
	private int noofattempts;
	@Column(name = "mall_email")
	private String mallemail;
	private int firstLogin;
	private String generatedPassword;
	private int loginCount;
	private LocalTime time;
	private LocalTime generatedPasswordTime;
	public AdminEntity(String createdBy, LocalDateTime createdByDate, String updatedBy, LocalDateTime updatedByDate,
			String shoppingmallname, String malladminname, String adminpassword, boolean active, String accountlocked,
			int noofattempts, String mallemail, int firstLogin, String generatedPassword, int loginCount,
			LocalTime time) {
		super(createdBy, createdByDate, updatedBy, updatedByDate);
		this.shoppingmallname = shoppingmallname;
		this.malladminname = malladminname;
		this.adminpassword = adminpassword;
		this.active = active;
		this.accountlocked = accountlocked;
		this.noofattempts = noofattempts;
		this.mallemail = mallemail;
		this.firstLogin = firstLogin;
		this.generatedPassword = generatedPassword;
		this.loginCount = loginCount;
		this.time = time;
		this.generatedPasswordTime=generatedPasswordTime;
	}
	
}
