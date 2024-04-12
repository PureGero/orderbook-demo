package com.github.puregero.orderbookdemo;

import com.github.puregero.orderbookdemo.orderbook.OrderBookManager;
import com.github.puregero.orderbookdemo.orderbook.OrderBookMath;

import java.util.concurrent.TimeUnit;

public class Main {
    public static final String[] SYMBOLS = new String[] { "BTCUSDT", "ETHUSDT" };
    public static final int DEPTH = 50;
    public static final long TIME_BETWEEN_VOLUME_CHANGE_CALCULATIONS = 10 * 1000; // 10 seconds (ms)

    private static final OrderBookMath orderBookMath = new OrderBookMath();

    public static void main(String[] args) throws Exception {
        System.out.println("## Orderbook Demo started");

        // Initiate the order book environment
        OrderBookManager orderBookManager = new OrderBookManager(DEPTH, SYMBOLS);

        // Loop order book updates and volume change calculations
        mainLoop(orderBookManager);
    }

    /**
     * The main looping logic of the program.
     * <p/>
     * Every so often, the volume changes of the order books are calculated and printed.
     * The frequency of these calculations is determined by the constant {@code TIME_BETWEEN_VOLUME_CHANGE_CALCULATIONS}.
     * <p/>
     * Between each volume change calculation, the order book is updated with new data from the Binance data stream.
     */
    public static void mainLoop(OrderBookManager orderBookManager) throws InterruptedException {
        long startTime = System.currentTimeMillis(); // (ms)
        long timeForNextVolumeChangeCalculation = startTime; // (ms)

        while (true) {
            long currentTime = System.currentTimeMillis(); // (ms)
            long timeUntilNextVolumeChangeCalculation = timeForNextVolumeChangeCalculation - currentTime;

            // Volume change calculation
            if (timeUntilNextVolumeChangeCalculation <= 0) {
                timeForNextVolumeChangeCalculation += TIME_BETWEEN_VOLUME_CHANGE_CALCULATIONS;
                orderBookMath.calculateAndPrintVolumeChanges(orderBookManager);
                continue;
            }

            // While we wait for the next volume change calculation, update the order book
            orderBookManager.updateOrderBook(timeUntilNextVolumeChangeCalculation, TimeUnit.MILLISECONDS);
        }
    }


}