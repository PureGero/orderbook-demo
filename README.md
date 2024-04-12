# Orderbook demo

An order book that is kept up-to-date in real-time using the Binance API. Every
10 seconds, the order book's volume is calculated, and the volume change since
the last calculation is displayed. The order book is also displayed at the same
time. There are two order books, one for BTC/USDT and one for ETH/USDT.

## Building and running

Maven is required to build the project.
[Install it here](https://maven.apache.org/install.html).

To build the project, run the following command:

```bash
mvn
```

This will produce the jar file:

```
target/orderbook-demo-1.0.0.jar
```

Build and run the project with the following command:

```bash
mvn && java -jar target/orderbook-demo-1.0.0.jar
```

## Code structure

The repository code is structured as follows:

```
com.github.puregero.orderbookdemo
│
├ depthsnapshot
│ Package for taking a depth snapshot from the Binance API
│ 
├ websocket
│ Package for connecting to the Binance live data stream API
│  
├ orderbook
│ Package related to the local order book
│ │
│ ├ OrderBook
│ │ A singular order book with a list of bids and asks
│ │ 
│ ├ OrderBookManager
│ │ Manages multiple order books and keeps them up-to-date from the Binance API
│ │
│ └ OrderBookMath
│   Methods for calculating the volume of an order book, and the volume change
│   between two calculations
│ 
└ Main
  The entry point and the main program loop
```