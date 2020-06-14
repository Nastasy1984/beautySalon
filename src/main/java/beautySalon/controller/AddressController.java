package beautySalon.controller;

import beautySalon.dto.AddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import beautySalon.service.AddressService;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/address")
@RestController
public class AddressController {
    AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }

    @GetMapping (value = "/{id:\\d+}")
    public AddressDto getAddressById (@PathVariable("id") Long id){
        return addressService.getAddressById(id);
    }

    @GetMapping
    public List<AddressDto> getAllAddresses (){
        return addressService.getAllAddresses();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddressDto addAddress (@Valid @RequestBody AddressDto addressDto){
        return addressService.addAddress(addressDto);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public AddressDto updateAddress (@Valid @RequestBody AddressDto addressDto){
        return addressService.updateAddress(addressDto);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteAddressById (@PathParam("id") Long id){
        addressService.deleteAddressById(id);
    }
}