package com.company;

public abstract class AbstractWalletUnit {
    private double number;

    public AbstractWalletUnit(double number) {
        this.number = number;
    }

    public AbstractWalletUnit() {
    }

    public abstract void printConverter();


    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
