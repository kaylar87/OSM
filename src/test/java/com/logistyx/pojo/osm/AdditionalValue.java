package com.logistyx.pojo.osm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ShippingId",
        "ShipperCode",
        "AdditionalValueKey",
        "Value"
})
@Getter
@Setter
@ToString
public class AdditionalValue {

    @JsonProperty("ShippingId")
    public Integer shippingId;
    @JsonProperty("ShipperCode")
    public String shipperCode;
    @JsonProperty("AdditionalValueKey")
    public String additionalValueKey;
    @JsonProperty("Value")
    public String value;

}
