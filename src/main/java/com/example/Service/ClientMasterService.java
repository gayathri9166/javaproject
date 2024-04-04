package com.example.Service;

import java.util.List;

import com.example.Dto.ClientMasterDto;

public interface ClientMasterService {
    
    ClientMasterDto getClientById(int clientid);
	List<ClientMasterDto> getAllClientMasterDto();
	ClientMasterDto saveData(ClientMasterDto clientmasterDto);
	boolean deleteClientById(int clientid);
	ClientMasterDto updateClient(int clientid, ClientMasterDto updatedClientDto);
	
	
   
}
