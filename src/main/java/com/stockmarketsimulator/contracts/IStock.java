package com.stockmarketsimulator.contracts;

public interface IStock {
    int getValue();
    void fluctuateValue(int valueChange);
}
