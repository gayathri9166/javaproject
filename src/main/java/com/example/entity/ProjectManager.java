package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="projectmanager")
@Data
@AllArgsConstructor 
@NoArgsConstructor 
public class ProjectManager {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int pm_id;
  private String pm_name;
  private int project_id;
  private String rm;
public int getPm_id() {
	return pm_id;
}
public void setPm_id(int pm_id) {
	this.pm_id = pm_id;
}
public String getPm_name() {
	return pm_name;
}
public void setPm_name(String pm_name) {
	this.pm_name = pm_name;
}
public int getProject_id() {
	return project_id;
}
public void setProject_id(int project_id) {
	this.project_id = project_id;
}
public String getRm() {
	return rm;
}
public void setRm(String rm) {
	this.rm = rm;
}
  

}
