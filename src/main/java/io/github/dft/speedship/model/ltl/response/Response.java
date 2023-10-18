package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    public Error error;
    public String message;
    public List<String> scacList;
    public Boolean manualShopFlow;
    public Boolean cubicMinApplicable;
    public InsuranceProvider insuranceProvider;
    public List<OfferList> offerList;
}
