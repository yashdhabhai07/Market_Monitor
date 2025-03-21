package com.stockapp.market_monitor.Services;

import com.stockapp.market_monitor.Models.Stocks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DatabaseStockService")
public class DatabaseStockService implements stockService {

    @Override
    public Stocks getStockbyId(Long stock_id) {
        return null;
    }

    @Override
    public List<Stocks> getAllStocks() {
        return List.of();
    }

    @Override
    public Stocks createStock(Stocks stock) {
        return null;
    }

    @Override
    public Stocks updateStock(Long id, Stocks stock) {
        return null;
    }

    @Override
    public Stocks replaceStock(Long id, Stocks stock) {
        return null;
    }

    @Override
    public Stocks deleteStock(Long id) {
        return null;
    }
}
