package com.github.puregero.orderbookdemo.depthsnapshot;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BinanceDepthSnapshotRequestImpl implements BinanceDepthSnapshotRequest {

    private final String baseUrl;
    private final HttpClient httpClient = HttpClient.newHttpClient();

    /**
     * Create BinanceDepthSnapshotRequest object to request BinanceDepthSnapshots with
     * @param baseUrl Base url for the request (eg "https://api.binance.com/api/v3/depth")
     */
    public BinanceDepthSnapshotRequestImpl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public BinanceDepthSnapshot request(String symbol, int limit) throws IOException, InterruptedException {
        HttpRequest request = createRequest(symbol, limit);
        String response = sendRquest(request);
        return BinanceDepthSnapshot.deserialize(response);
    }

    private HttpRequest createRequest(String symbol, int limit) {
        return HttpRequest.newBuilder(URI.create(baseUrl + "?symbol=" + symbol.toUpperCase() + "&limit=" + limit)).build();
    }

    private String sendRquest(HttpRequest request) throws IOException, InterruptedException {
        HttpResponse<String> response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
