package com.company.converter;

import com.company.AbstractWalletUnit;

public interface Converter {
    AbstractWalletUnit convert(AbstractWalletUnit unit);
}