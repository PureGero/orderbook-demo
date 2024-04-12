package com.github.puregero.orderbookdemo.orderbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BidListTest {

    @Test
    public void testAskListOrdering() {
        BidList<BigDecimal, BigDecimal> bidList = new BidList<>(3);

        bidList.put(new BigDecimal("1.0"), new BigDecimal("1.0"));
        bidList.put(new BigDecimal("2.0"), new BigDecimal("2.0"));
        bidList.put(new BigDecimal("3.0"), new BigDecimal("3.0"));
        bidList.put(new BigDecimal("4.0"), new BigDecimal("4.0"));

        Assertions.assertEquals(true, bidList.containsKey(new BigDecimal("4.0")), "Key 4.0 should be in the list");
        Assertions.assertEquals(false, bidList.containsKey(new BigDecimal("1.0")), "Key 1.0 should be not be in the list as it's too small for the list");
    }

}
