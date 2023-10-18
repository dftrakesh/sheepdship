package io.github.dft.speedship.model.ltl.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shipment {
    public String shipmentDate;
    public OriginAddress originAddress;
    public HandlingCharge handlingCharge;
    public Integer totalHandlingUnitCount;
    public DestinationAddress destinationAddress;
    public TotalWeight totalWeight;
    public Boolean isCOD;
    public Boolean insuranceRequestFlag;
    public Boolean directDeliveryOnlyFlag;
    public Boolean deliveryConfirmationFlag;
    public Boolean isCarbonNeutral;
    public Boolean adultSignatureRequiredFlag;
    public Boolean isSignatureRequired;
    public Boolean isSelfScheduled;
    public Boolean appointmentDeliveryFlag;
    public Boolean residentialDeliveryFlag;
    public Boolean residentialPickupFlag;
    public Boolean shipperReleaseFlag;
    public Boolean tradeshowDeliveryFlag;
    public Boolean tradeshowPickupFlag;
    public Boolean returnLabelFlag;
    public Boolean liftgateDeliveryFlag;
    public List<HandlingUnitList> handlingUnitList;
}
