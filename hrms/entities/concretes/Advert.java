package com.hrms.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "adverts")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Advert {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "detail")
	private String detail;
	@Column(name = "country")
	private String country;
	@Column(name = "min_salary")
	private int minSalary;
	@Column(name = "max_salary")
	private int maxSalary;
	@Column(name = "number_of_position")
	private int numberOfPosition;
	@Column(name = "advert_date")
	private Date advertDate;
	@Column(name = "deadline_date")
	private Date deadlineDate;
	@Column(name = "active")
	private boolean active;
	
	@ManyToOne()
	@JoinColumn(name = "job_id")
	private Job job;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

}
