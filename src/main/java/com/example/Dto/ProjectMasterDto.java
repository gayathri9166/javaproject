package com.example.Dto;

import java.sql.Date;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ProjectMasterDto {
	
	private String projectname;
	private String pricingmodel;
	private String itservice;
	private String servicemodel;
	private Date startdate;
	private Date enddate;
	private int clientid;
	private int verticalid;
	private String executionmodel;
	@Id
	private int projectid;
	private String remarks;
	private char serviceline;
	private String projectlocation;
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getPricingmodel() {
		return pricingmodel;
	}
	public void setPricingmodel(String pricingmodel) {
		this.pricingmodel = pricingmodel;
	}
	public String getItservice() {
		return itservice;
	}
	public void setItservice(String itservice) {
		this.itservice = itservice;
	}
	public String getServicemodel() {
		return servicemodel;
	}
	public void setServicemodel(String servicemodel) {
		this.servicemodel = servicemodel;
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
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public int getVerticalid() {
		return verticalid;
	}
	public void setVerticalid(int verticalid) {
		this.verticalid = verticalid;
	}
	public String getExecutionmodel() {
		return executionmodel;
	}
	public void setExecutionmodel(String executionmodel) {
		this.executionmodel = executionmodel;
	}
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public char getServiceline() {
		return serviceline;
	}
	public void setServiceline(char serviceline) {
		this.serviceline = serviceline;
	}
	public String getProjectlocation() {
		return projectlocation;
	}
	public void setProjectlocation(String projectlocation) {
		this.projectlocation = projectlocation;
	}
	
}
