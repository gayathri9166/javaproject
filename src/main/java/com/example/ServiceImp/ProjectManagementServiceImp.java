package com.example.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dto.ProjectManagementDto;
import com.example.Mapper.ProjectManagementMapper;
import com.example.Repository.ProjectmanagementRepo;
import com.example.Service.ProjectManagementService;
import com.example.entity.ProjectManagement;

@Service
public class ProjectManagementServiceImp implements ProjectManagementService {
	
	private ProjectManagementMapper projectmanagementMapper;
	private ProjectmanagementRepo projectmanagementRepo;
    
	@Autowired 
	public ProjectManagementServiceImp (ProjectManagementMapper projectmanagementMapper, ProjectmanagementRepo projectmanagementRepo) {
		this.projectmanagementMapper=projectmanagementMapper;
		this.projectmanagementRepo=projectmanagementRepo;
	}
	@Override
	public ProjectManagementDto saveData(ProjectManagementDto projectmanagementDto) {
		ProjectManagement projectManagementEntity=projectmanagementMapper.convertVo(projectmanagementDto);
		ProjectManagement savedProjectManagement=projectmanagementRepo.save(projectManagementEntity);
		return projectmanagementMapper.convertDto(savedProjectManagement);
	}
	@Override
	public List<ProjectManagementDto> getAllProjectManagementDto() {
		List<ProjectManagement> pmList=projectmanagementRepo.findAll();
		return projectmanagementMapper.convertDtoList(pmList);
	}
	@Override
	public ProjectManagementDto getpmById(int projectid) {
		ProjectManagement projectManagement=projectmanagementRepo.findById(projectid).orElse(null);
		if(projectManagement!=null) {
			return projectmanagementMapper.convertDto(projectManagement);
		}else {
		return null;
	}
}
	@Override
	public boolean deletepmById(int projectid) {
		if(projectmanagementRepo.existsById(projectid)) {
			projectmanagementRepo.deleteById(projectid);
			return true;
		}else {
			return false;
		}
	}
	@Override
	public ProjectManagementDto updatepm(int projectid, ProjectManagementDto updatepmDto) {
		ProjectManagement existingpm=projectmanagementRepo.findById(projectid).orElse(null);
		if(existingpm!=null) {
			existingpm.setEmp_id(updatepmDto.getEmp_id());
	        existingpm.setStartdate(updatepmDto.getStartdate());
	        existingpm.setEnddate(updatepmDto.getEnddate());

	        ProjectManagement updatedpm = projectmanagementRepo.save(existingpm);
	        return projectmanagementMapper.convertDto(updatedpm);
	    } else {
	        return null; // Return null if the project with the given ID is not found
	    }

}

}
