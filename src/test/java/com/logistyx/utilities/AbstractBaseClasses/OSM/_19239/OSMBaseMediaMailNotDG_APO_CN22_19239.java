package com.logistyx.utilities.AbstractBaseClasses.OSM._19239;


import com.logistyx.pojo.osm.OSMPojo;
import com.logistyx.utilities.Environment;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Test;

import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public abstract class OSMBaseMediaMailNotDG_APO_CN22_19239 {

    public static String requestJsonBodyShipments;
    public static RequestSpecification requestSpecShipments;
    public static ResponseSpecification responseSpecShipments;
    public static ValidatableResponse validateResponseShipments;
    public static OSMPojo osmPojoShipments;
    public static String encodedStringFromPostmanShipments;
    public static String decodedStringShipments;
    public static byte[] decodedBytesShipments;
    public static String encodedStringFromPostmanShipmentsCN22;
    public static String decodedStringShipmentsCN22;
    public static byte[] decodedBytesShipmentsCN22;

    public static String categoryOfGoodsFromJson;
    public static Map<String, String> categoryOfGoodsValueFromJsonMap;

    @Test
    public static void shipmentsLabel() {

        requestJsonBodyShipments = "{\n" +
                "    \"ProjectCode\": \"LX_CHICAGO\",\n" +
                "    \"ForwarderDivisionCode\": \"OSM\",\n" +
                "    \"ForwarderServiceCode\": \"OSM-MEDIA-MAIL\",\n" +
                "    \"ShipperRef\": \"Shipper Reference\",\n" +
                "    \"ReceiverRef\": \"Receiver Reference\",\n" +
                "    \"Addresses\": [\n" +
                "       {\n" +
                "            \"Reference\": \"B Company\",\n" +
                "            \"AddressLines\": [\n" +
                "                {\n" +
                "                    \"Index\": 1,\n" +
                "                    \"Value\": \"2-10 Infantry Battalion\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Index\": 2,\n" +
                "                    \"Value\": \"1st Platoon\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"PostalCode\": \"09354\",\n" +
                "            \"LocalityName\": \"APO\",\n" +
                "            \"SubdivisionCode\": \"AE\",\n" +
                "            \"CountryCode\": \"US\",\n" +
                "            \"Contacts\": [\n" +
                "                {\n" +
                "                    \"Name\": \"Squidward Jarhead Grunt Rotorhead\",\n" +
                "                    \"PhoneNumber\": \"202-456-1414\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"Residential\": false,\n" +
                "            \"AddressTypes\": [\n" +
                "                {\n" +
                "                    \"AddressTypeCode\": \"DELIVERY\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"Reference\": \"GEN_BERLIN\",\n" +
                "            \"AddressLines\": [\n" +
                "                {\n" +
                "                    \"Index\": 1,\n" +
                "                    \"Value\": \"745 E Knopf Rd\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"PostalCode\": \"54923\",\n" +
                "            \"LocalityName\": \"Berlin\",\n" +
                "            \"SubdivisionCode\": \"WI\",\n" +
                "            \"SubdivisionName\": \"Wisconsin\",\n" +
                "            \"CountryCode\": \"US\",\n" +
                "            \"Contacts\": [\n" +
                "                {\n" +
                "                    \"ContactTypeCode\": \"PICKUP\",\n" +
                "                    \"Name\": \"Logistics@Generac.com\",\n" +
                "                    \"PhoneNumber\": \"262-544-4811\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"Residential\": false,\n" +
                "            \"AddressTypes\": [\n" +
                "                {\n" +
                "                    \"AddressTypeCode\": \"PICKUP\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"FreightPayer\": \"SHIPPER\",\n" +
                "    \"ShippingUnits\": [\n" +
                "        {\n" +
                "            \"ShipperRef\": \"99000018364\",\n" +
                "            \"Length\": 10.0,\n" +
                "            \"Width\": 10.0,\n" +
                "            \"Height\": 10.0,\n" +
                "            \"DimensionsUnitOfMeasure\": \"IN\",\n" +
                "            \"VolumeUnitOfMeasure\": \"IN3\",\n" +
                "            \"PackageType\": \"ZZ\",\n" +
                "            \"GrossWeight\": 5.86,\n" +
                "            \"GrossWeightUnitOfMeasure\": \"LB\",\n" +
                "            \"Content\": \"Widget. Widget\",\n" +
                "            \"Remark\": \"Does not apply on materials regulated by the U.S. Department of Transportation as hazardous and required tobear a Hazard Class or Hazard Division label. For classes applicable to such hazardous materials, see provisionselsewhere inthis Classification.\",\n" +
                "            \"NumberOfShippingUnitItems\": 1,\n" +
                "            \"AdditionalValues\": [\n" +
                "                        {\n" +
                "                            \"AdditionalValueKey\": \"CATEGORY_OF_GOODS\",\n" +
                "                            \"Value\": \"6\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"AdditionalValueKey\": \"COMMENTS\",\n" +
                "                            \"Value\": \"Something\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "            \"ShippingUnitItems\": [\n" +
                "                {\n" +
                "                    \"ForwarderRef\": 9999999999,\n" +
                "                    \"Value\": 1.55,\n" +
                "                    \"ValueCurrencyCode\": \"USD\",\n" +
                "                    \"Quantity\": 2,\n" +
                "                    \"QuantityUnitOfMeasure\": \"PCS\",\n" +
                "                    \"Weight\": 9.85,\n" +
                "                    \"WeightUnitOfMeasure\": \"LB\",\n" +
                "                    \"Description\": \"COLD KIT\",\n" +
                "                    \"CountryOfOrigin\": \"US\",\n" +
                "                    \"HarmonisedSystemCode\": \"8516808000\",\n" +
                "                    \"ProductCode\": \"G0062120\",\n" +
                "                    \"Fragile\": false,\n" +
                "                    \"Liquids\": false\n" +
                "                },\n" +
                "                {\n" +
                "                    \"ForwarderRef\": 9999999999,\n" +
                "                    \"Value\": 1.0,\n" +
                "                    \"ValueCurrencyCode\": \"USD\",\n" +
                "                    \"Quantity\": 3,\n" +
                "                    \"QuantityUnitOfMeasure\": \"PCS\",\n" +
                "                    \"Weight\": 1.33,\n" +
                "                    \"WeightUnitOfMeasure\": \"LB\",\n" +
                "                    \"Description\": \"WARM KIT\",\n" +
                "                    \"CountryOfOrigin\": \"US\",\n" +
                "                    \"HarmonisedSystemCode\": \"8516808000\",\n" +
                "                    \"ProductCode\": \"G0062120\",\n" +
                "                    \"Fragile\": false,\n" +
                "                    \"Liquids\": false\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"ValueCurrencyCode\": \"USD\",\n" +
                "    \"RequestedPickupDateTime\": \"2022-02-01T12:03:00\",\n" +
                "    \"ServiceLevelAgreementDeliveryDateTime\": \"2022-02-07T00:00:00Z\",\n" +
                "    \"ExpectedDeliveryDateTime\": \"2022-02-07T00:00:00Z\"\n" +
                "}";

        requestSpecShipments = given().header("Shipper-Code", "LBI")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(requestJsonBodyShipments);
        responseSpecShipments = expect().statusCode(200)
                .and()
                .contentType(ContentType.JSON);
        validateResponseShipments = given().spec(requestSpecShipments)
                .when()
                .post(Environment.BASE_URL + "/shipments/label")
                .then()
                .spec(responseSpecShipments);
        osmPojoShipments = validateResponseShipments.extract().as(OSMPojo.class);
        encodedStringFromPostmanShipments = osmPojoShipments.getDocuments().get(1).getContent();
        decodedBytesShipments = Base64.getDecoder().decode(encodedStringFromPostmanShipments);
        decodedStringShipments = new String(decodedBytesShipments);

        encodedStringFromPostmanShipmentsCN22 = osmPojoShipments.getDocuments().get(0).getContent();
        decodedBytesShipmentsCN22 = Base64.getDecoder().decode(encodedStringFromPostmanShipmentsCN22);
        decodedStringShipmentsCN22 = new String(decodedBytesShipmentsCN22);


        if (requestJsonBodyShipments.contains("CATEGORY_OF_GOODS")) {
            categoryOfGoodsValueFromJsonMap = new LinkedHashMap<>();
            categoryOfGoodsFromJson = osmPojoShipments.getShippingUnits().get(0).getAdditionalValues().get(0).getValue();
            switch (categoryOfGoodsFromJson) {
                case "1":
                    categoryOfGoodsValueFromJsonMap.put("1", "Merchandise");
                    break;
                case "2":
                    categoryOfGoodsValueFromJsonMap.put("2", "Gift");
                    break;
                case "3":
                    categoryOfGoodsValueFromJsonMap.put("3", "Document");
                    break;
                case "4":
                    categoryOfGoodsValueFromJsonMap.put("4", "Commercial Sample");
                    break;
                case "5":
                    categoryOfGoodsValueFromJsonMap.put("5", "Returned Goods");
                    break;
                case "6":
                    categoryOfGoodsValueFromJsonMap.put("6", "Other [" + osmPojoShipments.getShippingUnits().get(0).getAdditionalValues().get(1).getValue() + "]");
                    break;
                case "7":
                    categoryOfGoodsValueFromJsonMap.put("7", "Humanitarian Donations");
                    break;
                case "8":
                    categoryOfGoodsValueFromJsonMap.put("8", "Dangerous Goods");
                    break;
            }
        }
    }
}