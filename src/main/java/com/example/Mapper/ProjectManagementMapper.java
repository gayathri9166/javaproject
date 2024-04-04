package com.example.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.Dto.ProjectManagementDto;
import com.example.entity.ProjectManagement;

@Component
public class ProjectManagementMapper {
	
	public ProjectManagement convertVo(ProjectManagementDto Dto) {
		ProjectManagement a=new ProjectManagement();
		a.setProjectid(Dto.getProjectid());
		a.setEmp_id(Dto.getEmp_id());
		a.setStartdate(Dto.getStartdate());
		a.setEnddate(Dto.getEnddate());
		return a;
		
	}
	
	public ProjectManagementDto convertDto(ProjectManagement savedata) {
		ProjectManagementDto dto=new ProjectManagementDto();
		dto.setEmp_id(savedata.getEmp_id());
		dto.setProjectid(savedata.getProjectid());
		dto.setStartdate(savedata.getStartdate());
		dto.setEnddate(savedata.getEnddate());
		return dto ;
		
	}

	public List<ProjectManagementDto> convertDtoList(List<ProjectManagement> pmList) {
		return pmList.stream()
	            .map(this::convertDto)
	            .collect(Collectors.toList());
	}
	
	

}
