package com.CollectionFramework.Laptop;

public class Laptop<L> {
    private String ModelName;
    private String Processor;
    private String Color;
    private Double price;

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public String getColor() {
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
        return "Laptop{" +
                "ModelName='" + ModelName + '\'' +
                ", Processor='" + Processor + '\'' +
                ", Color='" + Color + '\'' +
                ", price=" + price +
                '}';
    }
}
