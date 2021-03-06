package com.example.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
//checked
@Entity 
@Data
public class ClientCategory {
//	checked//
	@Id
	private Integer clientCategoryId;
	private String clientCategory;
	private Integer createdBy;
	private Date createdDate;
	
	
	
	
	@OneToMany(targetEntity = UserStudent.class)
	@JoinColumn(name = "clientCategoryId", referencedColumnName = "clientCategoryId")
	Set<UserStudent> UserStudent;
	
	/////////////
	
}
