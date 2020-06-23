package beautySalon.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Position extends EntityBase{
    @Column(name = "positionName")
    private String positionName;
    @ManyToMany
    @JoinTable(
            name = "position_service",
            joinColumns = @JoinColumn(name = "position_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id"))
    private List<Service> services;
    @OneToMany(mappedBy="position")
    private List<Employee> employees;

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
