package com.xworkz.clips.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="clips_info")
public class ClipsEntity {
	private Integer id;
	private String clipName;
	private String clipColor;
	private String clipShape;
}
