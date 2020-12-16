package com.example.demo.Form.Sell;

public class SellForm {

    private Integer idSupplier;
    private String name;
    private double price;
    private int stock;

    public SellForm() {
    }

    public SellForm(Integer idSupplier, String name, double price, int stock) {
        this.idSupplier = idSupplier;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }
}
