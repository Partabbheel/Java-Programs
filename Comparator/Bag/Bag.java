package com.Comparator.Bag;

public class Bag {
    private String BagName;
    private String Color;
    private int Price;

    public String getBagName() {
        return BagName;
    }

    public void setBagName(String bagName) {
        BagName = bagName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "BagName='" + BagName + '\'' +
                ", Color='" + Color + '\'' +
                ", Price=" + Price +
                '}';
    }
}
