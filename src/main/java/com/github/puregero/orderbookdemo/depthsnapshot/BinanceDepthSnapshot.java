package com.github.puregero.orderbookdemo.depthsnapshot;

import com.google.gson.Gson;

import java.math.BigDecimal;

public record BinanceDepthSnapshot(long lastUpdateId, BigDecimal[][] bids, BigDecimal[][] asks) {

    private static final Gson gson = new Gson();

    public static BinanceDepthSnapshot deserialize(String json) {
        return gson.fromJson(json, BinanceDepthSnapshot.class);
    }

}
