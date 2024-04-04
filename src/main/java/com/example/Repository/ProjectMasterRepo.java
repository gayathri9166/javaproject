package com.example.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.ProjectMaster;

@Repository
public interface ProjectMasterRepo extends JpaRepository<ProjectMaster,Integer>{

	
}
