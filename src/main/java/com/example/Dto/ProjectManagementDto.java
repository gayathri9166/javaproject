package com.example.Dto;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
public class ProjectManagementDto {
	
	private int projectid;
	private int emp_id;
	private Date startdate;
	private Date enddate;
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
