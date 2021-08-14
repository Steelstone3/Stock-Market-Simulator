package com.stockmarketsimulator.contracts;

import com.stockmarketsimulator.stockmarket.Stock;

public interface IStockMarket {
    IStock[] Stocks = new IStock[]{new Stock(500),
            new Stock(200),
            new Stock(150),
            new Stock(700),
            new Stock(100)};

    void simulateStockMarket(IStockMarketService stockMarketService);
}
