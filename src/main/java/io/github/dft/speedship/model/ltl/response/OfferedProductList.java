package io.github.dft.speedship.model.ltl.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferedProductList {
    public OfferPrice offerPrice;
    public String creationMode;
    public LinearFootCharge linearFootCharge;
    public ServiceDetail serviceDetail;
    public String offeredProductId;
    public LinearFootWeight linearFootWeight;
    public String apiVersion;
    public ShopRQShipment shopRQShipment;
    public String productType;
    public List<ChargeItemList> chargeItemList;
}
