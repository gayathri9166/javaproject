package com.example.Service;

import java.util.List;

import com.example.Dto.EmployeeMasterDto;
import com.example.entity.EmployeeMaster;

public interface EmployeeMasterService {

	EmployeeMaster createEmployeeMaster(EmployeeMaster employeemaster);

	EmployeeMasterDto saveEmployee(EmployeeMasterDto employeemasterDto);

	List<EmployeeMasterDto> getAllEmployeeMasterDto();

	EmployeeMasterDto getEmployeeById(int empid);

	boolean deleteEmployeeById(int empid);
	
}
 