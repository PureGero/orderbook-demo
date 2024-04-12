package com.github.puregero.orderbookdemo.orderbook;

import java.math.BigDecimal;

/**
 * An order book containing a list of bids and asks.
 */
public class OrderBook {

    private final BidList<BigDecimal, BigDecimal> bids;
    private final AskList<BigDecimal, BigDecimal> asks;
    private long lastUpdateId;
    private BigDecimal lastVolume;

    public OrderBook(int depth) {
        this.bids = new BidList<>(depth);
        this.asks = new AskList<>(depth);
    }

    public void putBids(BigDecimal[][] bids) {
        putAll(bids, this.bids);
    }

    public void putAsks(BigDecimal[][] asks) {
        putAll(asks, this.asks);
    }

    private void putAll(BigDecimal[][] pairList, PriceQuantityList<BigDecimal, BigDecimal> orderBook) {
        for (BigDecimal[] pair : pairList) {
            // Strip trailing zeros from the big decimals as big decimals do not equal each other if they have different scales
            BigDecimal price = pair[0].stripTrailingZeros();
            BigDecimal quantity = pair[1].stripTrailingZeros();

            // If the quantity is zero, remove the price from the order book
            if (quantity.equals(BigDecimal.ZERO)) {
                orderBook.remove(price);
                continue;
            }

            boolean didPutIn = orderBook.put(price, quantity);

            if (!didPutIn) {
                // We have reached the end of the list's depth, no point trying to put any more keys in
                return;
            }
        }
    }

    public long lastUpdateId() {
        return lastUpdateId;
    }

    public void lastUpdateId(long lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    public BigDecimal lastVolume() {
        return lastVolume;
    }

    public void lastVolume(BigDecimal lastVolume) {
        this.lastVolume = lastVolume;
    }

    public BidList<BigDecimal, BigDecimal> bids() {
        return bids;
    }

    public AskList<BigDecimal, BigDecimal> asks() {
        return asks;
    }
}
