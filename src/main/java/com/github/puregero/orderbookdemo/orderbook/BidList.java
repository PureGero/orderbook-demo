package com.github.puregero.orderbookdemo.orderbook;

import java.util.Comparator;

/**
 * A PriceQuantityList where the keys are sorted in descending order.
 */
public class BidList<K extends Comparable<K>, V> extends PriceQuantityList<K, V> {
    public BidList(int maxSize) {
        super(maxSize, Comparator.reverseOrder());
    }
}
