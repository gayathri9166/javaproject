package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.PracticeMaster;

@Repository
public interface PracticeMasterRepo extends JpaRepository <PracticeMaster,Integer> {

}
