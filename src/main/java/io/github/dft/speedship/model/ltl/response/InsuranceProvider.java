package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InsuranceProvider {
    public String scac;
    public String status;
    public String mcNumber;
    public String vendorId;
    public String createdBy;
    public String legalName;
    public String namespace;
    public String orgUnitId;
    public String createDate;
    public List<String> pickupDays;
    public String vendorType;
    public AddressList addressList;
    public List<ContactList> contactList;
    public String orgUnitName;
    public String orgUnitType;
    public Integer pickupWindow;
    public List<BusinessHour> businessHours;
    public String lastUpdatedBy;
    public String preferredName;
    public String lastUpdateDate;
    public String latestPickupTime;
    public Integer termsPayableDays;
    public Boolean corporateApproved;
    public List<String> vendorProductList;
    public Integer notificationWindow;
    public String version;
}