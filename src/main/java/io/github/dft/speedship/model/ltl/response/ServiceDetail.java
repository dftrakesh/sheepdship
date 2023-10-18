package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceDetail {
    public String name;
    public String destZipGroup;
    public String originZipGroup;
}
