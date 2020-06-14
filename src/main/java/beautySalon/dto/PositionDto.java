package beautySalon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PositionDto implements Serializable {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("position")
    private String position;

    public PositionDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
