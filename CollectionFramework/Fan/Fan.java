package com.CollectionFramework.Fan;

public class Fan {
    private String CompanyName;
    private int Price;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "CompanyName='" + CompanyName + '\'' +
                ", Price=" + Price +
                '}';
    }
}
