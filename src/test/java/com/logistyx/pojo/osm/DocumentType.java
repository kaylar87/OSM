package com.logistyx.pojo.osm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "DocumentTypeCode",
        "InternalOnly",
        "Description"
})
@Getter
@Setter
@ToString
public class DocumentType {

    @JsonProperty("DocumentTypeCode")
    public String documentTypeCode;
    @JsonProperty("InternalOnly")
    public Boolean internalOnly;
    @JsonProperty("Description")
    public String description;

}