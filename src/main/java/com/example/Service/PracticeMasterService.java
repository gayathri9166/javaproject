package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Dto.PracticeMasterDto;

@Service
public interface PracticeMasterService {

	List<PracticeMasterDto> getAllPracticeMasterDto();

	PracticeMasterDto getPracticeById(int practiceid);

	boolean deletePracticeById(int practiceid);

	PracticeMasterDto updatePractice(int practiceid, PracticeMasterDto updatedPracticeDto);

	PracticeMasterDto saveData(PracticeMasterDto practicemasterDto);

	 
	

}
