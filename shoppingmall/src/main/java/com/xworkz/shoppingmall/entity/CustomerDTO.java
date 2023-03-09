package com.xworkz.shoppingmall.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="personal_datails")
public class CustomerDTO extends AbstractEntity implements Serializable {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
@Column(name = "Name")
private String name;
@Column(name = "Email")
private String email;
@Column(name = "Mobile_No")
private long mobileNo;
@Column(name = "Age")
private int age;
@Column(name = "Country")
private String country;
@Column(name = "State")
private int state;
@Column(name = "City")
private String city;
@Column(name = "Pin_Code")
private int pincode;
public CustomerDTO(String createdBy, LocalDateTime createdByDate, String updatedBy, LocalDateTime updatedByDate,
		String name, String email, long mobileNo, int age, String country, int state, String city, int pincode) {
	super(createdBy, createdByDate, updatedBy, updatedByDate);
	this.name = name;
	this.email = email;
	this.mobileNo = mobileNo;
	this.age = age;
	this.country = country;
	this.state = state;
	this.city = city;
	this.pincode = pincode;
}


}
