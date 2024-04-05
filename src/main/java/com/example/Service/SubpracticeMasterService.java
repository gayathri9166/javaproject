package com.example.Service;

import java.util.List;

import com.example.Dto.SubpracticeMasterDto;

public interface SubpracticeMasterService {

	SubpracticeMasterDto saveData(SubpracticeMasterDto subpracticemasterDto);

	List<SubpracticeMasterDto> getAllSubpracticeMasterDto();

	SubpracticeMasterDto getSubpracticeById(int subpracticeid);

	SubpracticeMasterDto updateSubpractice(int subpracticeid, SubpracticeMasterDto updatedSubpracticeDto);

	boolean deleteSubpracticeById(int subpracticeid);

}
