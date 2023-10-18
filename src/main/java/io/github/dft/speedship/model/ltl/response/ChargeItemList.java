package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChargeItemList {
    public Boolean hideOnVendorInvoice;
    public String chargeType;
    public CustomerPrice customerPrice;
    public String customerChargeCode;
    public String apiVersion;
    public String chargeCodeCategory;
    public String chargeItemId;
    public Boolean isIPMChargeItem;
    public String description;
    public String customerDescription;
    public Boolean matchOnRequestChargeItem;
    public String itemCode;
    public Boolean isIncludedInFuelSurcharge;
    public String uplift;
    public String upliftPercent;
}
