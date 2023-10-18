package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrimaryVendor {
    public String scac;
    public String vendorId;
    public String preferredName;
    public List<ContactList> contactList;
}
