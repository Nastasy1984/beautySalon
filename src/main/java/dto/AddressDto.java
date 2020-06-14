package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Validated
public class AddressDto implements Serializable {
    @JsonProperty("id")
    private Long id;
    @NotBlank(message="City cannot be empty")
    @JsonProperty("city")
    private String city;
    @NotBlank(message="Street cannot be empty")
    @JsonProperty("street")
    private String street;
    @NotBlank(message="House number cannot be empty")
    @JsonProperty("houseNumber")
    private String houseNumber;

    public AddressDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
}
