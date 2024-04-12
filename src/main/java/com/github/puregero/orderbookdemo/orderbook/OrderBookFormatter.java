package com.github.puregero.orderbookdemo.orderbook;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;

/**
 * Format order books in a human-readable way
 */
public class OrderBookFormatter {

    private final NumberFormat formatter = new DecimalFormat("#0.00000000"); // The same format as given by Binance's api

    /**
     * Print the order book in a human-readable way
     * @param symbol The symbol of the order book
     * @param orderBook The order book to print
     * @param volumeChange The change in volume of the order book
     */
    public void printOrderBook(String symbol, OrderBook orderBook, BigDecimal volumeChange) {
        System.out.println();
        System.out.println(symbol + " Order Book:");

        System.out.println("Bids: Price x Quantity");
        orderBook.bids().entrySet().forEach(entry ->
                System.out.println(formatter.format(entry.getKey()) + " x " + formatter.format(entry.getValue())));

        System.out.println("Asks: Price x Quantity");
        orderBook.asks().entrySet().forEach(entry ->
                System.out.println(formatter.format(entry.getKey()) + " x " + formatter.format(entry.getValue())));

        System.out.println("Volume change: " + volumeChange);
    }

}
