package com.github.puregero.orderbookdemo.websocket;

import com.github.puregero.orderbookdemo.SampleData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test that all BinanceWebSocketEvent fields are parsed from the JSON data.
 */
public class BinanceWebSocketEventTest {

    private static BinanceWebSocketEvent event;

    @BeforeAll
    public static void beforeAll() {
        event = BinanceWebSocketPacket.deserialize(SampleData.SAMPLE_WEBSOCKET_EVENT).data();
    }

    @Test
    public void testHasEventType() {
        Assertions.assertNotEquals(null, event.eventType(), "Event type cannot be undefined");
    }

    @Test
    public void testHasEventTime() {
        Assertions.assertNotEquals(0, event.eventTime(), "Event time cannot be undefined");
    }

    @Test
    public void testHasSymbol() {
        Assertions.assertNotEquals(null, event.symbol(),"Symbol cannot be undefined");
    }

    @Test
    public void testHasFirstUpdateID() {
        Assertions.assertNotEquals(0, event.firstUpdateId(), "First update ID cannot be undefined");
    }

    @Test
    public void testHasFinalUpdateID() {
        Assertions.assertNotEquals(0, event.finalUpdateId(), "Final update ID cannot be undefined");
    }

    @Test
    public void testHasBids() {
        Assertions.assertNotEquals(null, event.bids(), "Bids cannot be undefined");
    }

    @Test
    public void testHasAsks() {
        Assertions.assertNotEquals(null, event.asks(), "Asks cannot be undefined");
    }

}
