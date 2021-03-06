package com.winpoint.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class FeedbackQuestions {
//	checked//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feedbackQuestionId", updatable = false)
	private Integer feedbackQuestionId;
//	private Integer feedbackCategoryId;
	private String feedbackQuestion;
//	private Integer feedbackQuestionTypeId;
	private Integer createdBy;
	private Date createdDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "feedbackQuestionTypeId", nullable = false)
	private FeedbackQuestionType mappingFeedbackQuestionType; 


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "feedbackCategoryId", nullable = false)
	private FeedbackCategory mappingFeedbackCategory;

//	@OneToMany(targetEntity = FeedbackQuestions.class)
//	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
//	private Set<TestFeedback> TestFeedback;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingFeedbackQuestions")
	private Set<TestFeedback> TestFeedback;
	
//	@OneToMany(targetEntity = CourseFeedback.class)
//	@JoinColumn(name = "feedbackQuestionId", referencedColumnName = "feedbackQuestionId")
//	private Set<CourseFeedback> CourseFeedback;

	@OneToMany(cascade = CascadeType.ALL, 
			  fetch = FetchType.LAZY, 
			  mappedBy = "mappingFeedbackQuestions")
	private Set<CourseFeedback> CourseFeedback;
	
//	/////////////////

}
