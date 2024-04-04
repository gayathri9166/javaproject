package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.VerticalMaster;

@Repository
public interface VerticalMasterRepo extends JpaRepository<VerticalMaster,Integer> {

	static List<VerticalMaster> getData() {
		// TODO Auto-generated method stub
		return null;
	}

}
