package io.github.dft.speedship.model.ltl.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    public String locality;
    public String region;
    public String postalCode;
    public String countryCode;
    public String companyName;
    public String phone;
    public List<String> addressLineList;
    public List<ContactList> contactList;
}
