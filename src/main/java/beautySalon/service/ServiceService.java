package beautySalon.service;

import beautySalon.dto.ServiceDto;

import java.util.List;

public interface ServiceService {
    ServiceDto getServiceById(Long id);

    List<ServiceDto> getAllServices();

    ServiceDto addService(ServiceDto serviceDto);

    ServiceDto updateService(ServiceDto serviceDto);

    void deleteServiceById(Long id);
}
