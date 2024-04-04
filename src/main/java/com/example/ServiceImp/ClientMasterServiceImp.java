package com.example.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Dto.ClientMasterDto;
import com.example.Mapper.ClientMasterMapper;
import com.example.Repository.ClientMasterRepo;
import com.example.Service.ClientMasterService;
import com.example.entity.ClientMaster;

@Service
public class ClientMasterServiceImp implements ClientMasterService {

    private final ClientMasterMapper clientMasterMapper;
    private final ClientMasterRepo clientMasterRepo;

    @Autowired
    public ClientMasterServiceImp(ClientMasterMapper clientMasterMapper, ClientMasterRepo clientMasterRepo) {
        this.clientMasterMapper = clientMasterMapper;
        this.clientMasterRepo = clientMasterRepo;
    }

    @Override
    public ClientMasterDto saveData(ClientMasterDto clientmasterDto) {
        ClientMaster clientMasterEntity = clientMasterMapper.convertVo(clientmasterDto);
        ClientMaster savedClient = clientMasterRepo.save(clientMasterEntity);
        return clientMasterMapper.convertDto(savedClient);
    }

    @Override
    public ClientMasterDto getClientById(int clientid) {
        ClientMaster clientMaster = clientMasterRepo.findById(clientid).orElse(null);
        if (clientMaster != null) {
            return clientMasterMapper.convertDto(clientMaster);
        } else {
            return null;
        }
    }

	@Override
	public List<ClientMasterDto> getAllClientMasterDto() {
        List<ClientMaster> clientList = clientMasterRepo.findAll();
        return clientMasterMapper.convertDtoList(clientList);
	}

	@Override
	public boolean deleteClientById(int clientid) {
		if (clientMasterRepo.existsById(clientid)) {
			clientMasterRepo.deleteById(clientid);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public ClientMasterDto updateClient(int clientid, ClientMasterDto updatedClientDto) {
	    ClientMaster existingClient = clientMasterRepo.findById(clientid).orElse(null);
	    
	    if (existingClient != null) {
	        // Update the fields of the existing client entity with the updated values
	        existingClient.setClientname(updatedClientDto.getClientname());
	        existingClient.setClientcountry(updatedClientDto.getClientcountry());
	        existingClient.setClientid(updatedClientDto.getClientid());
	       
	        
	        // Save the updated client entity
	        ClientMaster updatedClient = clientMasterRepo.save(existingClient);
	        return clientMasterMapper.convertDto(updatedClient);
	    } else {
	        return null; // Client with the given ID not found
	    }
	}
}

