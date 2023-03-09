package com.xworkz.shoppingmall.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CustomerFeedbackDTO extends AbstractEntity implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "purpose")
	private String purpose;
	@Column(name = "ambience")
	private String ambience;
	@Column(name = "visited_Food_Court")
	private String visitedFoodCourt;
	@Column(name = "visited_Rest_Rooms")
	private String visitedRestRooms;
	@Column(name = "parking_Experience")
	private String parkingExperience;
	@Column(name = "total_Experience")
	private String totalExperience;
	@Column(name = "Feed_back")
	private String feedback;
	public CustomerFeedbackDTO(String createdBy, LocalDateTime createdByDate, String updatedBy,
			LocalDateTime updatedByDate, String purpose, String ambience, String visitedFoodCourt,
			String visitedRestRooms, String parkingExperience, String totalExperience, String feedback) {
		super(createdBy, createdByDate, updatedBy, updatedByDate);
		this.purpose = purpose;
		this.ambience = ambience;
		this.visitedFoodCourt = visitedFoodCourt;
		this.visitedRestRooms = visitedRestRooms;
		this.parkingExperience = parkingExperience;
		this.totalExperience = totalExperience;
		this.feedback = feedback;
	}
	
	
	
}
