package com.syrusit.syrusapplication.entity;

import javax.persistence.*;

@Entity
@Table(name="designation")
public class Designation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;

    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(Integer id){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }

    public Designation(Integer id, String name){
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString(){
        return name;

}
}
