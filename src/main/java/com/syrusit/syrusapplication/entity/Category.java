package com.syrusit.syrusapplication.entity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "categoryObj")
    private List<Item> itemList;



    @OneToMany(mappedBy ="itemsubcat")
    private List<SubCategory> itemsubcatList;


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

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }


    public List<SubCategory> getItemsubcatList() {
        return itemsubcatList;
    }

    public void setItemsubcatList(List<SubCategory> itemsubcatList) {
        this.itemsubcatList = itemsubcatList;
    }



    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Category(){}

}
