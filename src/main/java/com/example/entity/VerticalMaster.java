package com.example.entity;

import java.util.List;

import com.example.Dto.VerticalMasterDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="verticalmaster")
@Data
@Setter
@Getter
@AllArgsConstructor 
@NoArgsConstructor 

public class VerticalMaster {
	
	
	@Column(name="vertical")
	private String vertical;
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="verticalid")
	private int verticalid;
	@Column(name="remarks")
	private String remarks;
	public String getVertical() {
		return vertical;
	}
	public void setVertical(String vertical) {
		this.vertical = vertical;
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
	public static List<VerticalMasterDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	}
	
	
	

