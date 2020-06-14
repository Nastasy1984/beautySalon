package service;

import dto.BranchDto;
import dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public EmployeeDto getEmployeeById(Long id){
        //TODO change
        EmployeeDto sampleEmployeeDto = new EmployeeDto();
        sampleEmployeeDto.setFirstName("vasya");
        sampleEmployeeDto.setLastName("vasin");
        sampleEmployeeDto.setId(123l);
        return sampleEmployeeDto;
    }

    @Override
    public List<EmployeeDto> getAllEmployees(){
        //TODO change
        List <EmployeeDto> employeesList = new ArrayList<>();
        EmployeeDto sampleEmployeeDto = new EmployeeDto();
        sampleEmployeeDto.setFirstName("vasya");
        sampleEmployeeDto.setLastName("vasin");
        sampleEmployeeDto.setId(123l);
        employeesList.add(sampleEmployeeDto);
        return employeesList;
    }

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto){
        //TODO change
        return employeeDto;
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto){
        //TODO change
        return employeeDto;
    }

    @Override
    public void deleteEmployeeById(Long id){
        //TODO change
    }
}
