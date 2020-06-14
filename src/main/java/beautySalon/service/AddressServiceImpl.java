package beautySalon.service;

import beautySalon.dto.AddressDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Override
    public AddressDto getAddressById(Long id){
        //TODO change
        AddressDto sampleAddressDto = new AddressDto();
        sampleAddressDto.setCity("city1");
        sampleAddressDto.setId(123l);
        sampleAddressDto.setStreet("street1");
        sampleAddressDto.setHouseNumber("111");
        return sampleAddressDto;
    }

    @Override
    public List<AddressDto> getAllAddresses(){
        //TODO change
        List <AddressDto> addressList = new ArrayList<>();
        AddressDto sampleAddressDto = new AddressDto();
        sampleAddressDto.setCity("city");
        sampleAddressDto.setId(123l);
        sampleAddressDto.setStreet("street");
        sampleAddressDto.setHouseNumber("222");
        addressList.add(sampleAddressDto);
        return addressList;
    }

    @Override
    public AddressDto addAddress(AddressDto addressDto){
        //TODO change
        return addressDto;
    }

    @Override
    public AddressDto updateAddress(AddressDto addressDto){
        //TODO change
        return addressDto;
    }

    @Override
    public void deleteAddressById(Long id){
        //TODO change
    }
}
