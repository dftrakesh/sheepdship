package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeInTransit {
    public String apiVersion;
    public String scac;
    public String milesInTransit;
    public Integer transitDays;
    public String serviceLevel;
    public String estimatedDeliveryDate;
    public String productType;
    public OriginTerminal originTerminal;
    public DestTerminal destTerminal;
    public String serviceDescription;
}
