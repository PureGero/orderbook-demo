package com.github.puregero.orderbookdemo.orderbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class AskListTest {

    @Test
    public void testAskListOrdering() {
        AskList<BigDecimal, BigDecimal> askList = new AskList<>(3);

        askList.put(new BigDecimal("1.0"), new BigDecimal("1.0"));
        askList.put(new BigDecimal("2.0"), new BigDecimal("2.0"));
        askList.put(new BigDecimal("3.0"), new BigDecimal("3.0"));
        askList.put(new BigDecimal("4.0"), new BigDecimal("4.0"));

        Assertions.assertEquals(true, askList.containsKey(new BigDecimal("1.0")), "Key 1.0 should be in the list");
        Assertions.assertEquals(false, askList.containsKey(new BigDecimal("4.0")), "Key 4.0 should be not be in the list as it's too large for the list");
    }

}
