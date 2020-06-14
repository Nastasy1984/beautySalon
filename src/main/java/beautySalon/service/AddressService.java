package beautySalon.service;

import beautySalon.dto.AddressDto;

import java.util.List;

public interface AddressService {
    AddressDto getAddressById(Long id);

    List<AddressDto> getAllAddresses();

    AddressDto addAddress(AddressDto addressDto);

    AddressDto updateAddress(AddressDto addressDto);

    void deleteAddressById(Long id);
}
