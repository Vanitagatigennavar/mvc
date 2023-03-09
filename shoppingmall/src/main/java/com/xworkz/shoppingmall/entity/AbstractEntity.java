package com.xworkz.shoppingmall.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class AbstractEntity {
	
	private String createdBy="Vanita";
	private LocalDateTime createdByDate=LocalDateTime.now();
	private String updatedBy="";
	private LocalDateTime updatedByDate=LocalDateTime.now();
}
