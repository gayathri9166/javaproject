package com.example.Dto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
public class SubpracticeMasterDto {

	private String subpracticename;
	private int subpracticeid;
	private int practiceid;
	private String hrbpid;
	private String remarks;
	private String ldid;
	
	public String getSubpracticename() {
		return subpracticename;
	}
	public void setSubpracticename(String subpracticename) {
		this.subpracticename = subpracticename;
	}
	public int getSubpracticeid() {
		return subpracticeid;
	}
	public void setSubpracticeid(int subpracticeid) {
		this.subpracticeid = subpracticeid;
	}
	public int getPracticeid() {
		return practiceid;
	}
	public void setPracticeid(int practiceid) {
		this.practiceid = practiceid;
	}
	public String getHrbpid() {
		return hrbpid;
	}
	public void setHrbpid(String hrbpid) {
		this.hrbpid = hrbpid;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getLdid() {
		return ldid;
	}
	public void setLdid(String ldid) {
		this.ldid = ldid;
	}
}

