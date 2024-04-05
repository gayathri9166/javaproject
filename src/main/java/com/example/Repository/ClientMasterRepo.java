package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Dto.ClientMasterDto;
import com.example.entity.ClientMaster;

@Repository
public interface ClientMasterRepo extends JpaRepository<ClientMaster,Integer> {

	ClientMasterDto save(ClientMasterDto clientMasterDto);

	static ClientMasterDto saveClientMasterDto(ClientMasterDto clientMasterDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
