package com.example.Service;

import java.util.List;

import com.example.Dto.ProjectManagementDto;

public interface ProjectManagementService {

	ProjectManagementDto saveData(ProjectManagementDto projectmanagementDto);

	List<ProjectManagementDto> getAllProjectManagementDto();

	ProjectManagementDto getpmById(int projectid);

	boolean deletepmById(int projectid);

	ProjectManagementDto updatepm(int projectid, ProjectManagementDto updatepmDto);

	

	

	

}
