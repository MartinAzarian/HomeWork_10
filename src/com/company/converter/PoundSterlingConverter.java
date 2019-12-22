package com.company.converter;


import com.company.AbstractWalletUnit;
import com.company.currency.*;

public class PoundSterlingConverter implements Converter {

    public AbstractWalletUnit convert(AbstractWalletUnit unit) {
        double temp;
        if (unit instanceof Dollar) {
            temp = unit.getNumber() * 0.77;
        } else if (unit instanceof Dram) {
            temp = unit.getNumber() * 0.0016;
        } else if (unit instanceof Euro) {
            temp = unit.getNumber() * 0.85;
        } else if (unit instanceof Ruble) {
            temp = unit.getNumber() * 0.012;
        } else {
            temp = unit.getNumber();
        }
        PoundSterling poundSterling = new PoundSterling();
        poundSterling.setNumber(temp);
        return poundSterling;
    }
}