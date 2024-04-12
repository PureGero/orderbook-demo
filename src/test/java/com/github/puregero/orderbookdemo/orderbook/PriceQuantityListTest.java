package com.github.puregero.orderbookdemo.orderbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class PriceQuantityListTest {

    private final Comparator<Integer> comparator = Integer::compareTo;
    private final int maxSize = 5;
    private final PriceQuantityList<Integer, String> priceQuantityList = new PriceQuantityList<>(maxSize, comparator);;

    @BeforeEach
    public void beforeEach() {
        // Fill the list with values to the max size
        priceQuantityList.put(1, "1"); // Largest key for Integer::compareTo
        priceQuantityList.put(2, "2");
        priceQuantityList.put(3, "3");
        priceQuantityList.put(4, "4");
        priceQuantityList.put(5, "5"); // Smallest key for Integer::compareTo
    }

    @Test
    public void testSize() {
        Assertions.assertEquals(5, priceQuantityList.size(), "Size should be 5");
    }

    @Test
    public void testSizeAfterPuttingExistingKey() {
        priceQuantityList.put(1, "1");
        Assertions.assertEquals(5, priceQuantityList.size(), "Size should still be 5 after putting an existing key");
    }

    @Test
    public void testValueUpdatesAfterInsertingExistingKey() {
        priceQuantityList.put(1, "6");
        Assertions.assertEquals("6", priceQuantityList.get(1), "Value should be updated to 6");
    }

    @Test
    public void testPuttingKeyTooSmall() {
        // This key is too small and should not be added to the list
        priceQuantityList.put(6, "6");
        Assertions.assertEquals(false, priceQuantityList.containsKey(6), "Key 6 should not be in the list, it is outside the range of the list");
    }

    @Test
    public void testPuttingLargeKey() {
        // This key is large enough to be added to the list, and should remove the smallest key to maintain the list's size
        priceQuantityList.put(0, "0");
        Assertions.assertEquals(true, priceQuantityList.containsKey(0), "Key 0 should now be in the list");
        Assertions.assertEquals(false, priceQuantityList.containsKey(5), "Key 5 should not be in the list, it is now outside the range of the list");
    }

    @Test
    public void testRemovingKey() {
        priceQuantityList.remove(1);
        Assertions.assertEquals(false, priceQuantityList.containsKey(1), "Key 1 should not be in the list");
        Assertions.assertEquals(4, priceQuantityList.size(), "Size should be 4 after one removing key");
    }

}
