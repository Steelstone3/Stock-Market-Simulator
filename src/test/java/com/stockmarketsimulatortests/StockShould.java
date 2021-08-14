package com.stockmarketsimulatortests;

import com.stockmarketsimulator.contracts.IStock;
import com.stockmarketsimulator.stockmarket.Stock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StockShould {

    int _stockValue;
    IStock _stock;

    @BeforeEach
    public void setup() {
        _stockValue = 500;
        _stock = new Stock(_stockValue);
    }

    @Test
    public void haveADefaultValue() {
        Assertions.assertEquals(_stockValue, _stock.getValue());
    }

    @Test
    public void fluctuateValueUpwards() {
        int valueChange = 200;
        _stock.fluctuateValue(valueChange);

        Assertions.assertEquals(_stockValue + valueChange, _stock.getValue());
    }

    @Test
    public void fluctuateValueDownwards() {
        int valueChange = -200;
        _stock.fluctuateValue(valueChange);

        Assertions.assertEquals(_stockValue + valueChange, _stock.getValue());
    }

    @ParameterizedTest
    @Disabled //This theory throws language exceptions
    @ValueSource(ints = { -400, -200, 200, 400 })
    public void fluctuateValue(int valueChange) {
        _stock.fluctuateValue(valueChange);
        Assertions.assertEquals(_stockValue + valueChange, _stock.getValue());
    }
}
