package com.example.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@Setter
@Getter
@AllArgsConstructor 
@NoArgsConstructor 
@Table(name="practicemaster")
public class PracticeMaster {
	
	@OneToMany(mappedBy="practicemaster")
	private List<SubpracticeMaster> subpracticemaster=new ArrayList<>();

	@Id
	@Column(name="practiceid")
	private int practiceid;
	
	@Column(name="practicename")
	private String practicename;
	
	@Column(name="pdemid")
	private String pdemid;
	
	@Column(name="practicestartDate")
	private Date practiceStartDate;
	
	@Column(name="description")
	private String description;
	
	@Column(name="hrbpid")
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
		return practiceStartDate;
	}

	public void setPracticeStartDate(Date practiceStartDate) {
		this.practiceStartDate = practiceStartDate;
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
	
	


