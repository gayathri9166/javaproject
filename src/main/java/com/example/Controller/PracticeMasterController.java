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
import com.example.Dto.PracticeMasterDto;
import com.example.Service.PracticeMasterService;

@RestController
@RequestMapping("/practice")
public class PracticeMasterController {

    private final PracticeMasterService practiceMasterService;

    @Autowired
    public PracticeMasterController(PracticeMasterService practiceMasterService) {
        this.practiceMasterService = practiceMasterService;
    }

    @PostMapping("/postpractice")
    public ResponseEntity<PracticeMasterDto> saveData(@RequestBody PracticeMasterDto practicemasterDto) {
        PracticeMasterDto practice = practiceMasterService.saveData(practicemasterDto);
        return ResponseEntity.ok(practice);
    }
    
    @GetMapping("/getpractice")
    public ResponseEntity<List<PracticeMasterDto>>getAllPracticeMasterDto(){
    	List<PracticeMasterDto>practiceMasterDtoList=practiceMasterService.getAllPracticeMasterDto();
		return ResponseEntity.ok(practiceMasterDtoList);  
   }
    @GetMapping("/{practiceid}")
    public ResponseEntity<PracticeMasterDto> getPracticeById(@PathVariable int practiceid) {
    	PracticeMasterDto practiceDto=practiceMasterService.getPracticeById(practiceid);
    	if (practiceDto!=null) {
    		return ResponseEntity.ok(practiceDto);
    	} else {
            return ResponseEntity.notFound().build();
    	}
    }
    
     @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePracticeById(@PathVariable("id") int  practiceid){
    	 practiceMasterService.deletePracticeById(practiceid);
    	 return ResponseEntity.ok("PracticeMasterDto deleted is successfully");
     }


     @PutMapping("/{practiceid}")
     public ResponseEntity<PracticeMasterDto> updatePractice(@PathVariable int practiceid,
        @RequestBody PracticeMasterDto updatedPracticeDto) {
     PracticeMasterDto updatedPractice = practiceMasterService.updatePractice(practiceid, updatedPracticeDto);
        if (updatedPractice != null) {
            return ResponseEntity.ok(updatedPractice);
        } else {
            return ResponseEntity.notFound().build();
    }
}
}