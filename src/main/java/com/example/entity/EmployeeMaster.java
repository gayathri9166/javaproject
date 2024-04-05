package com.example.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employeemaster")
public class EmployeeMaster {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empcode")
	private int empcode;
	@Id
	@Column(name = "emp_id")
	private int emp_id;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Column(name = "doj")
	private Date doj;
	@Column(name = "rm")
	private String rm;
	@Column(name = "designation")
	private String designation;
	@Column(name = "empstatus")
	private String empstatus;
	@Column(name = "employeename")
	private String employeename;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "first_lastname")
	private String first_lastname;
	@Column(name = "dateofbirth")
	private Date dateofbirth;
	@Column(name = "gender")
	private String gender;
	@Column(name = "personalemailid")
	private String personalemailid;
	@Column(name = "officialemailid")
	private String officialemailid;
	@Column(name = "baselocation")
	private String baselocation;
	@Column(name = "ftcons")
	private String ftcons;
	@Column(name = "hrbpremarks")
	private String hrbpremarks;
	@Column(name = "linkedin")
	private String linkedin;
	@Column(name = "profileimage")
	private String profileimage;
	@Column(name = "middlename")
	private String middlename;
	@Column(name = "pastexpyears")
	private int pastexpyears;
	@Column(name = "pastexpmonths")
	private int pastexpmonths;
	@Column(name="subpracticeid")
	private int subpracticeid;
	@Column(name = "hrbpid")
	private String hrbpid;
	@Column(name = "doe")
	private Date doe;
	@Column(name = "phonenumber")
	private String phonenumber;
	@Column(name = "potential")
	private String potential;
	@Column(name = "region")
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

	public SubpracticeMaster getSubpracticemaster() {
		return subpracticemaster;
	}

	public void setSubpracticemaster(SubpracticeMaster subpracticemaster) {
		this.subpracticemaster = subpracticemaster;
	}

	@OneToMany(mappedBy="employeemaster",cascade=CascadeType.ALL)
	private List<ProjectManagement> projectmanagement=new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="subpracticeid",updatable=false,insertable=false)
	private SubpracticeMaster subpracticemaster;

	

	public EmployeeMaster createEmployee(EmployeeMaster employeemaster) {
		// TODO Auto-generated method stub
		return null;
	}
}