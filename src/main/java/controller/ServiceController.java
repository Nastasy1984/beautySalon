package controller;

import dto.ServiceDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.ServiceService;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/service")
@RestController
public class ServiceController {
    ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping(value = "/{id:\\d+}")
    public ServiceDto getServiceById (@PathVariable("id") Long id){
        return serviceService.getServiceById(id);
    }

    @GetMapping
    public List<ServiceDto> getAllServices (){
        return serviceService.getAllServices();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ServiceDto addService (@Valid @RequestBody ServiceDto serviceDto){
        return serviceService.addService(serviceDto);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ServiceDto updateService (@Valid @RequestBody ServiceDto serviceDto){
        return serviceService.updateService(serviceDto);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteServicebyId (@PathParam("id") Long id){
        serviceService.deleteServiceById(id);
    }
}