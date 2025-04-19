package com.Comparable.Fan;

public class Fan implements Comparable<Fan>{
    private String FanName;
    private int Price;

    public String getFanName() {
        return FanName;
    }

    public void setFanName(String fanName) {
        FanName = fanName;
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
                "FanName='" + FanName + '\'' +
                ", Price=" + Price +
                '}';
    }
    @Override
    public int compareTo(Fan o){
        if(this.getPrice()>o.getPrice()){
            return 1;
        }
        else if(this.getPrice()< o.getPrice()){
            return -1;
        }else{
            return 0;
        }
    }

}
