package com.syrusit.syrusapplication.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

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

    //onetomany relationship from userrole to user
    @OneToMany
    private List<user> userList;

   // public List<user> getUserList() {
        //return userList;
   // }

    public void setUserList(List<user> userList) {
        this.userList = userList;
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
