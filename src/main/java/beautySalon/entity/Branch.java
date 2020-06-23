package beautySalon.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Branch extends EntityBase{
    @Column(name = "branchName")
    private String branchName;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToMany(mappedBy="branch")
    private List<Employee> employees;

    public Branch() {
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployee(List<Employee> employees) {
        this.employees = employees;
    }
}
