package com.github.puregero.orderbookdemo.websocket;

import java.math.BigDecimal;

public class BinanceWebSocketEvent {

    private final String e; // Event type
    private final long E; // Event time
    private final String s; // Symbol
    private final long U; // First update ID in event
    private final long u; // Final update ID in event
    private final BigDecimal[][] b; // Bids to be updated // Use BigDecimal to remove floating point inaccuracies
    private final BigDecimal[][] a; // Asks to be updated // Use BigDecimal to remove floating point inaccuracies

    public BinanceWebSocketEvent(String eventType, long eventTime, String symbol, long firstUpdateId, long finalUpdateId, BigDecimal[][] bids, BigDecimal[][] asks) {
        this.e = eventType;
        this.E = eventTime;
        this.s = symbol;
        this.U = firstUpdateId;
        this.u = finalUpdateId;
        this.b = bids;
        this.a = asks;
    }

    public String eventType() {
        return e;
    }

    public long eventTime() {
        return E;
    }

    public String symbol() {
        return s;
    }

    public long firstUpdateId() {
        return U;
    }

    public long finalUpdateId() {
        return u;
    }

    public BigDecimal[][] bids() {
        return b;
    }

    public BigDecimal[][] asks() {
        return a;
    }

}
