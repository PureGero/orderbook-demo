package com.github.puregero.orderbookdemo.depthsnapshot;

import java.io.IOException;

public interface BinanceDepthSnapshotRequest {

    static BinanceDepthSnapshotRequest create() {
        return new BinanceDepthSnapshotRequestImpl(getBinanceDepthSnapshotBaseUrl());
    }

    private static String getBinanceDepthSnapshotBaseUrl() {
        return "https://api.binance.com/api/v3/depth";
    }

    BinanceDepthSnapshot request(String symbol, int limit) throws IOException, InterruptedException;

}
