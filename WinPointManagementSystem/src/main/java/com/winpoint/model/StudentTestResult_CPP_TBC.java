package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StudentTestResult_CPP_TBC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StudentTestResult_CPP_TBC_Id", updatable = false)
	private Integer StudentTestResult_CPP_TBC_Id;
	private Integer qNumber;
	private Character studentResponse;
	private String isCorrect;
	private Integer createdBy;
	@Column(columnDefinition = "datetime")
	private Date createdDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userTestId", nullable = false)
	private UserTestDetails mappingUserTestDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questionId", nullable = false)
	private TechnicalQuestionBank mappingTechnicalQuestionBank;

}
