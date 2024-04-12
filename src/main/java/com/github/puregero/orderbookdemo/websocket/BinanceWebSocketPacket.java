package com.github.puregero.orderbookdemo.websocket;

import com.google.gson.Gson;

public record BinanceWebSocketPacket(String stream, BinanceWebSocketEvent data) {

    private static final Gson gson = new Gson();

    public static BinanceWebSocketPacket deserialize(String json) {
        return gson.fromJson(json, BinanceWebSocketPacket.class);
    }

}
