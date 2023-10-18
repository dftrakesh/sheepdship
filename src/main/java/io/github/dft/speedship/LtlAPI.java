package io.github.dft.speedship;

import io.github.dft.speedship.model.auth.AccessCredential;
import io.github.dft.speedship.model.ltl.request.SpeedShipLTLRequest;
import io.github.dft.speedship.model.ltl.response.SpeedShipLTLResponse;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;

public class LtlAPI extends SpeedShipSdk {

    public LtlAPI(AccessCredential accessCredential) {
        super(accessCredential);
    }

    @SneakyThrows
    public SpeedShipLTLResponse shopFlow(SpeedShipLTLRequest request) {
        URI uri = baseUrl("shopFlow");
        System.out.println(uri.toString());
        HttpRequest post = post(uri, request);

        return getRequestWrapped(post, SpeedShipLTLResponse.class);
    }
}
