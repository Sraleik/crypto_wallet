package com.example.sraleik.cyptowallet;

public class CoinItem {
    private String name;
    private String imgUrl;
    private String currentValue;
    private String userQuantity;
    private String todayChange;

    public CoinItem(String name, String imgUrl, String currentValue, String userQuantity, String todayChange) {
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

    public String getTodayChange() {
        return todayChange;
    }

    public void setTodayChange(String todayChange) {
        this.todayChange = todayChange;
    }
}
