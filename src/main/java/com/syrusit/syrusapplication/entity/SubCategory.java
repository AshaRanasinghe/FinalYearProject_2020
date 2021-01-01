package com.syrusit.syrusapplication.entity;

import javax.persistence.*;

@Entity
@Table(name="subcategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="Subcategory_name")
   private Category itemsubcat;


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
        return "SubCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public SubCategory(String name) {
        this.name = name;
    }

    public Category getSubCatobj() {
        return itemsubcat;
    }

    public void setSubCatobj(Category subCatobj) {
        itemsubcat = subCatobj;
    }

    public SubCategory(){}
}
