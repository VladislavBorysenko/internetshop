package com.android_school.internetshop.model;

public class Product {
    int id;
    String title;
    int price;
    int quantity;
    String city;

    public Product(int id, String title, int price, int quantity, String city) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", city='" + city + '\'' +
                '}';
    }
}
