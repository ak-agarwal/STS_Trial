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
public class UserTestDetails {
//	checked 
//	redo fk
	@Id
	private Integer userTestId;//
	private Integer userId;//
	private Integer testDetailsId;//
	private Integer marksReceived;
	private String timeTaken;
	private Integer numberOfRegistration;
	private String feeStatus;
	private Integer createdBy;
	private Date createdDate;
	private Integer attempted;
	private String evaluationDone;

	@OneToMany(targetEntity = StudentsModularTestResult_C_TBC.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentsModularTestResult_C_TBC> ModularTestResult_C_TBC;

	@OneToMany(targetEntity = StudentTestResult_C_Modular.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResult_C_Modular> StudentTestResult_C_Modular;
//
	@OneToMany(targetEntity = StudentTestResult_CPP_CRT.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResult_CPP_CRT> StudentTestResult_CPP_CRT;
//
	@OneToMany(targetEntity = StudentTestResult_CPP_Modular.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResult_CPP_Modular> StudentTestResult_CPP_Modular;
//
	@OneToMany(targetEntity = StudentTestResult_CPP_TBC.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResult_CPP_TBC> StudentTestResult_CPP_TBC;
//
	@OneToMany(targetEntity = StudentTestResultComputerNetwork_CRT.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResultComputerNetwork_CRT> StudentTestResultComputerNetwork_CRT;
//
	@OneToMany(targetEntity = StudentTestResultJava_CRT.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResultJava_CRT> StudentTestResultJava_CRT;

	@OneToMany(targetEntity = StudentTestResultJava_TBC.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResultJava_TBC> StudentTestResultJava_TBC;

	@OneToMany(targetEntity = StudentTestResultJavaModular.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResultJavaModular> StudentTestResultJavaModular;

	@OneToMany(targetEntity = StudentTestResultJavascriptModular.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResultJavascriptModular> StudentTestResultJavascriptModular;

	@OneToMany(targetEntity = StudentTestResultOperatingSystem_CRT.class)
	@JoinColumn(name = "userTestId", referencedColumnName = "userTestId")
	private Set<StudentTestResultOperatingSystem_CRT> StudentTestResultOperatingSystem_CRT;

	
	
	
//
//	////////////////////////////
//
	

}