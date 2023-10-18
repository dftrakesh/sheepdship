package io.github.dft.speedship;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.dft.speedship.model.auth.AccessCredential;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

import static io.github.dft.speedship.constantcode.ConstantCodes.*;

public class SpeedShipSdk {

    protected HttpClient client;
    protected AccessCredential accessCredential;
    private ObjectMapper objectMapper;

    public SpeedShipSdk(AccessCredential accessCredential) {
        client = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
        this.accessCredential = accessCredential;
    }

    public SpeedShipSdk() {
        this.objectMapper = new ObjectMapper();
        client = HttpClient.newHttpClient();
    }

    @SneakyThrows
    public <T> T getRequestWrapped(HttpRequest request, Class<T> tClass) {

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenComposeAsync(CompletableFuture::completedFuture)
            .thenApplyAsync(HttpResponse::body)
            .thenApplyAsync(responseBody -> convertBody(responseBody, tClass))
            .get();
    }

    @SneakyThrows
    private <T> T convertBody(String body, Class<T> tClass) {
        return objectMapper.readValue(body, tClass);
    }

    @SneakyThrows
    private <T> String convertBodyToString(T tClass) {
        return objectMapper.writeValueAsString(tClass);
    }

    @SneakyThrows
    protected URI baseUrl(String path) {
        return new URI(WWEX_V2_BASEURL + path);
    }

    @SneakyThrows
    protected <T> HttpRequest post(URI uri, T tClass) {
        String jsonBody = convertBodyToString(tClass);

        return HttpRequest.newBuilder(uri)
            .header(AUTHORIZATION_HEADER, TOKEN_TYPE_BEARER + accessCredential.getAccessToken())
            .header(CONTENT_TYPE, HTTP_REQUEST_CONTENT_TYPE_JOSN)
            .header(ACCEPT, HTTP_REQUEST_CONTENT_TYPE_JOSN)
            .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
            .build();
    }
}