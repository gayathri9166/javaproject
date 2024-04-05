package com.example.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dto.SubpracticeMasterDto;
import com.example.Mapper.SubpracticeMasterMapper;
import com.example.Repository.SubpracticeMasterRepo;
import com.example.Service.SubpracticeMasterService;
import com.example.entity.SubpracticeMaster;

@Service
public class SubpracticeMasterServiceImp implements SubpracticeMasterService {
	
	private final SubpracticeMasterMapper subpracticemasterMapper;
	private final SubpracticeMasterRepo  subpracticeMasterRepo;
	
	@Autowired
	public SubpracticeMasterServiceImp(SubpracticeMasterMapper subpracticemasterMapper, SubpracticeMasterRepo subpracticeMasterRepo) {
		this.subpracticemasterMapper=subpracticemasterMapper;
		this.subpracticeMasterRepo=subpracticeMasterRepo;
	}

	@Override
	public SubpracticeMasterDto saveData(SubpracticeMasterDto subpracticemasterDto) {
		SubpracticeMaster subpracticeMasterEntity=subpracticemasterMapper.convertVo(subpracticemasterDto);
		SubpracticeMaster savedSubpracticeMaster=subpracticeMasterRepo.save(subpracticeMasterEntity);
		return subpracticemasterMapper.convertDto(savedSubpracticeMaster);
	}

	@Override
	public List<SubpracticeMasterDto> getAllSubpracticeMasterDto() {
		List<SubpracticeMaster>subpracticeList=subpracticeMasterRepo.findAll();
		return subpracticemasterMapper.convertDtoList(subpracticeList);
	}

	@Override
	public SubpracticeMasterDto getSubpracticeById(int subpracticeid) {
		SubpracticeMaster subpracticeMaster = subpracticeMasterRepo.findById(subpracticeid).orElse(null);
        if (subpracticeMaster != null) {
            return subpracticemasterMapper.convertDto(subpracticeMaster);
        } else {
            return null;
        }
	
	}

	@Override
	public SubpracticeMasterDto updateSubpractice(int subpracticeid, SubpracticeMasterDto updatedSubpracticeDto) {
		  SubpracticeMaster existingSubpractice = subpracticeMasterRepo.findById(subpracticeid).orElse(null);
		    if (existingSubpractice != null) {
		        // Update the fields of the existing subpractice entity
		        existingSubpractice.setSubpracticename(updatedSubpracticeDto.getSubpracticename());
		        // Update other fields as needed

		        SubpracticeMaster updatedSubpractice = subpracticeMasterRepo.save(existingSubpractice);
		        return subpracticemasterMapper.convertDto(updatedSubpractice);
		    } else {
		        return null; // Return null if the subpractice with the given ID is not found
		    }
		}

	@Override
	public boolean deleteSubpracticeById(int subpracticeid) {
		if (subpracticeMasterRepo.existsById(subpracticeid)) {
			subpracticeMasterRepo.deleteById(subpracticeid);
            return true; // Deletion successful
        } else {
            return false; // Practice with the given ID not found
        }
    }
		
	}
	
	
	
	

	

