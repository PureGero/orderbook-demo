package com.github.puregero.orderbookdemo.orderbook;

import java.util.Comparator;

/**
 * A PriceQuantityList where the keys are sorted in ascending order.
 */
public class AskList<K extends Comparable<K>, V> extends PriceQuantityList<K, V> {
    public AskList(int maxSize) {
        super(maxSize, Comparator.naturalOrder());
    }
}
