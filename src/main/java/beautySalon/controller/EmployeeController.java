package beautySalon.controller;

import beautySalon.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import beautySalon.service.EmployeeService;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/employee")
@RestController
public class EmployeeController {
    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/{id:\\d+}")
    public EmployeeDto getEmployeeById (@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<EmployeeDto> getAllEmployees (){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeDto addEmployee (@Valid @RequestBody EmployeeDto employeeDto){
        return employeeService.addEmployee(employeeDto);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDto updateAddress (@Valid @RequestBody EmployeeDto employeeDto){
        return employeeService.updateEmployee(employeeDto);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployeebyId (@PathParam("id") Long id){
        employeeService.deleteEmployeeById(id);
    }
}
