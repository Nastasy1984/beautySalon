package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class EmployeeDto implements Serializable {
    @JsonProperty("id")
    private Long id;
    @NotBlank(message="First name cannot be empty")
    @JsonProperty("firstName")
    private String firstName;
    @NotBlank(message="Last name cannot be empty")
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("branch")
    private BranchDto branch;
    @NotBlank(message="Position cannot be empty")
    @JsonProperty("position")
    private PositionDto position;
    @JsonProperty("salary")
    //is it better to use int or Integer here???
    private Integer salary;

    public EmployeeDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BranchDto getBranch() {
        return branch;
    }

    public void setBranch(BranchDto branch) {
        this.branch = branch;
    }

    public PositionDto getPosition() {
        return position;
    }

    public void setPosition(PositionDto position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        salary = salary;
    }
}
