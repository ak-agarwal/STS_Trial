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
public class TestDifficulty {
//	checked
//	fk

	@Id
	private Integer testDifficultyLevelId;
	private Integer testDetailId; // comp pk
	private Integer topicId;
	private Integer difficultyLevelId;
	private Integer numberOfQuestions;
	private Integer createdBy;
	private Date createdDate;


	@OneToMany(targetEntity = TestDetails.class)
	@JoinColumn(name = "testDetailId", referencedColumnName = "testDetailId")
	private Set<TestDetails> TestDetails;

}
