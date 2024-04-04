package com.example.entity;

import java.sql.Date;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Entity
@Table(name="ProjectManagement")
public class ProjectManagement {
	@Id
	@Column(name = "projectid")
	private int projectid;
	@Column(name="emp_id")
	private int emp_id;
	@DateTimeFormat(pattern= "yyyy-mm-dd")
	@Column(name="startdate")
	private Date startdate;
	@Column(name="enddate")
	private Date enddate;
	
	@ManyToOne
	private EmployeeMaster employeemaster;
	@ManyToOne
	private ProjectMaster projectmaster;
	
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	
	}
	

