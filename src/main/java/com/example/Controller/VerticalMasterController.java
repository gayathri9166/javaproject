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
import com.example.Dto.VerticalMasterDto;
import com.example.Service.VerticalMasterService;

@RestController
@RequestMapping("/vertical")
public class VerticalMasterController {
	@Autowired
	private VerticalMasterService verticalMasterService;
	@PostMapping("/savevertical")
	public ResponseEntity<VerticalMasterDto>saveData(@RequestBody VerticalMasterDto verticalmasterDto){
		VerticalMasterDto vertical=verticalMasterService.saveData(verticalmasterDto);
		return ResponseEntity.ok(vertical) ;
	}

	@GetMapping("/getvertical")
    public ResponseEntity<List<VerticalMasterDto>> getAllVerticalMasterDto() {
        List<VerticalMasterDto> verticalMasterDtoList = verticalMasterService.getAllVerticalMasterDto();
        return ResponseEntity.ok(verticalMasterDtoList);
    }
	
	@GetMapping("/{verticalid}")
	 public ResponseEntity<VerticalMasterDto> getVerticalById(@PathVariable int verticalid) {
		VerticalMasterDto verticalDto = verticalMasterService.getVerticalById(verticalid);
        if (verticalDto != null) {
            return ResponseEntity.ok(verticalDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteVerticalById(@PathVariable("id") int verticalid){
		verticalMasterService.deleteVerticalById(verticalid);
		return ResponseEntity.ok("VerticalMasterDto is deleted successfully");
		}
	
	@PutMapping("/{verticalid}")
	public ResponseEntity<VerticalMasterDto> updateVertical(@PathVariable int verticalid,
            @RequestBody VerticalMasterDto updatedVerticalDto) {
        VerticalMasterDto updatedVertical = verticalMasterService.updateVertical(verticalid, updatedVerticalDto);
        if (updatedVertical != null) {
            return ResponseEntity.ok(updatedVertical);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
	
	}
	
	













	
	    


	     
	    
	


