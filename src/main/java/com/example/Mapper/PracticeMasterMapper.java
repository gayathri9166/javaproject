package com.example.Mapper;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.example.Dto.PracticeMasterDto;
import com.example.entity.PracticeMaster;

@Component
public class PracticeMasterMapper {
	
	public PracticeMaster convertVo(PracticeMasterDto Dto) {
		PracticeMaster a=new PracticeMaster();
		a.setPracticename(Dto.getPracticename());
		a.setPracticeid(Dto.getPracticeid());
		a.setPdemid(Dto.getPdemid());
		a.setPracticeStartDate(Dto.getPracticeStartDate());
		a.setDescription(Dto.getDescription());
		a.setHrbpid(Dto.getHrbpid());
		return a;
	}
		
	public PracticeMasterDto convertDto(PracticeMaster savedata) {
		PracticeMasterDto dto=new PracticeMasterDto();
		dto.setPracticename(savedata.getPracticename());
		dto.setPracticeid(savedata.getPracticeid());
		dto.setPdemid(savedata.getPdemid());
		dto.setPracticeStartDate(savedata.getPracticeStartDate());
		dto.setDescription(savedata.getDescription());
		dto.setHrbpid(savedata.getHrbpid());
		return dto;
		
	}

	public List<PracticeMasterDto> convertDto(List<PracticeMaster> practiceList) {
		
		return practiceList.stream()
	            .map(this::convertDto)
	            .collect(Collectors.toList());
	}

}
