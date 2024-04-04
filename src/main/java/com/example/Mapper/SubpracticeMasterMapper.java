package com.example.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.Dto.SubpracticeMasterDto;
import com.example.entity.SubpracticeMaster;
@Component
public class SubpracticeMasterMapper {
	
	public SubpracticeMaster convertVo(SubpracticeMasterDto Dto) {
		SubpracticeMaster a=new SubpracticeMaster();
		a.setSubpracticename(Dto.getSubpracticename());
		a.setSubpracticeid(Dto.getSubpracticeid());
		a.setPracticeid(Dto.getPracticeid());
		a.setHrbpid(Dto.getHrbpid());
		a.setRemarks(Dto.getRemarks());
		a.setLdid(Dto.getLdid());
		return a;
	}
	public SubpracticeMasterDto convertDto(SubpracticeMaster savedata) {
		SubpracticeMasterDto dto= new SubpracticeMasterDto();
		dto.setSubpracticename(savedata.getSubpracticename());
		dto.setSubpracticeid(savedata.getSubpracticeid());
		dto.setPracticeid(savedata.getPracticeid());
		dto.setHrbpid(savedata.getHrbpid());
		dto.setRemarks(savedata.getRemarks());
		dto.setLdid(savedata.getLdid());
		return dto;
	}



	public List<SubpracticeMasterDto> convertDtoList(List<SubpracticeMaster> subpracticeList) {
	
		return subpracticeList.stream()
	            .map(this::convertDto)
	            .collect(Collectors.toList());
	}


}
