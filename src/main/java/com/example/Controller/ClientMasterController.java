package com.example.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Dto.ClientMasterDto;
import com.example.Service.ClientMasterService;

@RestController
@RequestMapping("/client")
public class ClientMasterController {

    private final ClientMasterService clientMasterService;

    @Autowired
    public ClientMasterController(ClientMasterService clientMasterService) {
        this.clientMasterService = clientMasterService;
    }

    @PostMapping("/postclients")
    public ResponseEntity<ClientMasterDto> saveData(@RequestBody ClientMasterDto clientmasterDto) {
        ClientMasterDto client = clientMasterService.saveData(clientmasterDto);
        return ResponseEntity.ok(client);
    }
    
    @GetMapping("/getclient")
    public ResponseEntity<List<ClientMasterDto>> getAllClientMasterDto(){
    	List<ClientMasterDto> clientMasterDtoList=clientMasterService.getAllClientMasterDto();
		return ResponseEntity.ok(clientMasterDtoList) ;
    	
    }

    @GetMapping("/{clientid}")
    public ResponseEntity<ClientMasterDto> getClientById(@PathVariable int clientid) {
        ClientMasterDto clientDto = clientMasterService.getClientById(clientid);
        if (clientDto != null) {
            return ResponseEntity.ok(clientDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteClientById(@PathVariable("id") int clientid){
    	clientMasterService.deleteClientById(clientid);
    	return ResponseEntity.ok("ClientMasterDto id deleted successfully");
    }
    
    @PutMapping("/{clientid}")
    public ResponseEntity<ClientMasterDto> updateClient(@PathVariable int clientid, @RequestBody ClientMasterDto updatedClientDto) {
        ClientMasterDto updatedClient = clientMasterService.updateClient(clientid, updatedClientDto);

        if (updatedClient != null) {
            return ResponseEntity.ok(updatedClient);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
