package beautySalon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class BranchDto implements Serializable {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("branchName")
    private String branchName;
    @JsonProperty("address")
    private AddressDto address;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("services")
    private List<ServiceDto> services;

    public BranchDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<ServiceDto> getServices() {
        return services;
    }

    public void setServices(List<ServiceDto> services) {
        this.services = services;
    }
}
