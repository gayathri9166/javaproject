package com.example.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dto.PracticeMasterDto;
import com.example.Mapper.PracticeMasterMapper;
import com.example.Repository.PracticeMasterRepo;
import com.example.Service.PracticeMasterService;
import com.example.entity.PracticeMaster;
@Service
public class PracticeMasterServiceImp implements PracticeMasterService {
	
	private final PracticeMasterMapper practicemasterMapper;
	private final PracticeMasterRepo practiceMasterRepo;
	
	@Autowired
	public PracticeMasterServiceImp (PracticeMasterMapper practicemasterMapper, PracticeMasterRepo practiceMasterRepo) {
		this.practicemasterMapper=practicemasterMapper;
		this.practiceMasterRepo=practiceMasterRepo;
	}

	@Override
	public PracticeMasterDto saveData(PracticeMasterDto practicemasterDto) {
		PracticeMaster practiceMasterEntity=practicemasterMapper.convertVo(practicemasterDto);
		PracticeMaster savedPractice=practiceMasterRepo.save(practiceMasterEntity);
		return practicemasterMapper.convertDto(savedPractice) ;
	}

	@Override
	public List<PracticeMasterDto> getAllPracticeMasterDto() {
		List<PracticeMaster> practiceList=practiceMasterRepo.findAll();
		return practicemasterMapper.convertDto(practiceList) ;
	}

	@Override
	public PracticeMasterDto getPracticeById(int practiceid) {
		
		PracticeMaster practiceMaster = practiceMasterRepo.findById(practiceid).orElse(null);
        if (practiceMaster != null) {
            return practicemasterMapper.convertDto(practiceMaster);
        } else {
            return null;
        }
	}

	 @Override
	    public boolean deletePracticeById(int practiceid) {
	        if (practiceMasterRepo.existsById(practiceid)) {
	            practiceMasterRepo.deleteById(practiceid);
	            return true; // Deletion successful
	        } else {
	            return false; // Practice with the given ID not found
	        }
	    }

	@Override
	 public PracticeMasterDto updatePractice(int practiceid, PracticeMasterDto updatedPracticeDto) {
	 PracticeMaster existingPractice = practiceMasterRepo.findById(practiceid).orElse(null);
    if (existingPractice != null) {
        // Update the existing practice with the data from the updatedPracticeDto
        existingPractice.setPracticename(updatedPracticeDto.getPracticename());
        existingPractice.setPdemid(updatedPracticeDto.getPdemid());
        existingPractice.setPracticeStartDate(updatedPracticeDto.getPracticeStartDate());
        existingPractice.setDescription(updatedPracticeDto.getDescription());
        existingPractice.setHrbpid(updatedPracticeDto.getHrbpid());

        // Save the updated practice in the repository
        PracticeMaster updatedPractice = practiceMasterRepo.save(existingPractice);

        // Convert and return the updated practice as a DTO
        return practicemasterMapper.convertDto(updatedPractice);
    } else {
        return null; // Practice with the given ID not found, no update performed
    }
	}

	

	
}



