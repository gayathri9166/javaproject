package com.example.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Dto.ProjectMasterDto;
import com.example.Service.ProjectMasterService;

@RestController
@RequestMapping("/projectmaster")
public class ProjectMasterController {
	
	private final ProjectMasterService projectMasterService;
	
	@Autowired
	public ProjectMasterController(ProjectMasterService projectMasterService) {
		this.projectMasterService=projectMasterService;
	}
	
	@PostMapping("/postprojectmaster")
	public ResponseEntity<ProjectMasterDto> createprojectmaster(@RequestBody ProjectMasterDto projectmasterDto){
		ProjectMasterDto createdprojectmaster=projectMasterService.saveprojectmaster(projectmasterDto);
		return ResponseEntity.ok(createdprojectmaster) ;
		
	}
	
	@GetMapping("/getprojectmaster")
	public ResponseEntity<List<ProjectMasterDto>> getAllProjectMasterDto(){
		List<ProjectMasterDto> ProjectMasterDtoList =projectMasterService.getAllProjectMasterDto();
		return ResponseEntity.ok(ProjectMasterDtoList);
		
	}
	
	@GetMapping("/{projectid}")
	public ResponseEntity<ProjectMasterDto> projectById(@PathVariable int projectid) {
		ProjectMasterDto projectDto = projectMasterService.getprojectById(projectid);
        if (projectDto != null) {
            return ResponseEntity.ok(projectDto);
        } else {
            return ResponseEntity.notFound().build();
        }
	}
	
	@PutMapping("/{projectid}")
	public ResponseEntity<ProjectMasterDto> updateProject(@PathVariable int projectid, @RequestBody ProjectMasterDto updateProjectDto){
		ProjectMasterDto updateProject = projectMasterService.updateProject(projectid,updateProjectDto);
		if(updateProject!=null) {
			return ResponseEntity.ok(updateProject);
		}else {
			 return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{projectid}")
	public ResponseEntity<Void> deleteProject(@PathVariable int projectid) {
	    boolean deleted = projectMasterService.deleteProjectById(projectid);
	    if (deleted) {
	        return ResponseEntity.noContent().build();
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
}

