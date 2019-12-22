package com.company.converter;

import com.company.AbstractWalletUnit;
import com.company.currency.*;

public class EuroConverter implements Converter {


    public AbstractWalletUnit convert(AbstractWalletUnit unit) {
        double temp;
        if (unit instanceof Dollar) {
            temp = unit.getNumber() * 0.90;
        } else if (unit instanceof Dram) {
            temp = unit.getNumber() * 0.0019;
        } else if (unit instanceof PoundSterling) {
            temp = unit.getNumber() * 1.17;
        } else if (unit instanceof Ruble) {
            temp = unit.getNumber() * 0.014;
        } else {
            temp = unit.getNumber();
        }
        Euro euro = new Euro();
        euro.setNumber(temp);
        return euro;

    }
}