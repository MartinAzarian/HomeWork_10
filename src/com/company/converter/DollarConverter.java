package com.company.converter;

import com.company.AbstractWalletUnit;
import com.company.currency.*;

public class DollarConverter implements Converter {
    public AbstractWalletUnit convert(AbstractWalletUnit unit) {
        double temp;
        if (unit instanceof Dram) {
            temp = unit.getNumber() * 0.0021;
        } else if (unit instanceof Euro) {
            temp = unit.getNumber() * 1.11;
        } else if (unit instanceof PoundSterling) {
            temp = unit.getNumber() * 1.3;
        } else if (unit instanceof Ruble) {
            temp = unit.getNumber() * 0.016;
        } else {
            temp = unit.getNumber();
        }
        Dollar dollar = new Dollar();
        dollar.setNumber(temp);
        return dollar;
    }
}