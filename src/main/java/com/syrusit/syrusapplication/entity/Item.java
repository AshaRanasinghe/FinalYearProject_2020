package com.syrusit.syrusapplication.entity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="maincat")
    private String maincat;
    @Column(name="subcat")
    private String subcat;
    @Column(name="number")
    private String number;
    @Column(name="name")
    private String name;
    @Column(name="barcode")
    private String barcode;
    @Column(name="SellingPrice")
    private Double SellingPrice;
    @Column(name="buyingPrice")
    private Double buyingPrice;
    @Column(name = "status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name="categoryObj")
    private Category categoryObj;

    @OneToMany(mappedBy="itemObj")
    private List<PurchaseItem> purchaseItemList;

    @ManyToOne
    @JoinColumn(name="subCategory")
    private SubCategory subCategory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaincat() {
        return maincat;
    }

    public void setMaincat(String maincat) {
        this.maincat = maincat;
    }

    public String getSubcat() {
        return subcat;
    }

    public void setSubcat(String subcat) {
        this.subcat = subcat;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Double getSellingPrice() {
        return SellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        SellingPrice = sellingPrice;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Category getCategoryObj() {
        return categoryObj;
    }

    public void setCategoryObj(Category categoryObj) {
        this.categoryObj = categoryObj;
    }

    public List<PurchaseItem> getPurchaseItemList() {
        return purchaseItemList;
    }

    public void setPurchaseItemList(List<PurchaseItem> purchaseItemList) {
        this.purchaseItemList = purchaseItemList;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Item(){}

    //item load and if you want to show the name , name will be loaded
    @Override
    public String toString() {
        return name;
    }
}