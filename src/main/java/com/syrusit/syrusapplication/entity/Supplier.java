package com.syrusit.syrusapplication.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="Supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="firstName")
    @NotEmpty
    @Size(min=3)
    private String firstName;
    @Column(name="Lastname")
    @NotEmpty
    @Size(min=3)
    private String Lastname;
    @Column(name="address")
    private String address;
    @Column(name="email")
    @NotEmpty
    private String email;
    @Column(name="mobile")
    @NotEmpty
    @Size(max=10)
    private String mobile;
    @Column(name = "status")
    private boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Supplier(@NotEmpty @Size(min = 3) String firstName, @NotEmpty @Size(min = 3) String lastname, String address, @NotEmpty String email, @NotEmpty @Size(max = 10) String mobile, boolean status) {
        this.firstName = firstName;
        Lastname = lastname;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
    }

    public Supplier() {
    }

    @Override
    public String toString() {
        return firstName+""+Lastname;
    }

}


