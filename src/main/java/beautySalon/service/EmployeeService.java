package beautySalon.service;

import beautySalon.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto getEmployeeById(Long id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto addEmployee(EmployeeDto employeeDto);

    EmployeeDto updateEmployee(EmployeeDto employeeDto);

    void deleteEmployeeById(Long id);
}
