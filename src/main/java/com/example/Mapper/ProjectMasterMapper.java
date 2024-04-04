package com.example.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.Dto.ProjectMasterDto;
import com.example.entity.ProjectMaster;

@Component
public class ProjectMasterMapper {
	
	public ProjectMaster convertVo (ProjectMasterDto Dto) {
		ProjectMaster pm=new ProjectMaster();
		pm.setProjectname(Dto.getProjectname());
		pm.setPricingmodel(Dto.getPricingmodel());
		pm.setItservice(Dto.getItservice());
		pm.setServicemodel(Dto.getServicemodel());
		pm.setStartdate(Dto.getStartdate());
		pm.setEnddate(Dto.getEnddate());
		pm.setClientid(Dto.getClientid());
		pm.setVerticalid(Dto.getVerticalid());
		pm.setExecutionmodel(Dto.getExecutionmodel());
		pm.setProjectid(Dto.getProjectid());
		pm.setRemarks(Dto.getRemarks());
		pm.setServiceline(Dto.getServiceline());
		pm.setProjectlocation(Dto.getProjectlocation());
		return pm;
	}
	
	public ProjectMasterDto convertDto (ProjectMaster savedata) {
		ProjectMasterDto Dto=new ProjectMasterDto();
		Dto.setProjectname(savedata.getProjectname());
		Dto.setPricingmodel(savedata.getPricingmodel());
		Dto.setItservice(savedata.getItservice());
		Dto.setServicemodel(savedata.getServicemodel());
		Dto.setStartdate(savedata.getStartdate());
		Dto.setEnddate(savedata.getEnddate());
		Dto.setClientid(savedata.getClientid());
		Dto.setVerticalid(savedata.getVerticalid());
		Dto.setExecutionmodel(savedata.getExecutionmodel());
		Dto.setProjectid(savedata.getProjectid());
		Dto.setRemarks(savedata.getRemarks());
		Dto.setServiceline(savedata.getServiceline());
		Dto.setProjectlocation(savedata.getProjectlocation());
		return Dto;
	}

	public List<ProjectMasterDto> convertDtoList(List<ProjectMaster> projectmasterList) {
		  return projectmasterList.stream()
	                .map(this::convertDto)
	                .collect(Collectors.toList());
	}

}
