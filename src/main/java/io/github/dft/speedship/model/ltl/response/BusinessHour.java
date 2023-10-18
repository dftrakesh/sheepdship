package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BusinessHour {
    public String endTime;
    public Boolean isClosed;
    public String beginTime;
    public String dayOfWeek;
    public String apiVersion;
    public Boolean isOpen24Hours;
}
