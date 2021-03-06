package com.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class TestDetails {
//	checked
//	redo fk
	@Id
	private Integer testDetailId;
	private Integer courseId;//
	private Integer testNumber;
	private Integer totalQuestions;
	private String rules;
	private String testFees;
	private String negativeMarking;
	private Integer evaluationTypeId;
	private Integer createdBy;
	private Date createdDate;
	
	
	@OneToMany(targetEntity = UserTestDetails.class)
	@JoinColumn(name = "testDetailId", referencedColumnName = "testDetailId")
	private Set<UserTestDetails> UserTestDetails;
	
	
	
	
//
//	
//	
//	
//	///////////////////////////
//
	

}
