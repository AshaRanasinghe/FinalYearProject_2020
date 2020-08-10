package com.syrusit.syrusapplication.entity;


import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name="PurchaseItem")
public class PurchaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name="item_id")//item_id is the foreign key name
    private Item itemObj;

    @ManyToOne
    @JoinColumn(name="Porder_id")
    private PurchaseOrder purchaseOrder;

    public PurchaseItem(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Item getItemObj() {
        return itemObj;
    }

    public void setItemObj(Item itemObj) {
        this.itemObj = itemObj;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @Override
    public String toString() {
        return "PurchaseItem{" +
                "quantity=" + quantity +
                '}';
    }
}
