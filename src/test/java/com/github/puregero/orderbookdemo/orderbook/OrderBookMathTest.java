package com.github.puregero.orderbookdemo.orderbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class OrderBookMathTest {

    @Test
    public void calculateVolumeTest() {
        OrderBook orderBook = new OrderBook(2);

        orderBook.putBids(new BigDecimal[][] {
                { new BigDecimal(2), new BigDecimal(2) },
                { new BigDecimal(1), new BigDecimal(1) }
        });

        orderBook.putAsks(new BigDecimal[][] {
                { new BigDecimal(3), new BigDecimal(1) },
                { new BigDecimal(4), new BigDecimal(1) }
        });

        OrderBookMath orderBookMath = new OrderBookMath();

        BigDecimal volume = orderBookMath.calculateVolume(orderBook);

        BigDecimal expectedVolume = new BigDecimal(2).multiply(new BigDecimal(2))
                .add(new BigDecimal(1).multiply(new BigDecimal(1)))
                .add(new BigDecimal(3).multiply(new BigDecimal(1)))
                .add(new BigDecimal(4).multiply(new BigDecimal(1)));

        Assertions.assertEquals(expectedVolume, volume, "The volume calculation is incorrect");
    }

}
