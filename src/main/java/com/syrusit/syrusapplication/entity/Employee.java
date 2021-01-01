package com.syrusit.syrusapplication.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Employee")
public class Employee {

    @Id//use to configure the primary key of emp table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //use to configure auto increment constrain
    @Column(name="id") //use to configure the column for below variable in Employee tabel
    private Integer id;
    @Column(name="firstName")
    @NotEmpty
    @Size(min=3)
    private String firstName;
    @Column(name="lastName")
    @NotEmpty
    @Size(min=3)
    private String lastName;
    @Column(name="nic")
    private String nic;
    @Column(name="mobile")
    private String mobile;
    @Column(name="telephone")
    private String telephone;
    @Column(name="dob")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;
    @Column(name="addressLine1")
    private String addressLine1;
    @Column(name="addressline2")
    private String addressline2;
    @Column(name="city")
    private String city;
    @Column(name="image")
    private byte[] image;
    @Column(name="email")
    private String email;
    @Column(name="Designation")
    private String designation;
    @Column(name="gender")
    private String gender;
    @Column(name="epf")
    private String epf;
    @Column(name="etf")
    private String etf;
    @Column(name = "status")
    private boolean status;

    //one to many relationship - many side
    @ManyToOne
    @JoinColumn(name = "gender_id")
    private Gender genderId;

    //onetomany mapping with SystemUser , generated getters and setter also for new property "systemUserList"
    @OneToMany(mappedBy = "employee")
    private List<SystemUser> systemUserList;

    private transient String fullName;

    public Gender getGenderId() {
        return genderId;
    }

    public void setGenderId(Gender genderId) {
        this.genderId = genderId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) { this.status = status;}



    public Employee(){}
//.............................................................................................
    //getters and seters

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEpf() {
        return epf;
    }

    public void setEpf(String epf) {
        this.epf = epf;
    }

    public String getEtf() {
        return etf;
    }

    public void setEtf(String etf) {
        this.etf = etf;
    }

    public List<SystemUser> getSystemUserList() {
        return systemUserList;
    }

    public void setSystemUserList(List<SystemUser> systemUserList) {
        this.systemUserList = systemUserList;
    }

    public String getFullName() {
        return firstName+" "+lastName;
    }

    public void setFullName(String fullName) {
        this.fullName = firstName+" "+lastName;
    }

    //...............................................................................................................
    //constructor method

    public Employee(Integer id, String firstName, String lastName, String nic, String mobile, String telephone, Date dob, String addressLine1, String addressline2, String city, byte[] image, String email, String designation, String gender, String epf, String etf) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nic = nic;
        this.mobile = mobile;
        this.telephone = telephone;
        this.dob = dob;
        this.addressLine1 = addressLine1;
        this.addressline2 = addressline2;
        this.city = city;
        this.image = image;
        this.email = email;
        this.designation = designation;
        this.gender = gender;
        this.epf = epf;
        this.etf = etf;
    }

        @Override
        public String toString(){
            return firstName+""+lastName;
            }
}
