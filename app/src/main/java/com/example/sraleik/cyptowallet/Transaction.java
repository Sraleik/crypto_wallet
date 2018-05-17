package com.example.sraleik.cyptowallet;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {

    private String type;
    private Date date;
    private String coinCurrency;
    private double quantity;
    private double fiatValue;
    private String fiatCurrency;

    public Transaction(String type, Date date, String coinCurrency, double quantity, double fiatValue, String fiatCurrency) {
        this.type = type;
        this.date = date;
        this.coinCurrency = coinCurrency;
        this.quantity = quantity;
        this.fiatValue = fiatValue;
        this.fiatCurrency = fiatCurrency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCoinCurrency() {
        return coinCurrency;
    }

    public void setCoinCurrency(String coinCurrency) {
        this.coinCurrency = coinCurrency;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getFiatValue() {
        return fiatValue;
    }

    public void setFiatValue(double fiatValue) {
        this.fiatValue = fiatValue;
    }

    public String getFiatCurrency() {
        return fiatCurrency;
    }

    public void setFiatCurrency(String fiatCurrency) {
        this.fiatCurrency = fiatCurrency;
    }
}
