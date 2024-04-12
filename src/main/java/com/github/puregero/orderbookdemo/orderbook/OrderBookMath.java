package com.github.puregero.orderbookdemo.orderbook;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;

/**
 * Math operations related to order books. Eg volume calculations.
 */
public class OrderBookMath {

    private final OrderBookFormatter orderBookFormatter = new OrderBookFormatter();

    /**
     * Calculate the volume of the order book and print the volume change since the last calculation.
     * @param orderBookManager The order book manager containing the order books to calculate the volume changes of.
     */
    public void calculateAndPrintVolumeChanges(OrderBookManager orderBookManager) {
        for (Map.Entry<String, OrderBook> entry : orderBookManager.orderBooks()) {
            String symbol = entry.getKey();
            OrderBook orderBook = entry.getValue();

            calculateAndPrintVolumeChanges(symbol, orderBook);
        }
    }

    public void calculateAndPrintVolumeChanges(String symbol, OrderBook orderBook) {
        BigDecimal volumeChange = calculateVolumeChange(orderBook);

        if (volumeChange == null) {
            return; // The volume hasn't been calculated before, thus there is no change
        }

        orderBookFormatter.printOrderBook(symbol, orderBook, volumeChange);
    }

    public BigDecimal calculateVolumeChange(OrderBook orderBook) {
        BigDecimal lastVolume = orderBook.lastVolume();

        BigDecimal newVolume = calculateVolume(orderBook);

        orderBook.lastVolume(newVolume);

        if (lastVolume == null) {
            return null;
        }

        BigDecimal volumeChange = newVolume.subtract(lastVolume);

        return volumeChange;
    }

    public BigDecimal calculateVolume(OrderBook orderBook) {
        return sumPriceList(orderBook.bids()) // Sum the bid prices
                .add(sumPriceList(orderBook.asks())); // Sum the ask prices
    }

    public BigDecimal sumPriceList(PriceQuantityList<BigDecimal, BigDecimal> priceList) {
        BigDecimal sum = BigDecimal.ZERO;

        for (Map.Entry<BigDecimal, BigDecimal> entry : priceList.entrySet()) {
            BigDecimal price = entry.getKey();
            BigDecimal quantity = entry.getValue();

            sum = sum.add(price.multiply(quantity));
        }

        return sum;
    }

}
