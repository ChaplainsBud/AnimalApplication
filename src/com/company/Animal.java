package com.company;

public class Animal {
    private String name;
    private String type;
    private String description;
    private int price;
    private boolean isInStock;

    public Animal(){

    }

    public Animal(String name, String type, String description, int price, boolean isInStock) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public void getPet() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.description);
        System.out.println(this.price);
        System.out.println(this.isInStock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
