package com.github.puregero.orderbookdemo.websocket;

import com.github.puregero.orderbookdemo.SampleData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test that all BinanceWebSocketPacket fields are parsed from the JSON data.
 */
public class BinanceWebSocketPacketTest {

    private static BinanceWebSocketPacket packet;

    @BeforeAll
    public static void beforeAll() {
        packet = BinanceWebSocketPacket.deserialize(SampleData.SAMPLE_WEBSOCKET_EVENT);
    }

    @Test
    public void hasStream() {
        Assertions.assertNotEquals(null, packet.stream(), "Stream cannot be undefined");
    }

    @Test
    public void hasData() {
        Assertions.assertNotEquals(null, packet.data(), "Data cannot be undefined");
    }

}
