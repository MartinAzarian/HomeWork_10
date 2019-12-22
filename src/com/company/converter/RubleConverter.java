package com.company.converter;

import com.company.AbstractWalletUnit;
import com.company.currency.*;

public class RubleConverter implements Converter {

    public AbstractWalletUnit convert(AbstractWalletUnit unit) {
        double temp;
        if (unit instanceof Dollar) {
            temp = unit.getNumber() * 64.18;
        } else if (unit instanceof Dram) {
            temp = unit.getNumber() * 0.13;
        } else if (unit instanceof PoundSterling) {
            temp = unit.getNumber() * 83.33;
        } else if (unit instanceof Euro) {
            temp = unit.getNumber() * 71.09;
        } else {
            temp = unit.getNumber();
        }
        Ruble ruble = new Ruble();
        ruble.setNumber(temp);
        return ruble;
    }
}