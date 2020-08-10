package com.syrusit.syrusapplication.entity;



import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="PurchaseOrder")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    @Column(name="PONumber")
    private String PONumber;
    @Column(name="PODate")
    private Date PODate;
    @Column(name="totalPrice")
    private Double totalPrice;

    @OneToMany(mappedBy="purchaseOrder")
    private List<PurchaseItem> purchaseItemList;

    public PurchaseOrder(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPONumber() {
        return PONumber;
    }

    public void setPONumber(String PONumber) {
        this.PONumber = PONumber;
    }

    public Date getPODate() {
        return PODate;
    }

    public void setPODate(Date PODate) {
        this.PODate = PODate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<PurchaseItem> getPurchaseItemList() {
        return purchaseItemList;
    }

    public void setPurchaseItemList(List<PurchaseItem> purchaseItemList) {
        this.purchaseItemList = purchaseItemList;
    }

    @Override
    public String toString() {
        return PONumber;
    }
}
