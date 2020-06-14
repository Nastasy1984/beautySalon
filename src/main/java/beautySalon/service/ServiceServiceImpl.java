package beautySalon.service;

import beautySalon.dto.ServiceDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Override
    public ServiceDto getServiceById(Long id){
        //TODO change
        ServiceDto sampleServiceDto = new ServiceDto();
        sampleServiceDto.setServiceName("hgfgf");
        sampleServiceDto.setId(123l);
        return sampleServiceDto;
    }

    @Override
    public List<ServiceDto> getAllServices(){
        //TODO change
        List <ServiceDto> serviceList = new ArrayList<>();
        ServiceDto sampleServiceDto = new ServiceDto();
        sampleServiceDto.setServiceName("hgfgf");
        sampleServiceDto.setId(123l);
        serviceList.add(sampleServiceDto);
        return serviceList;
    }

    @Override
    public ServiceDto addService(ServiceDto serviceDto){
        //TODO change
        return serviceDto;
    }

    @Override
    public ServiceDto updateService(ServiceDto serviceDto){
        //TODO change
        return serviceDto;
    }

    @Override
    public void deleteServiceById(Long id){
        //TODO change
    }
}
