package com.example.Mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.Dto.ClientMasterDto;
import com.example.entity.ClientMaster;

@Component
public class ClientMasterMapper {
	
	public ClientMaster convertVo(ClientMasterDto Dto) {
		ClientMaster a=new ClientMaster();
		a.setClientname(Dto.getClientname());
		a.setClientcountry(Dto.getClientcountry());
		a.setClientid(Dto.getClientid());
		a.setVerticalid(Dto.getVerticalid());
		a.setRemarks(Dto.getRemarks());
		
		return a ;
	}	
   public ClientMasterDto convertDto(ClientMaster savedata) {
	   ClientMasterDto Dto=new ClientMasterDto();
	   Dto.setClientname(savedata.getClientname());
	   Dto.setClientcountry(savedata.getClientcountry());
	   Dto.setClientid(savedata.getClientid());
	   Dto.setVerticalid(savedata.getVerticalid());
	   Dto.setRemarks(savedata.getRemarks());
	return Dto;	
	}
public List<ClientMasterDto> convertDtoList(List<ClientMaster> clientList) {
	return clientList.stream()
            .map(this::convertDto)
            .collect(Collectors.toList());
	
}
}
