package com.syrusit.syrusapplication.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="gender")//database table name
public class Gender {

    @Id //this annotation is to mention that the below is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//DB eke tiyena last record value ekata wada ekak wadi krla ganne. AUTO dammoth application eke value witharai balanne
    @Column(name="id")//name ekata dena nama DB eke column name eke deela tiyena values denna one
    private Integer id;
    @Column(name="name")//name ekata dena nama DB eke column name eke deela tiyena values denna one
    private String name;
    //one to many relationship - one side
    @OneToMany(mappedBy = "genderId")
    private List<Employee>employeeList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }



    public Gender(){}
    public Gender (Integer id, String name){

        this.id = id;
        this.name = name;

    }

    @Override
    public String toString(){
        return name;

    }
}


