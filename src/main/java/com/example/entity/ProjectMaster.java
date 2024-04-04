package com.example.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor; 
import lombok.NoArgsConstructor;

@Entity
@Table(name="projectmaster")
@AllArgsConstructor 
@NoArgsConstructor 
public class ProjectMaster {
	@Id
	@Column(name = "projectid")
	private int projectid;
	@Column(name="projectname")
	private String projectname;
	@Column(name="pricingmodel")
	private String pricingmodel;
	@Column(name="itservice")
	private String itservice;
	@Column(name="servicemodel")
	private String servicemodel;
	@DateTimeFormat(pattern="yyyy-mm-dd")
	@Column(name="startdate")
	private Date startdate;
	@Column(name="enddate")
	private Date enddate;
	@Column(name="clientid")
	private int clientid;
	@Column(name="verticalid")
	private int verticalid;
	@Column(name="executionmodel")
	private String executionmodel;
	
	@Column(name="remarks")
	private String remarks;
	@Column(name="serviceline")
	private char serviceline;
	@Column(name="projectlocation")
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
	public List<ProjectManagement> getProjectmanagement() {
		return projectmanagement;
	}
	public void setProjectmanagement(List<ProjectManagement> projectmanagement) {
		this.projectmanagement = projectmanagement;
	}
	public ClientMaster getClientmaster() {
		return clientmaster;
	}
	public void setClientmaster(ClientMaster clientmaster) {
		this.clientmaster = clientmaster;
	}


	@OneToMany(mappedBy="projectmaster")
	private List<ProjectManagement>projectmanagement=new ArrayList<>();
	
	
	@OneToOne
	private ClientMaster clientmaster;
	

}
