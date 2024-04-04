package com.example.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.Dto.VerticalMasterDto;
import com.example.entity.VerticalMaster;

@Component
public class VerticalMasterMapper {
	
	public VerticalMaster convertVo(VerticalMasterDto Dto) {
		VerticalMaster a=new VerticalMaster();
		a.setRemarks(Dto.getRemarks());
		a.setVertical(Dto.getVertical());
		a.setVerticalid(Dto.getVerticalid());
		return a;
	}
	
	public VerticalMasterDto convertDto(VerticalMaster savedata) {
		VerticalMasterDto Dto=new VerticalMasterDto();
		Dto.setRemarks(savedata.getRemarks());
		Dto.setVertical(savedata.getVertical());
		Dto.setVerticalid(savedata.getVerticalid());
		return Dto;
		
	}
	public List<VerticalMasterDto> convertDtoList(List<VerticalMaster> verticalList) {
        return verticalList.stream()
                .map(this::convertDto)
                .collect(Collectors.toList());
    }
}

