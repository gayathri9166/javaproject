package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.SubpracticeMaster;

@Repository
public interface SubpracticeMasterRepo extends JpaRepository<SubpracticeMaster,Integer>{

}
