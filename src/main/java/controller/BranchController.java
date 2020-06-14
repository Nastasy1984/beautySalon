package controller;

import dto.AddressDto;
import dto.BranchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.AddressService;
import service.BranchService;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/branch")
@RestController
public class BranchController {
    BranchService branchService;

    @Autowired
    public BranchController(BranchService branchService){
        this.branchService = branchService;
    }

    @GetMapping(value = "/{id:\\d+}")
    public BranchDto getBranchById (@PathVariable("id") Long id){
        return branchService.getBranchById(id);
    }

    @GetMapping
    public List<BranchDto> getAllBranches (){
        return branchService.getAllBranches();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BranchDto addBranch (@Valid @RequestBody BranchDto branchDto){
        return branchService.addBranch(branchDto);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public BranchDto updateAddress (@Valid @RequestBody BranchDto branchDto){
        return branchService.updateBranch(branchDto);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteBranchbyId (@PathParam("id") Long id){
        branchService.deleteBranchById(id);
    }
}
