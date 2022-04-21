package com.logistyx.pojo.osm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ContactId",
        "AddressId",
        "ContactTypeCode",
        "Name",
        "AddressAs",
        "EmailAddress",
        "PhoneNumber",
        "FaxNumber"
})
@Getter
@Setter
@ToString
public class Contact__2 {

    @JsonProperty("ContactId")
    public Integer contactId;
    @JsonProperty("AddressId")
    public Integer addressId;
    @JsonProperty("ContactTypeCode")
    public Object contactTypeCode;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("AddressAs")
    public Object addressAs;
    @JsonProperty("EmailAddress")
    public String emailAddress;
    @JsonProperty("PhoneNumber")
    public String phoneNumber;
    @JsonProperty("FaxNumber")
    public Object faxNumber;

}
