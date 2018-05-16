package com.example.sraleik.cyptowallet;

import java.io.Serializable;

public class CoinItem implements Serializable {
    private String name;
    private String imgUrl;
    private String currentValue;
    private String userQuantity;
    private Double todayChange;

    public CoinItem(String name, String imgUrl, String currentValue, String userQuantity, Double todayChange) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.currentValue = currentValue;
        this.userQuantity = userQuantity;
        this.todayChange = todayChange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public String getUserQuantity() {
        return userQuantity;
    }

    public void setUserQuantity(String userQuantity) {
        this.userQuantity = userQuantity;
    }

    public Double getTodayChange() {
        return todayChange;
    }

    public void setTodayChange(Double todayChange) {
        this.todayChange = todayChange;
    }
}
