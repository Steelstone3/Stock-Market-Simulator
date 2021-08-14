package com.stockmarketsimulatortests;

import com.stockmarketsimulator.contracts.IStockMarket;
import com.stockmarketsimulator.contracts.IStockMarketService;
import com.stockmarketsimulator.stockmarket.StockMarket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class StockMarketShould {

    private IStockMarket _stockMarket;

    @Mock
    private IStockMarketService _stockMarketService = mock(IStockMarketService.class);

    @BeforeEach
    public void setup() {
        _stockMarket = new StockMarket();
    }

    @Test
    public void haveStocks() {
        Assertions.assertNotNull(_stockMarket.Stocks);
        Assertions.assertNotEquals(0, _stockMarket.Stocks.length);
    }

    @Test
    public void simulateTheStockMarket() {
        _stockMarket.simulateStockMarket(_stockMarketService);

        verify(_stockMarketService).runStockMarket();
    }
}
