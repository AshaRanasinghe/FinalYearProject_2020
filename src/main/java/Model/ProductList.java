package Model;

import java.util.List;

public class ProductList {

    private String purchaseOrderNo;
    private List<Product> productList;

    public ProductList(){}

    public String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    //search the name which is in product list
    public Product findByName(String name){

        for(Product p:productList){
            if(p.getItem().getName().equals(name))
                return p;
        }
        return null;
    }

    public void addProduct(Product p,Integer quantity) {

        Product tempProduct = findByName(p.getItem().getName());

        if (tempProduct == null) {
            p.setQuantity(quantity);
            productList.add(p);
        } else {
            Integer newQuantity = tempProduct.getQuantity() + quantity;
            tempProduct.setQuantity(newQuantity);

        }
    }

        public void removeProduct(String name){
            for (Product p : productList){
                if (p.getItem().getName().equals("name"))
                { productList.remove(p);
                    break;
                }
            }
        }

    }

