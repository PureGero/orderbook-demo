package com.github.puregero.orderbookdemo.orderbook;

import com.github.puregero.orderbookdemo.depthsnapshot.BinanceDepthSnapshot;
import com.github.puregero.orderbookdemo.depthsnapshot.BinanceDepthSnapshotRequest;
import com.github.puregero.orderbookdemo.websocket.BinanceWebSocket;
import com.github.puregero.orderbookdemo.websocket.BinanceWebSocketEvent;
import com.github.puregero.orderbookdemo.websocket.BinanceWebSocketPacket;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Manage a given set of order books specified by their symbols.
 * The order books can be kept up to date with data received from Binance by calling {@code updateOrderBook()}
 */
public class OrderBookManager {

    private final Map<String, OrderBook> orderBooks = new HashMap<>();
    private final BinanceDepthSnapshotRequest depthSnapshotRequest = BinanceDepthSnapshotRequest.create();
    private final BinanceWebSocket webSocket;

    public OrderBookManager(int depth, String... symbols) throws URISyntaxException, InterruptedException, IOException {
        this(depth, BinanceWebSocket.connectToDepthSymbols(symbols), symbols);
    }

    public OrderBookManager(int depth, BinanceWebSocket webSocket, String[] symbols) throws IOException, InterruptedException {
        this.webSocket = webSocket;

        for (String symbol : symbols) {
            OrderBook orderBook = new OrderBook(depth);
            orderBooks.put(symbol.toUpperCase(), orderBook);
            fillOrderBookWithSnapshot(symbol, depth, orderBook);
        }
    }

    /**
     * Request a depth snapshot from Binance and fill the order book with the data received.
     */
    private void fillOrderBookWithSnapshot(String symbol, int depth, OrderBook orderBook) throws IOException, InterruptedException {
        BinanceDepthSnapshot snapshot = depthSnapshotRequest.request(symbol, depth);
        orderBook.lastUpdateId(snapshot.lastUpdateId());
        orderBook.putBids(snapshot.bids());
        orderBook.putAsks(snapshot.asks());
    }

    /**
     * Update the order book with data received from the Binance data stream. This method will block until data is received.
     * @param timeout The maximum time to wait for new data
     * @param unit The time unit of the timeout
     * @throws InterruptedException If the thread is interrupted while waiting for new data
     */
    public void updateOrderBook(long timeout, TimeUnit unit) throws InterruptedException {
        BinanceWebSocketPacket packet = webSocket.pollNextPacket(timeout, unit);

        if (packet == null) {
            return; // Timed out
        }

        BinanceWebSocketEvent event = packet.data();
        OrderBook orderBook = orderBooks.get(event.symbol().toUpperCase());

        if (event.finalUpdateId() <= orderBook.lastUpdateId()) {
            return; // We've already processed these events
        }

        orderBook.putBids(event.bids());
        orderBook.putAsks(event.asks());

        orderBook.lastUpdateId(event.finalUpdateId());
    }

    /**
     * Get the set of order books with their symbols as keys.
     * @return The set of order books with their symbols as keys
     */
    public Set<Map.Entry<String, OrderBook>> orderBooks() {
        return orderBooks.entrySet();
    }
}
