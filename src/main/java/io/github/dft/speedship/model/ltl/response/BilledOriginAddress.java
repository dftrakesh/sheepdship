package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.github.dft.speedship.model.ltl.request.Address;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BilledOriginAddress {
    public Address address;
}
