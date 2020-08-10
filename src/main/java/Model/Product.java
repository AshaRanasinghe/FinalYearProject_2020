package Model;

import com.syrusit.syrusapplication.entity.Item;

public class Product {

    private Item item;
    private Integer quantity;
    private Double linetotal;

    public Product(){

    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getLinetotal() {
        return item.getSellingPrice()* quantity;
    }

    public void setLinetotal(Double linetotal) {
        this.linetotal = item.getSellingPrice()* quantity;
    }
}
