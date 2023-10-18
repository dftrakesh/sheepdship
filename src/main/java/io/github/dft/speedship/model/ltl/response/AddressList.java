package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressList {
    public String phone;
    public String countryCode;
    public String postalCode;
    public String companyName;
    public String latitude;
    public String locality;
    public String region;
    public String longitude;
    public String timeZone;
    public List<String> addressLineList;
    public List<ContactList> contactList;
}
