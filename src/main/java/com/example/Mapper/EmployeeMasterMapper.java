package com.example.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.Dto.EmployeeMasterDto;
import com.example.entity.EmployeeMaster;

@Component
public class EmployeeMasterMapper {
	
	public EmployeeMaster convertVo(EmployeeMasterDto Dto) {
		EmployeeMaster a=new EmployeeMaster();
		a.setEmpcode(Dto.getEmpcode());
		a.setEmp_id(Dto.getEmp_id());
		a.setDoj(Dto.getDoj());
		a.setRm(Dto.getRm());
		a.setDesignation(Dto.getDesignation());
		a.setEmpstatus(Dto.getEmpstatus());
		a.setEmployeename(Dto.getEmployeename());
		a.setFirstname(Dto.getFirstname());
		a.setLastname(Dto.getLastname());
		a.setFirst_lastname(Dto.getFirst_lastname());
		a.setDateofbirth(Dto.getDateofbirth());
		a.setGender(Dto.getGender());
		a.setPersonalemailid(Dto.getPersonalemailid());
		a.setOfficialemailid(Dto.getOfficialemailid());
		a.setBaselocation(Dto.getBaselocation());
		a.setFtcons(Dto.getFtcons());
		a.setHrbpremarks(Dto.getHrbpremarks());
		a.setLinkedin(Dto.getLinkedin());
		a.setProfileimage(Dto.getProfileimage());
		a.setMiddlename(Dto.getMiddlename());
		a.setPastexpyears(Dto.getPastexpyears());
		a.setPastexpmonths(Dto.getPastexpmonths());
		a.setSubpracticeid(Dto.getSubpracticeid());
		a.setHrbpid(Dto.getHrbpid());
		a.setDoe(Dto.getDoe());
		a.setPhonenumber(Dto.getPhonenumber());
		a.setPotential(Dto.getPotential());
		a.setRegion(Dto.getRegion());
		return a;
	}
	
	public EmployeeMasterDto convertDto(EmployeeMaster saveData) {
		EmployeeMasterDto dto=new EmployeeMasterDto();
		dto.setEmpcode(saveData.getEmpcode());
		dto.setEmp_id(saveData.getEmp_id());
		dto.setDoj(saveData.getDoj());
		dto.setRm(saveData.getRm());
		dto.setDesignation(saveData.getDesignation());
		dto.setEmpstatus(saveData.getEmpstatus());
		dto.setEmployeename(saveData.getEmployeename());
		dto.setFirstname(saveData.getFirstname());
		dto.setLastname(saveData.getLastname());
		dto.setFirst_lastname(saveData.getFirst_lastname());
		dto.setDateofbirth(saveData.getDateofbirth());
		dto.setGender(saveData.getGender());
		dto.setPersonalemailid(saveData.getPersonalemailid());
		dto.setOfficialemailid(saveData.getOfficialemailid());
		dto.setBaselocation(saveData.getBaselocation());
		dto.setFtcons(saveData.getFtcons());
		dto.setHrbpremarks(saveData.getHrbpremarks());
		dto.setLinkedin(saveData.getLinkedin());
		dto.setProfileimage(saveData.getProfileimage());
		dto.setMiddlename(saveData.getMiddlename());
		dto.setPastexpyears(saveData.getPastexpyears());
		dto.setPastexpmonths(saveData.getPastexpmonths());
		dto.setSubpracticeid(saveData.getSubpracticeid());
		dto.setHrbpid(saveData.getHrbpid());
		dto.setDoe(saveData.getDoe());
		dto.setPhonenumber(saveData.getPhonenumber());
		dto.setPotential(saveData.getPotential());
		dto.setRegion(saveData.getRegion());
		return dto;
		
	}

	public List<EmployeeMasterDto> convertDtoList(List<EmployeeMaster> employeeList) {
		return employeeList.stream()
	            .map(this::convertDto)
	            .collect(Collectors.toList());
		
	}

}
