package com.github.puregero.orderbookdemo.depthsnapshot;

import com.github.puregero.orderbookdemo.SampleData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test that all BinanceDepthSnapshot fields are parsed from the JSON data.
 */
public class BinanceDepthSnapshotTest {

    private static BinanceDepthSnapshot snapshot;

    @BeforeAll
    public static void beforeAll() {
        snapshot = BinanceDepthSnapshot.deserialize(SampleData.SAMPLE_DEPTH_SNAPSHOT);
    }

    @Test
    public void testHasLastUpdateId() {
        Assertions.assertNotEquals(0, snapshot.lastUpdateId(), "Last update ID cannot be undefined");
    }

    @Test
    public void testHasBids() {
        Assertions.assertNotEquals(null, snapshot.bids(), "Bids cannot be undefined");
    }

    @Test
    public void testHasAsks() {
        Assertions.assertNotEquals(null, snapshot.asks(), "Asks cannot be undefined");
    }
}
