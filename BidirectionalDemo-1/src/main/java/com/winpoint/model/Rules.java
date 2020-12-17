package com.winpoint.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Rules {
//	checked
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rulesId", updatable=false)
	private Integer rulesId;
	private String rulesDescription;
	private Integer createdBy;
	private Date createdDate;

}
