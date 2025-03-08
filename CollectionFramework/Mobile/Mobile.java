package com.CollectionFramework.Mobile;

public class Mobile {
    private String CompanyName;
    private String  Camera;
    private String  Storage;
    private Double  price;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "CompanyName='" + CompanyName + '\'' +
                ", Camera='" + Camera + '\'' +
                ", Storage='" + Storage + '\'' +
                ", price=" + price +
                '}';
    }
}
