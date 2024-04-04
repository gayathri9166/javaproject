package com.example.Dto;

import java.sql.Date;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PracticeMasterDto {
	@Id
	private int practiceid;
	private String practicename;
	private String pdemid;
	private Date practicestartdate;
	private String description;
	private String hrbpid;
	public int getPracticeid() {
		return practiceid;
	}
	public void setPracticeid(int practiceid) {
		this.practiceid = practiceid;
	}
	public String getPracticename() {
		return practicename;
	}
	public void setPracticename(String practicename) {
		this.practicename = practicename;
	}
	public String getPdemid() {
		return pdemid;
	}
	public void setPdemid(String pdemid) {
		this.pdemid = pdemid;
	}
	public Date getPracticeStartDate() {
		return practicestartdate;
	}
	public void setPracticeStartDate(Date practiceStartDate) {
		this.practicestartdate = practiceStartDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHrbpid() {
		return hrbpid;
	}
	public void setHrbpid(String hrbpid) {
		this.hrbpid = hrbpid;
	}
	
	
}
