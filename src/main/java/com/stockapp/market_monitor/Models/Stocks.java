package com.stockapp.market_monitor.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stocks {
    private Long stock_id;
    private String stock_name;
    private String stock_symbol;
    private Double stock_price;
    private Long stock_quantity;
    private Exchange exchange;
}
