package com.logistyx.pojo.osm;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ShipperCode",
        "ShippingUnitId",
        "ShippingUnitItemId",
        "AdditionalValueKey",
        "Value"
})
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalValue__1 {

    @JsonProperty("ShipperCode")
    public String shipperCode;
    @JsonProperty("ShippingUnitId")
    public Integer shippingUnitId;
    @JsonProperty("ShippingUnitItemId")
    public Integer shippingUnitItemId;
    @JsonProperty("AdditionalValueKey")
    public String additionalValueKey;
    @JsonProperty("Value")
    public String value;

}
