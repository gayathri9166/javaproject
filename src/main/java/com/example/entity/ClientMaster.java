package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="clientmaster")

@AllArgsConstructor 
@NoArgsConstructor 
public class ClientMaster {
    
    @Column(name="clientname")
	private String clientname;    
    @Column(name="clientcountry")
	private String clientcountry;    
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="clientid")	
	private int clientid;
	@Column(name="verticalid")
	private int verticalid;
	@Column(name="remarks")
	private String remarks;	
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getClientcountry() {
		return clientcountry;
	}
	public void setClientcountry(String clientcountry) {
		this.clientcountry = clientcountry;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public ProjectMaster getProjectmaster() {
		return projectmaster;
	}
	public void setProjectmaster(ProjectMaster projectmaster) {
		this.projectmaster = projectmaster;
	}

	@OneToOne(mappedBy="clientmaster",cascade = CascadeType.ALL)
	@JoinColumn(name="clientid")
	private ProjectMaster projectmaster;
	public void setVerticalMaster(VerticalMaster verticalMaster) {
		
		
	}
	
}
