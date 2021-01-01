package com.syrusit.syrusapplication.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "userrole")
public class UserRole {

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

    //onetomany relationship from userrole to SystemUser
    @OneToMany
    private List<SystemUser> systemUserList;

   // public List<SystemUser> getUserList() {
        //return systemUserList;
   // }

    public void setSystemUserList(List<SystemUser> systemUserList) {
        this.systemUserList = systemUserList;
    }

    public UserRole(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
