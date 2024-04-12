package com.github.puregero.orderbookdemo.depthsnapshot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinanceDepthSnapshotRequestTest {

    @Test
    public void testBinanceDepthSnapshotRequest() {
        BinanceDepthSnapshotRequest request = BinanceDepthSnapshotRequest.create();
        try {
            BinanceDepthSnapshot snapshot = request.request("BTCUSDT", 50);

            Assertions.assertNotEquals(0, snapshot.lastUpdateId(), "Last update ID cannot be undefined");
            Assertions.assertEquals(50, snapshot.bids().length, "Bids length must be 50");
            Assertions.assertEquals(50, snapshot.asks().length, "Asks length must be 50");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
