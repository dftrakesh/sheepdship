package io.github.dft.speedship.model.auth;

import lombok.Data;

@Data
public class AuthCredentials {
    private String clientId;
    private String audience;
    private String clientSecret;
}
