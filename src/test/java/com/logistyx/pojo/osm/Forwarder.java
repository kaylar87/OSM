package com.logistyx.pojo.osm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ForwarderCode",
        "Name"
})
@Getter
@Setter
@ToString
public class Forwarder {

    @JsonProperty("ForwarderCode")
    public String forwarderCode;
    @JsonProperty("Name")
    public String name;

}
