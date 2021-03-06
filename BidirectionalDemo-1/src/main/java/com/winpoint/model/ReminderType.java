package com.winpoint.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class ReminderType {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="reminderTypeId", updatable=false)
	private Integer reminderTypeId;
	private String reminderTypeCategory;
	
//	@OneToMany(targetEntity = StudentCourseDetails.class)
//	@JoinColumn(name = "reminderTypeId", referencedColumnName = "reminderTypeId")
//	private Set<StudentCourseDetails> mappingStudentCourseDetails;
	
	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingReminderType")
	private Set<StudentCourseDetails> mappingStudentCourseDetails;	

	
}
