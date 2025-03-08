package com.CollectionFramework.Bags;

public class Bag {
    private String Type;
    private String color;
    private int price;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "Type='" + Type + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
