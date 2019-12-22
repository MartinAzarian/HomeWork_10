package com.company;
import com.company.converter.*;
import com.company.currency.*;

public class Main {

    public static void main(String[] args) {
	Converter dollarConverter = new DollarConverter();

        Dollar dollar = new Dollar();

        Euro euro = new Euro();
        PoundSterling poundSterling = new PoundSterling();
        Ruble ruble = new Ruble();
    }
}
