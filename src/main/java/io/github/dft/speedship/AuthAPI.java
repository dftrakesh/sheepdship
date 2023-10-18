package io.github.dft.speedship;

import io.github.dft.speedship.model.auth.AccessCredential;
import io.github.dft.speedship.model.auth.AuthCredentials;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;

import static io.github.dft.speedship.constantcode.ConstantCodes.CONTENT_TYPE;
import static io.github.dft.speedship.constantcode.ConstantCodes.WWEX_V2_AUTH_URL;
import static io.github.dft.speedship.constantcode.ConstantCodes.HTTP_CONTENT_TYPE_URL_ENCODED;

public class AuthAPI extends SpeedShipSdk {

    @SneakyThrows
    public AccessCredential getAccessCredentials(AuthCredentials authCredentials) {

        String requestData = "grant_type=client_credentials" +
            "&client_id=" + authCredentials.getClientId() +
            "&client_secret=" + authCredentials.getClientSecret() +
            "&audience=" + authCredentials.getAudience();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(WWEX_V2_AUTH_URL))
            .header(CONTENT_TYPE, HTTP_CONTENT_TYPE_URL_ENCODED)
            .POST(HttpRequest.BodyPublishers.ofString(requestData))
            .build();

        return getRequestWrapped(request, AccessCredential.class);
    }
}