package beautySalon.service;

import beautySalon.dto.BranchDto;

import java.util.List;

public interface BranchService {
    BranchDto getBranchById(Long id);

    List<BranchDto> getAllBranches();

    BranchDto addBranch(BranchDto branchDto);

    BranchDto updateBranch(BranchDto branchDto);

    void deleteBranchById(Long id);
}
