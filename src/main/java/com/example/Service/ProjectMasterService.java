package com.example.Service;

import java.util.List;

import com.example.Dto.ProjectMasterDto;

public interface ProjectMasterService {

	ProjectMasterDto saveprojectmaster(ProjectMasterDto projectmasterDto);

	List<ProjectMasterDto> getAllProjectMasterDto();

	ProjectMasterDto getprojectById(int projectid);

	ProjectMasterDto updateProject(int projectid, ProjectMasterDto updateProjectDto);

	boolean deleteProjectById(int projectid);

}
