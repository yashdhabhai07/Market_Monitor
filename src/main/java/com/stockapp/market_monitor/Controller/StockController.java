package com.stockapp.market_monitor.Controller;

import com.stockapp.market_monitor.Models.Stocks;
import com.stockapp.market_monitor.Services.stockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {

    private stockService stockService;
    public StockController(stockService stockService) {
        this.stockService = stockService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Stocks> getStockById(@PathVariable("id") Long stock_id) {
        return null;
    }
    @GetMapping
    public List<Stocks> getStocks(Stocks stocks) {
        return null;
    }
    @PostMapping
    public Stocks createStock(@RequestBody Stocks stocks) {
        return null;
    }
    @PatchMapping("/{id}")
    public Stocks updateStock(@PathVariable("id") Long stock_id, @RequestBody Stocks stock) {
        return null;
    }
    @PutMapping("/{id}")
    public Stocks replaceStock(@PathVariable("id") Long stock_id, @RequestBody Stocks stock) {
        return null;
    }
    @DeleteMapping("/{id}")
    public String deleteStock(@PathVariable("id") Long stock_id) {
        return "Stock deleted successfully";
    }
}
