package com.logistyx.pojo.osm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ShippingUnitId",
        "ShippingUnitItemId",
        "ClassId",
        "Division",
        "CompatibilityGroup",
        "ClassIdDivisionCompatibilityGroup",
        "HazardousMaterialIdentificationNumber",
        "ProperShippingName",
        "PackingGroup",
        "PackingInstruction",
        "Quantity",
        "QuantityUnitOfMeasure",
        "Weight",
        "WeightUnitOfMeasure",
        "Accessible",
        "CargoOnly",
        "LimitedQuantity",
        "ExceptedQuantity",
        "Packaging",
        "LabelCodes",
        "TechnicalName",
        "HandlingInstructions",
        "ReportableQuantity",
        "Percentage",
        "SignatoryAddressId",
        "SignatoryAddress",
        "AllPackedInOne",
        "AllPackedInOnePackageType",
        "AllPackedInOneConsignment",
        "Overpack",
        "OverpackConsignment",
        "Radioactive",
        "Radionuclide",
        "RadioactiveActivity",
        "RadioactiveActivityUnitOfMeasure",
        "RadioactivePackageType",
        "RadioactiveTransportIndex",
        "RadioactiveLabelType",
        "RadioactiveSurfaceReading",
        "RadioactiveDimension",
        "RadioactiveDimensionUnitOfMeasure",
        "RadioactivePhysicalForm",
        "RadioactiveChemicalFormula",
        "Infectious",
        "NonregulatedLithiumBatteries",
        "SpecialProvisions",
        "SubsidiaryRisks",
        "Exemptions",
        "ConsumerCommodity",
        "ExceptedPackagesRadioactiveMaterialIndicator",
        "ExemptionId",
        "HazardousRequiredInformation"
})
@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class DangerousGood {

    @JsonProperty("ShippingUnitId")
    public Integer shippingUnitId;
    @JsonProperty("ShippingUnitItemId")
    public Integer shippingUnitItemId;
    @JsonProperty("ClassId")
    public Object classId;
    @JsonProperty("Division")
    public Object division;
    @JsonProperty("CompatibilityGroup")
    public Object compatibilityGroup;
    @JsonProperty("ClassIdDivisionCompatibilityGroup")
    public String classIdDivisionCompatibilityGroup;
    @JsonProperty("HazardousMaterialIdentificationNumber")
    public String hazardousMaterialIdentificationNumber;
    @JsonProperty("ProperShippingName")
    public String properShippingName;
    @JsonProperty("PackingGroup")
    public Object packingGroup;
    @JsonProperty("PackingInstruction")
    public Object packingInstruction;
    @JsonProperty("Quantity")
    public Float quantity;
    @JsonProperty("QuantityUnitOfMeasure")
    public Object quantityUnitOfMeasure;
    @JsonProperty("Weight")
    public Float weight;
    @JsonProperty("WeightUnitOfMeasure")
    public String weightUnitOfMeasure;
    @JsonProperty("Accessible")
    public Object accessible;
    @JsonProperty("CargoOnly")
    public Object cargoOnly;
    @JsonProperty("LimitedQuantity")
    public Boolean limitedQuantity;
    @JsonProperty("ExceptedQuantity")
    public Boolean exceptedQuantity;
    @JsonProperty("Packaging")
    public Object packaging;
    @JsonProperty("LabelCodes")
    public Object labelCodes;
    @JsonProperty("TechnicalName")
    public String technicalName;
    @JsonProperty("HandlingInstructions")
    public Object handlingInstructions;
    @JsonProperty("ReportableQuantity")
    public Boolean reportableQuantity;
    @JsonProperty("Percentage")
    public Object percentage;
    @JsonProperty("SignatoryAddressId")
    public Object signatoryAddressId;
    @JsonProperty("SignatoryAddress")
    public Object signatoryAddress;
    @JsonProperty("AllPackedInOne")
    public Object allPackedInOne;
    @JsonProperty("AllPackedInOnePackageType")
    public Object allPackedInOnePackageType;
    @JsonProperty("AllPackedInOneConsignment")
    public Object allPackedInOneConsignment;
    @JsonProperty("Overpack")
    public Object overpack;
    @JsonProperty("OverpackConsignment")
    public Object overpackConsignment;
    @JsonProperty("Radioactive")
    public Object radioactive;
    @JsonProperty("Radionuclide")
    public Object radionuclide;
    @JsonProperty("RadioactiveActivity")
    public Object radioactiveActivity;
    @JsonProperty("RadioactiveActivityUnitOfMeasure")
    public Object radioactiveActivityUnitOfMeasure;
    @JsonProperty("RadioactivePackageType")
    public Object radioactivePackageType;
    @JsonProperty("RadioactiveTransportIndex")
    public Object radioactiveTransportIndex;
    @JsonProperty("RadioactiveLabelType")
    public Object radioactiveLabelType;
    @JsonProperty("RadioactiveSurfaceReading")
    public Object radioactiveSurfaceReading;
    @JsonProperty("RadioactiveDimension")
    public Object radioactiveDimension;
    @JsonProperty("RadioactiveDimensionUnitOfMeasure")
    public Object radioactiveDimensionUnitOfMeasure;
    @JsonProperty("RadioactivePhysicalForm")
    public Object radioactivePhysicalForm;
    @JsonProperty("RadioactiveChemicalFormula")
    public Object radioactiveChemicalFormula;
    @JsonProperty("Infectious")
    public Object infectious;
    @JsonProperty("NonregulatedLithiumBatteries")
    public Object nonregulatedLithiumBatteries;
    @JsonProperty("SpecialProvisions")
    public List<String> specialProvisions = null;
    @JsonProperty("SubsidiaryRisks")
    public Object subsidiaryRisks;
    @JsonProperty("Exemptions")
    public Object exemptions;
    @JsonProperty("ConsumerCommodity")
    public Object consumerCommodity;
    @JsonProperty("ExceptedPackagesRadioactiveMaterialIndicator")
    public Integer exceptedPackagesRadioactiveMaterialIndicator;
    @JsonProperty("ExemptionId")
    public Object exemptionId;
    @JsonProperty("HazardousRequiredInformation")
    public Object hazardousRequiredInformation;

}
