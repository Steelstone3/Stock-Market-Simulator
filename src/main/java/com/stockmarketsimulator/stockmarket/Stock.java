package com.stockmarketsimulator.stockmarket;

import com.stockmarketsimulator.contracts.IStock;

public class Stock implements IStock {
    private int _stockValue;

    public Stock(int stockValue) {
        _stockValue = stockValue;
    }

    @Override
    public int getValue() {
        return _stockValue;
    }

    @Override
    public void fluctuateValue(int valueChange) {
        _stockValue = _stockValue + valueChange;
    }
}
