package com.stockmarketsimulatortests;

import com.stockmarketsimulator.contracts.IStockMarket;
import com.stockmarketsimulator.contracts.IStockMarketController;
import com.stockmarketsimulator.contracts.IStockMarketService;
import com.stockmarketsimulator.stockmarket.StockMarket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class StockMarketShould {

    private IStockMarket _stockMarket;

    @Mock
    private IStockMarketService _stockMarketService = mock(IStockMarketService.class);

    @Mock
    private IStockMarketController _stockMarketController = mock(IStockMarketController.class);

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
        _stockMarket.simulateStockMarket(_stockMarketService, _stockMarketController);

        verify(_stockMarketService, times(1)).runStockMarket(_stockMarketController);
    }
}
