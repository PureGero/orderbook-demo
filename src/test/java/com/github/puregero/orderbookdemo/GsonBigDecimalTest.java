package com.github.puregero.orderbookdemo;

import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * Check that gson parses big decimals from strings in the json correctly
 */
public class GsonBigDecimalTest {

    @Test
    public void testGsonsBigDecimalCapabilities() {
        String[] numbers = new String[] { "3515.36000000", "0.01070000", "3517.25000000", "0.28680000" };

        Gson gson = new Gson();

        for (String number : numbers) {
            String stringJson = "\"" + number + "\"";
            Assertions.assertEquals(new BigDecimal(number), gson.fromJson(stringJson, BigDecimal.class));
        }
    }
}
