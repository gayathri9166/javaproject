package com.example.entity;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="subpracticemaster")
public class SubpracticeMaster {
	@Column(name="subpracticename")
	private String subpracticename;
	@Id
	@Column(name="subpracticeid")
	private int subpracticeid;
	@Column(name="practiceid")
	private int practiceid;
	@Column(name="hrbpid")
	private String hrbpid;
	@Column(name="remarks")
	private String remarks;
	@Column(name="ldid")
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

	

	@ManyToOne
	@JoinColumn(name="practiceid",insertable=false, updatable=false)
	private PracticeMaster practicemaster;
	
	@OneToMany(mappedBy="subpracticemaster")
	private Set<EmployeeMaster> employeemaster;
	
	
	}
