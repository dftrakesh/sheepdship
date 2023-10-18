package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactList {
    public String id;
    public String email;
    public String phone;
    public String website;
    public String lastName;
    public String apiVersion;
    public String contactType;
    public String preferredContactMethod;
}
