package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Dto.EmployeeMasterDto;
import com.example.Service.EmployeeMasterService;

@RestController
@RequestMapping("/employee")
public class EmployeeMasterController {
	
	private final EmployeeMasterService employeeMasterService;
	
	@Autowired
	public EmployeeMasterController(EmployeeMasterService employeeMasterService) {
		this.employeeMasterService=employeeMasterService;
	}
	
	@PostMapping("/postemployee")
	public ResponseEntity<EmployeeMasterDto> createEmployee(@RequestBody EmployeeMasterDto employeemasterDto){
		EmployeeMasterDto createdEmployee=employeeMasterService.saveEmployee(employeemasterDto);
		return ResponseEntity.ok(createdEmployee) ;
	}
	
	@GetMapping("/getemployee")
	public ResponseEntity<List<EmployeeMasterDto>> getAllEmployeeMasterDto(){
		List<EmployeeMasterDto> employeeMasterDtoList=employeeMasterService.getAllEmployeeMasterDto();
		return ResponseEntity.ok(employeeMasterDtoList) ;	
	}
	
	@GetMapping("/{empid}")
	public ResponseEntity<EmployeeMasterDto> getEmployeeById(@PathVariable int empid) {
		EmployeeMasterDto employeeDto = employeeMasterService.getEmployeeById(empid);
		if (employeeDto != null) {
			return ResponseEntity.ok(employeeDto);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	@DeleteMapping("/{empid}")
	public ResponseEntity<Void> deleteEmployeeById(@PathVariable int empid) {
		boolean deleted = employeeMasterService.deleteEmployeeById(empid);
		if (deleted) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	@PutMapping("/{empid}")
	public ResponseEntity<EmployeeMasterDto> updateEmployee(@PathVariable int empid, @RequestBody EmployeeMasterDto employeemasterDto) {
		// Fetch the existing employee using empid
		EmployeeMasterDto existingEmployee = employeeMasterService.getEmployeeById(empid);
		
		if (existingEmployee != null) {
            existingEmployee.setEmployeename(employeemasterDto.getEmployeename());
			
			EmployeeMasterDto updatedEmployee = employeeMasterService.saveEmployee(existingEmployee);
			return ResponseEntity.ok(updatedEmployee);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
		}
	
	

