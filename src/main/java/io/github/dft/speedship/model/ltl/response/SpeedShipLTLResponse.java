package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpeedShipLTLResponse {
    public String apiVersion;
    public ClientStatus clientStatus;
    public String correlationId;
    public Response response;
}
