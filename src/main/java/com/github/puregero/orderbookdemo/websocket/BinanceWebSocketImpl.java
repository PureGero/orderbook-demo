package com.github.puregero.orderbookdemo.websocket;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BinanceWebSocketImpl extends WebSocketClient implements BinanceWebSocket {

    private final LinkedBlockingQueue<BinanceWebSocketPacket> buffer = new LinkedBlockingQueue<>(); // LinkedBlockingQueue for safe multi-thread access

    /**
     * Connect to the Binance data stream. Blocks until the connection is opened.
     * @param url The url of the data stream
     * @throws URISyntaxException If the url is an invalid syntax
     * @throws InterruptedException If the thread was interrupted while waiting for the connection to open
     */
    BinanceWebSocketImpl(String url) throws URISyntaxException, InterruptedException {
        this(new URI(url));
    }

    /**
     * Connect to the Binance data stream. Blocks until the connection is opened.
     * @param uri The uri of the data stream
     * @throws InterruptedException If the thread was interrupted while waiting for the connection to open
     */
    BinanceWebSocketImpl(URI uri) throws InterruptedException {
        super(uri);
        this.connectBlocking();
    }

    // --- WebSocketClient methods --- \\

    @Override
    public void onOpen(ServerHandshake serverHandshake) {

    }

    @Override
    public void onMessage(String message) {
        BinanceWebSocketPacket packet = deserializeMessage(message);
        buffer.add(packet);
    }

    private BinanceWebSocketPacket deserializeMessage(String message) {
        return BinanceWebSocketPacket.deserialize(message);
    }

    @Override
    public void onClose(int code, String reason, boolean isRemote) {

    }

    @Override
    public void onError(Exception e) {
        e.printStackTrace();
    }

    // -- BinanceWebSocket methods -- \\

    @Override
    public BinanceWebSocketPacket pollNextPacket(long time, TimeUnit unit) throws InterruptedException {
        return buffer.poll(time, unit);
    }

    @Override
    public boolean isConnected() {
        return isOpen();
    }

}
