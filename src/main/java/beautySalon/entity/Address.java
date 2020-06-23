package beautySalon.entity;

import javax.persistence.*;

@Entity
public class Address extends EntityBase{
    @Column(name = "city")
    private String city;
    @Column(name = "street")
    private String street;
    @Column(name = "houseNumber")
    private String houseNumber;
    @OneToOne(mappedBy = "address")
    private Branch branch;

    public Address() {
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
