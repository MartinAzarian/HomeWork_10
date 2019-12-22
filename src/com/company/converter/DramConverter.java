package com.company.converter;

import com.company.AbstractWalletUnit;
import com.company.currency.*;

public class DramConverter implements Converter {


    public AbstractWalletUnit convert(AbstractWalletUnit unit) {
        double temp;
        if (unit instanceof Dollar) {
            temp = unit.getNumber() * 477.21;
        } else if (unit instanceof Euro) {
            temp = unit.getNumber() * 529.26;
        } else if (unit instanceof PoundSterling) {
            temp = unit.getNumber() * 621.21;
        } else if (unit instanceof Ruble) {
            temp = unit.getNumber() * 7.43;
        } else {
            temp = unit.getNumber();
        }
        Dram dram = new Dram();
        dram.setNumber(temp);
        return dram;
    }
}