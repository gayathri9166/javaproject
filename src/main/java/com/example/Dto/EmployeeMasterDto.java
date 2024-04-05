package com.example.Dto;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Id;
import lombok.Data;
@Data

public class EmployeeMasterDto {

	private int empcode;
	@Id
	private int emp_id;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date doj;
	private String rm;
	private String designation;
	private String empstatus;
	private String employeename;
	private String firstname;
	private String lastname;
	private String first_lastname;
	private Date dateofbirth;
	private String gender;
	private String personalemailid;
	private String officialemailid;
	private String baselocation;
	private String ftcons;
	private String hrbpremarks;
	private String linkedin;
	private String profileimage;
	private String middlename;
	private int pastexpyears;
	private int pastexpmonths;
	private int subpracticeid;
	private String hrbpid;
	private Date doe;
	private String phonenumber;
	private String potential;
	private String region;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmpstatus() {
		return empstatus;
	}
	public void setEmpstatus(String empstatus) {
		this.empstatus = empstatus;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirst_lastname() {
		return first_lastname;
	}
	public void setFirst_lastname(String first_lastname) {
		this.first_lastname = first_lastname;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPersonalemailid() {
		return personalemailid;
	}
	public void setPersonalemailid(String personalemailid) {
		this.personalemailid = personalemailid;
	}
	public String getOfficialemailid() {
		return officialemailid;
	}
	public void setOfficialemailid(String officialemailid) {
		this.officialemailid = officialemailid;
	}
	public String getBaselocation() {
		return baselocation;
	}
	public void setBaselocation(String baselocation) {
		this.baselocation = baselocation;
	}
	public String getFtcons() {
		return ftcons;
	}
	public void setFtcons(String ftcons) {
		this.ftcons = ftcons;
	}
	public String getHrbpremarks() {
		return hrbpremarks;
	}
	public void setHrbpremarks(String hrbpremarks) {
		this.hrbpremarks = hrbpremarks;
	}
	public String getLinkedin() {
		return linkedin;
	}
	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}
	public String getProfileimage() {
		return profileimage;
	}
	public void setProfileimage(String profileimage) {
		this.profileimage = profileimage;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public int getPastexpyears() {
		return pastexpyears;
	}
	public void setPastexpyears(int pastexpyears) {
		this.pastexpyears = pastexpyears;
	}
	public int getPastexpmonths() {
		return pastexpmonths;
	}
	public void setPastexpmonths(int pastexpmonths) {
		this.pastexpmonths = pastexpmonths;
	}
	public int getSubpracticeid() {
		return subpracticeid;
	}
	public void setSubpracticeid(int subpracticeid) {
		this.subpracticeid = subpracticeid;
	}
	public String getHrbpid() {
		return hrbpid;
	}
	public void setHrbpid(String hrbpid) {
		this.hrbpid = hrbpid;
	}
	public Date getDoe() {
		return doe;
	}
	public void setDoe(Date doe) {
		this.doe = doe;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPotential() {
		return potential;
	}
	public void setPotential(String potential) {
		this.potential = potential;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
		
}
