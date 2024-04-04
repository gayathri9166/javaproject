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
import com.example.Dto.SubpracticeMasterDto;
import com.example.Service.SubpracticeMasterService;

@RestController
@RequestMapping("/subpractice")
public class SubpracticeMasterController {
	
	private final SubpracticeMasterService subpracticeMasterService;
	
	@Autowired
	public SubpracticeMasterController(SubpracticeMasterService subpracticeMasterService) {
		this.subpracticeMasterService=subpracticeMasterService;	
	}
	@PostMapping("/postsubpractice")
	 public ResponseEntity<SubpracticeMasterDto> create (@RequestBody SubpracticeMasterDto subpracticemasterDto) {
		SubpracticeMasterDto subpractice = subpracticeMasterService.saveData(subpracticemasterDto);
        return ResponseEntity.ok(subpractice);
    }
	
	@GetMapping("/getsubpractice")
	public  ResponseEntity<List<SubpracticeMasterDto>> getAllSubpracticeMasterDto(){
		List<SubpracticeMasterDto>subpracticeMasterDtoList=subpracticeMasterService.getAllSubpracticeMasterDto();
		return ResponseEntity.ok(subpracticeMasterDtoList);
	}
	
	@GetMapping("/{subpracticeid}")
	public ResponseEntity<SubpracticeMasterDto> getSubpracticeById(@PathVariable int subpracticeid){
		SubpracticeMasterDto subpracticeDto=subpracticeMasterService.getSubpracticeById(subpracticeid);
    	if (subpracticeDto!=null) {
    		return ResponseEntity.ok(subpracticeDto);
    	} else {
            return ResponseEntity.notFound().build();
    	}
	}
	
	@PutMapping("/{subpracticeid}")
	  public ResponseEntity<SubpracticeMasterDto> updateSubpractice(@PathVariable int subpracticeid,
		        @RequestBody SubpracticeMasterDto updatedSubpracticeDto) {
		SubpracticeMasterDto updatedSubpractice = subpracticeMasterService.updateSubpractice(subpracticeid, updatedSubpracticeDto);
		        if (updatedSubpractice != null) {
		            return ResponseEntity.ok(updatedSubpractice);
		        } else {
		            return ResponseEntity.notFound().build();
		    }
	}
	
	@DeleteMapping("/{id}")
	 public ResponseEntity<String> deleteSubpracticeById(@PathVariable("id") int  subpracticeid){
		subpracticeMasterService.deleteSubpracticeById(subpracticeid);
   	 return ResponseEntity.ok("SubpracticeMasterDto deleted is successfully");
    }
}
