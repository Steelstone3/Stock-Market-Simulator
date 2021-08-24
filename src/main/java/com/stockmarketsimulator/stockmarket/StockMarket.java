package com.stockmarketsimulator.stockmarket;

import com.stockmarketsimulator.contracts.IStockMarket;
import com.stockmarketsimulator.contracts.IStockMarketController;
import com.stockmarketsimulator.contracts.IStockMarketService;

public class StockMarket implements IStockMarket {
    @Override
    public void simulateStockMarket(IStockMarketService stockMarketService,
                                    IStockMarketController stockMarketController) {
            stockMarketService.runStockMarket(stockMarketController);
    }
}
