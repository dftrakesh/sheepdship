package io.github.dft.speedship.model.ltl.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HandlingUnitList {
    public Weight weight;
    public Integer quantity;
    public String packagingType;
    public Boolean isMixedClass;
    public Boolean isStackable;
    public String packagingTypeName;
    public BilledDimension billedDimension;
    public List<ReferenceList> referenceList;
    public List<ShippedItemList> shippedItemList;
}
