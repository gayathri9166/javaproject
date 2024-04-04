package com.example.ServiceImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Dto.ProjectMasterDto;
import com.example.Mapper.ProjectMasterMapper;
import com.example.Repository.ProjectMasterRepo;
import com.example.Service.ProjectMasterService;
import com.example.entity.ProjectMaster;


@Service
public class ProjectMasterServiceImp implements ProjectMasterService{
	
	private final ProjectMasterMapper projectmasterMapper;
	private final ProjectMasterRepo projectmasterRepo;
	
	@Autowired
	public ProjectMasterServiceImp(ProjectMasterMapper projectmasterMapper, ProjectMasterRepo projectmasterRepo) {
		this.projectmasterMapper=projectmasterMapper;
		this.projectmasterRepo=projectmasterRepo;
	}
	
	
	@Override
	public ProjectMasterDto saveprojectmaster(ProjectMasterDto projectmasterDto) {
		ProjectMaster ProjectMasterEntity=projectmasterMapper.convertVo(projectmasterDto);
		ProjectMaster savedProjectMaster=projectmasterRepo.save(ProjectMasterEntity);
		return projectmasterMapper.convertDto(savedProjectMaster);
	}


	@Override
	public List<ProjectMasterDto> getAllProjectMasterDto() {
	    List<ProjectMaster> projectmasterList=projectmasterRepo.findAll();
	    return projectmasterMapper.convertDtoList(projectmasterList) ;
	}


	@Override
	public ProjectMasterDto getprojectById(int projectid) {
		ProjectMaster  projectMaster = projectmasterRepo.findById(projectid).orElse(null);
	        if (projectMaster != null) {
	            return projectmasterMapper.convertDto(projectMaster);
	        } else {
	            return null;
	        }
	}


	public ProjectMasterDto updateProject(int projectid, ProjectMasterDto updateProjectDto) {
        ProjectMaster existingProject = projectmasterRepo.findById(projectid).orElse(null);
        if (existingProject != null) {
            existingProject.setClientid(updateProjectDto.getClientid()); // Update the client ID or other fields as needed
            ProjectMaster updatedProject = projectmasterRepo.save(existingProject);
            return projectmasterMapper.convertDto(updatedProject);
        }
        return null;
    }


	public boolean deleteProjectById(int projectid) {
	    if (projectmasterRepo.existsById(projectid)) {
	        projectmasterRepo.deleteById(projectid);
	        return true;
	    }
	    return false;
	}

	

}
