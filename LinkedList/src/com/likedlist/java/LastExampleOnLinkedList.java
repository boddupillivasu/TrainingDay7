package com.likedlist.java;

public class LastExampleOnLinkedList {
    private  int productId =10;
    private  String productname="mouse";
    private  double price=100;

    public LastExampleOnLinkedList (){
        super();
    }

    public LastExampleOnLinkedList(int productId, String productname, double price) {
        this.productId = productId;
        this.productname = productname;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override

    // to retrive the String representation in object
    public String toString() {
        return "LastExampleOnLinkedList{" +
                "productId=" + productId +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                '}';
    }
}
