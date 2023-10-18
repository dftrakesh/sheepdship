package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferList {
    public GeneralVendorContract generalVendorContract;
    public PrimaryVendor primaryVendor;
    public List<OfferedProductList> offeredProductList;
    public TotalOfferPrice totalOfferPrice;
    public String apiVersion;
    public String offerDate;
    public String offerId;
    public String customerUserId;
    public TotalHandlingCharge totalHandlingCharge;
    public String status;
    public String expirationDate;
    public String productTransactionId;
}
