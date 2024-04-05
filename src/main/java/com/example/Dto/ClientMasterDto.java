package com.example.Dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
public class ClientMasterDto {
	
	private String clientname;    
	private String clientcountry; 
	@Id
	private int clientid;
	private int verticalid;
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
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
