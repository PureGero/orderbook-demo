package com.github.puregero.orderbookdemo.websocket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * Test that the BinanceWebSocket class can connect and receives the correct data
 */
public class BinanceWebSocketTest {

    @Test
    public void testBinanceWebSocket() {
        String symbol = "btcusdt";
        try (BinanceWebSocket webSocket = BinanceWebSocket.connectToDepthSymbols(symbol)) {
            BinanceWebSocketPacket packet = webSocket.pollNextPacket(1, TimeUnit.MINUTES);

            // Check that a packet was received
            Assertions.assertNotNull(packet, "No packet received");

            // Check the stream received is the stream we subscribed to
            Assertions.assertEquals(symbol + "@depth", packet.stream(), "Received data is not for the correct stream");

            // Check the event type is the event type we subscribed to
            Assertions.assertEquals("depthUpdate", packet.data().eventType(), "Event type is incorrect");

            // Check the symbol is the symbol we subscribed to
            Assertions.assertEquals(symbol, packet.data().symbol().toLowerCase(), "Symbol is incorrect");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
