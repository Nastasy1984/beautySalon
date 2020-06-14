package beautySalon.service;

import beautySalon.dto.BranchDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Override
    public BranchDto getBranchById(Long id){
        //TODO change
        BranchDto sampleBranchDto = new BranchDto();
        sampleBranchDto.setBranchName("branch1");
        sampleBranchDto.setId(123l);
        return sampleBranchDto;
    }

    @Override
    public List<BranchDto> getAllBranches(){
        //TODO change
        List <BranchDto> branchList = new ArrayList<>();
        BranchDto sampleBranchDto = new BranchDto();
        sampleBranchDto.setBranchName("branch");
        sampleBranchDto.setId(123l);
        branchList.add(sampleBranchDto);
        return branchList;
    }

    @Override
    public BranchDto addBranch(BranchDto branchDto){
        //TODO change
        return branchDto;
    }

    @Override
    public BranchDto updateBranch(BranchDto branchDto){
        //TODO change
        return branchDto;
    }

    @Override
    public void deleteBranchById(Long id){
        //TODO change
    }
}
