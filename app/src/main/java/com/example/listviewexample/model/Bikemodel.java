package com.example.listviewexample.model;

public class Bikemodel {

    private String Name;
    private String price;
    private int image;

    // Constructor
    public Bikemodel(String name, String price, int image) {
        Name = name;
        this.price = price;
        this.image = image;
    }

    // Getter and Setter methods for Name
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // Getter and Setter methods for Price
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    // Getter and Setter methods for Image
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}






