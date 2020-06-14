package beautySalon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class ServiceDto implements Serializable{

    @JsonProperty("id")
    private Long id;
    @NotBlank(message="Service name cannot be empty")
    @JsonProperty("serviceName")
    private String serviceName;
    @JsonProperty("price")
    private Integer price;

    public ServiceDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
