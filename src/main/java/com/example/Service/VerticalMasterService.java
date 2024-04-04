package com.example.Service;

import java.util.List;

import com.example.Dto.VerticalMasterDto;

public interface VerticalMasterService  {

	VerticalMasterDto saveData(VerticalMasterDto verticalmasterDto);
	
	 List<VerticalMasterDto> getAllVerticalMasterDto();
	 
	    VerticalMasterDto getVerticalById(int verticalid);

		boolean deleteVerticalById(int verticalid);

		VerticalMasterDto updateVertical(int verticalid, VerticalMasterDto updatedVerticalDto);


}
