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

import com.example.Dto.ProjectManagementDto;
import com.example.Service.ProjectManagementService;

@RestController
@RequestMapping("/projectmanagement")
public class ProjectManagementController {
	@Autowired
	private ProjectManagementService projectManagementService;
    @PostMapping("/postpm")
    public ResponseEntity<ProjectManagementDto>saveData(@RequestBody ProjectManagementDto projectmanagementDto ){
    	ProjectManagementDto pm=projectManagementService.saveData(projectmanagementDto);
    	return ResponseEntity.ok(pm); 			
    }
	
    @GetMapping("/getpm")
    public ResponseEntity<List<ProjectManagementDto>> getAllProjectManagementDto(){
    	List<ProjectManagementDto> pmDtoList=projectManagementService. getAllProjectManagementDto();
    	return ResponseEntity.ok(pmDtoList);
    }
    
    @GetMapping("/{projectid}")
    public ResponseEntity<ProjectManagementDto> getpmById(@PathVariable int projectid){
    	ProjectManagementDto pmDto=projectManagementService.getpmById(projectid);
    	if(pmDto!=null) {
    		return ResponseEntity.ok(pmDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    	}
    
    @DeleteMapping("/{projectid}")
    public ResponseEntity<String>deletepmById(@PathVariable("projectid") int projectid ){
    	projectManagementService.deletepmById(projectid);
    	return ResponseEntity.ok("ProjectManagementDto is deleted successfully");
    }
    
    @PutMapping("/{projectid}")
    public ResponseEntity<ProjectManagementDto> updatepm(@PathVariable int projectid, @RequestBody ProjectManagementDto updatepmDto){
    	ProjectManagementDto updatepm=projectManagementService.updatepm(projectid,updatepmDto );
    	 if (updatepm != null) {
             return ResponseEntity.ok(updatepm);
         } else {
             return ResponseEntity.notFound().build();
         }
    }}
    

