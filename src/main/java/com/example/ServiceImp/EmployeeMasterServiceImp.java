package com.example.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Dto.EmployeeMasterDto;
import com.example.Mapper.EmployeeMasterMapper;
import com.example.Repository.EmployeeMasterRepo;
import com.example.Service.EmployeeMasterService;
import com.example.entity.EmployeeMaster;

@Service
public class EmployeeMasterServiceImp implements EmployeeMasterService{
		
	
	private final EmployeeMasterRepo employeemasterRepo;
	private final EmployeeMasterMapper employeeMasterMapper;
	
	@Autowired
	public EmployeeMasterServiceImp(EmployeeMasterMapper employeeMasterMapper, EmployeeMasterRepo employeemasterRepo) {
		this.employeeMasterMapper=employeeMasterMapper;
		this.employeemasterRepo=employeemasterRepo;
	}

	@Override
	public EmployeeMaster createEmployeeMaster(EmployeeMaster employeemaster) {
		 return employeemasterRepo.save(employeemaster);
	}


	@Override
	public EmployeeMasterDto saveEmployee(EmployeeMasterDto employeemasterDto) {
		 EmployeeMaster employeeMasterEntity = employeeMasterMapper.convertVo(employeemasterDto);
	        EmployeeMaster savedEmployee = employeemasterRepo.save(employeeMasterEntity);
	        return employeeMasterMapper.convertDto(savedEmployee);
    }

	@Override
	public List<EmployeeMasterDto> getAllEmployeeMasterDto() {
	    List<EmployeeMaster> employeeList=employeemasterRepo.findAll();
		return employeeMasterMapper.convertDtoList(employeeList);
	}

	@Override
	public EmployeeMasterDto getEmployeeById(int empid) {
		EmployeeMaster employee = employeemasterRepo.findById(empid).orElse(null);
		if (employee != null) {
			return employeeMasterMapper.convertDto(employee);
		}
		return null; // Employee not found
	}

	@Override
	public boolean deleteEmployeeById(int empid) {
		if (employeemasterRepo.existsById(empid)) {
			employeemasterRepo.deleteById(empid);
			return true; // Employee deleted successfully
		}
		return false; // Employee not found
	}


}
 
	

		

