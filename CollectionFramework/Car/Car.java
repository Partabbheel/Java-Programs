package com.CollectionFramework.Car;

public class Car {
    private String CompanyName;
    private String ModelName;
    private String color;
    private Double price;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                "color='" + color + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                ", ModelName='" + ModelName + '\'' +
                ", price=" + price +
                '}';
    }
}
