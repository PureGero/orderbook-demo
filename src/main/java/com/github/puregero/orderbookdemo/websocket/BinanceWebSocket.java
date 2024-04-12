package com.github.puregero.orderbookdemo.websocket;

import java.io.Closeable;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public interface BinanceWebSocket extends Closeable {

    /**
     * Connect to the Binance diff depth data streams for the specific symbols. Blocks until the data stream is connected
     * @param symbols The symbols to connect to (eg "bnbbtc")
     * @return The BinanceWebSocket object
     * @throws URISyntaxException If the url is an invalid syntax
     * @throws InterruptedException If the thread was interrupted while waiting for the connection to open
     */
    static BinanceWebSocket connectToDepthSymbols(String... symbols) throws URISyntaxException, InterruptedException {
        // Depth data streams are in the format "symbol@depth" where symbol must be lowercase
        String[] streams = Arrays.stream(symbols)
                .map(symbol -> symbol.toLowerCase() + "@depth")
                .toArray(String[]::new);

        return connectToStreams(streams);
    }

    /**
     * Connect to the specified Binance data streams. Blocks until the data stream is connected
     * @param streams The streams to connect to (eg "bnbbtc@depth")
     * @return The BinanceWebSocket object
     * @throws URISyntaxException If the url is an invalid syntax
     * @throws InterruptedException If the thread was interrupted while waiting for the connection to open
     */
    static BinanceWebSocket connectToStreams(String... streams) throws URISyntaxException, InterruptedException {
        return new BinanceWebSocketImpl(getBinanceDataStreamUrl(streams));
    }

    /**
     * Get the URL for the Binance websocket with the specific streams
     * @param streams The streams to connect to with this websocket
     * @return The URL for the data stream
     */
    private static String getBinanceDataStreamUrl(String... streams) {
        // Streams are deliminated with a /
        // eg: wss://stream.binance.com:9443/stream?streams=btcusdt@depth/ethusdt@depth
        return "wss://stream.binance.com:9443/stream?streams=" + String.join("/", streams);
    }

    /**
     * Poll the next packet from the data stream. Blocks until a packet is available, or until the specified time has elapsed
     * @param time The time to wait
     * @param unit The units of the time value
     * @return The next packet received from the data stream
     * @throws InterruptedException If the thread was interrupted while waiting for a packet
     */
    BinanceWebSocketPacket pollNextPacket(long time, TimeUnit unit) throws InterruptedException;

    /**
     * Check if the data stream is connected
     * @return True if the data stream is connected, false otherwise
     */
    boolean isConnected();

}
