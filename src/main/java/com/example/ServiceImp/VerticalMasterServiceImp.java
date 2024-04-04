package com.example.ServiceImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Dto.VerticalMasterDto;
import com.example.Mapper.VerticalMasterMapper;
import com.example.Repository.VerticalMasterRepo;
import com.example.Service.VerticalMasterService;
import com.example.entity.VerticalMaster;

@Service
public class VerticalMasterServiceImp implements VerticalMasterService {

    private final VerticalMasterMapper verticalmasterMapper;
    private final VerticalMasterRepo verticalMasterRepo;

    @Autowired
    public VerticalMasterServiceImp(VerticalMasterMapper verticalmasterMapper, VerticalMasterRepo verticalMasterRepo) {
        this.verticalmasterMapper = verticalmasterMapper;
        this.verticalMasterRepo = verticalMasterRepo;
    }

    @Override
    public VerticalMasterDto saveData(VerticalMasterDto verticalmasterDto) {
        VerticalMaster verticalMasterEntity = verticalmasterMapper.convertVo(verticalmasterDto);
        VerticalMaster savedVerticalMaster = verticalMasterRepo.save(verticalMasterEntity);
        return verticalmasterMapper.convertDto(savedVerticalMaster);
    }

    @Override
    public List<VerticalMasterDto> getAllVerticalMasterDto() {
        List<VerticalMaster> verticalList = verticalMasterRepo.findAll();
        return verticalmasterMapper.convertDtoList(verticalList);
    }

    @Override
    public VerticalMasterDto getVerticalById(int verticalid) {
        VerticalMaster verticalMaster = verticalMasterRepo.findById(verticalid).orElse(null);
        if (verticalMaster != null) {
            return verticalmasterMapper.convertDto(verticalMaster);
        } else {
            return null;
        }
    
    }

	@Override
	public boolean deleteVerticalById(int verticalid) {
		if (verticalMasterRepo.existsById(verticalid)) {
			verticalMasterRepo.deleteById(verticalid);
			return true;
		}else {
			return false;
		}
	}
	@Override
	public VerticalMasterDto updateVertical(int verticalid, VerticalMasterDto updatedVerticalDto) {
	    VerticalMaster existingVertical = verticalMasterRepo.findById(verticalid).orElse(null);

	    if (existingVertical != null) {
	        VerticalMaster updatedVertical = verticalmasterMapper.convertVo(updatedVerticalDto);
	        updatedVertical.setVerticalid(verticalid); // Set the ID of the existing vertical
	        VerticalMaster savedUpdatedVertical = verticalMasterRepo.save(updatedVertical);
	        return verticalmasterMapper.convertDto(savedUpdatedVertical);
	    } else {
	        return null; // Vertical with the given ID not found
	    }

	}
}




