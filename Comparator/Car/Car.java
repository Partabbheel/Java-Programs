package com.Comparator.Car;

public class Car{
    private String CompanyName;
    private String Color;
    private  Double price;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getColor(String color) {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CompanyName='" + CompanyName + '\'' +
                ", Color='" + Color + '\'' +
                ", price=" + price +
                '}';
    }
}
