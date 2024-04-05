package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.EmployeeMaster;

@Repository
public interface EmployeeMasterRepo extends JpaRepository<EmployeeMaster,Integer>{

	

	

}
