package com.stockapp.market_monitor.Services;

import com.stockapp.market_monitor.Models.Stocks;
import org.springframework.stereotype.Service;

import java.util.List;
public interface stockService {
    Stocks getStockbyId(Long stock_id);
    List<Stocks> getAllStocks();
    Stocks createStock(Stocks stock);
    Stocks updateStock(Long id,Stocks stock);
    Stocks replaceStock(Long id, Stocks stock);
    Stocks deleteStock(Long id);
}
