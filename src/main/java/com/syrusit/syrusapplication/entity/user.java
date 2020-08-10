package com.syrusit.syrusapplication.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table (name = "systemuser")
public class user {

    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    @Column (name="id")
    private Integer id;
    @Column (name="username")
    private String username;
    @Column (name="password")
    private String password;

    @ManyToOne
    @JoinColumn (name="employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn (name="role_id")
    private UserRole role;

    //constructor method (default constructor)
    public user (){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "username";
    }
}
