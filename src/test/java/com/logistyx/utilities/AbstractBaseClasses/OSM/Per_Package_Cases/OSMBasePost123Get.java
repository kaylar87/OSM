package com.logistyx.utilities.AbstractBaseClasses.OSM.Per_Package_Cases;

import com.logistyx.pojo.osm.OSMPojo;
import com.logistyx.utilities.Environment;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.Base64;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;

public abstract class OSMBasePost123Get {

    public static String requestJsonBodyShipments;
    public static String requestJsonBodyShipments1;
    public static String requestJsonBodyShipments2;

    public static RequestSpecification requestSpecShipments;
    public static ResponseSpecification responseSpecShipments;
    public static ValidatableResponse validateResponseShipments;
    public static OSMPojo osmPojoShipments;
    public static String encodedStringFromPostmanShipments;
    public static String decodedStringShipments;
    public static byte[] decodedBytesShipments;
    public static double weightInKilos;
    public static double volumeInCubicMetre;
    public static String checkString;
    public static int checkDigit;

    public static RequestSpecification requestSpecConveyances;
    public static ResponseSpecification responseSpecConveyances;
    public static ValidatableResponse validateResponseConveyances;
    public static OSMPojo osmPojoConveyances;
    public static String encodedStringFromPostmanConveyances;
    public static String decodedStringConveyances;
    public static byte[] decodedBytesConveyances;

    public static String month;
    public static String day;
    public static int year;
    public static int century;
    public static int hour;
    public static String minute;
    public static String second;

    public static String currentDateTimeUTC;
    public static String monthUTC;
    public static String dayUTC;
    public static int yearUTC;
    public static int centuryUTC;
    public static int hourUTC;
    public static String minuteUTC;
    public static String secondUTC;

    public static String carrierServiceFromJson;
    public static Map<String, String> carrierServiceLValueFromJsonMap;
    public static Map<String, String> carrierServiceE1ValueFromJsonMap;
    public static Map<String, String> carrierServiceE2ValueFromJsonMap;
    public static Map<String, String> carrierServiceMCValueFromJsonMap;
    public static Map<String, String> carrierServiceSTCValueFromJsonMap;
    public static String date1;
    public static String currentDateTime;
    public static OffsetDateTime dateTimeUTC;

    public static String sortCode1;
    public static String sortCode2;
    public static String sortCode4;

    public static List decodeArrListDomestic;
    public static List<String> decodedValuesDomestic;
    public static List<String> decodedHeadersDomestic;


    public static RequestSpecification requestSpecShipments1;
    public static ResponseSpecification responseSpecShipments1;
    public static ValidatableResponse validateResponseShipments1;
    public static RequestSpecification requestSpecShipments2;
    public static ResponseSpecification responseSpecShipments2;
    public static ValidatableResponse validateResponseShipments2;
    public static RequestSpecification requestSpecShipmentsPOST;
    public static ResponseSpecification responseSpecShipmentsPOST;
    public static ValidatableResponse validateResponseShipmentsPOST;
    public static int shipmentIdFromShipmentsRequest;


    @DisplayName("POST")
    @Test
    public static void shipmentsLabel() {


        requestJsonBodyShipments = "{\n" +
                "    \"ProjectCode\": \"LX_CHICAGO\",\n" +
                "    \"ForwarderDivisionCode\": \"OSM\",\n" +
                "    \"ForwarderServiceCode\": \"OSM-PRIORITY-MAIL\",\n" +
                "    \"ShipperRef\": \"Shipper Reference\",\n" +
                "    \"ReceiverRef\": \"Receiver Reference\",\n" +
                "    \"Addresses\": [\n" +
                "        {\n" +
                "            \"Reference\": \"LOWE'S COMPANIES, INC.\",\n" +
                "            \"AddressLines\": [\n" +
                "                {\n" +
                "                    \"Index\": 1,\n" +
                "                    \"Value\": \"15 Main St\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"PostalCode\": \"53534\",\n" +
                "            \"LocalityName\": \"Edgerton\",\n" +
                "            \"SubdivisionCode\": \"WI\",\n" +
                "            \"SubdivisionName\": \"Wisconsin\",\n" +
                "            \"CountryCode\": \"US\",\n" +
                "            \"Contacts\": [\n" +
                "                {\n" +
                "                    \"Name\": \"LOWE'S COMPANIES, INC.\",\n" +
                "                    \"EmailAddress\": \"\",\n" +
                "                    \"PhoneNumber\": \"555-555-5555\"\n" +
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
                "            \"ShippingUnitItems\": [\n" +
                "                {\n" +
                "                    \"ForwarderRef\": 9999999999,\n" +
                "                    \"Value\": 1.0,\n" +
                "                    \"ValueCurrencyCode\": \"USD\",\n" +
                "                    \"Quantity\": 2,\n" +
                "                    \"QuantityUnitOfMeasure\": \"PCS\",\n" +
                "                    \"Weight\": 1.33,\n" +
                "                    \"WeightUnitOfMeasure\": \"LB\",\n" +
                "                    \"Description\": \"COLD WEATHER KIT A/C HSB\",\n" +
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
        encodedStringFromPostmanShipments = osmPojoShipments.getDocuments().get(0).getContent();
        decodedBytesShipments = Base64.getDecoder().decode(encodedStringFromPostmanShipments);
        decodedStringShipments = new String(decodedBytesShipments);
        shipmentIdFromShipmentsRequest = osmPojoShipments.getShipmentId();

        requestJsonBodyShipments1 = "{\n" +
                "    \"ShipperRef\": \"3.6-72K-3X22\",\n" +
                "    \"Value\": 2,\n" +
                "    \"GrossWeight\": 3.6,\n" +
                "    \"GrossWeightUnitOfMeasure\": \"KGM\",\n" +
                "    \"Volume\": 72000,\n" +
                "    \"VolumeUnitOfMeasure\": \"CMQ\",\n" +
                "    \"PackageType\": \"CT\",\n" +
                "    \"Length\": \"22\",\n" +
                "    \"Width\": \"22\",\n" +
                "    \"Height\": \"22\",\n" +
                "    \"DimensionsUnitOfMeasure\": \"CMT\"\n" +
                "}";
        requestSpecShipments1 = given().header("Shipper-Code", "LBI")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(requestJsonBodyShipments1);
        responseSpecShipments1 = expect().statusCode(200)
                .and()
                .contentType(ContentType.JSON);
        validateResponseShipments1 = given().spec(requestSpecShipments1)
                .when()
                .post(Environment.BASE_URL + "/shipments/" + shipmentIdFromShipmentsRequest + "/shippingunits/Label/")
                .then()
                .spec(responseSpecShipments1);

        requestJsonBodyShipments2 = "{\n" +
                "    \"ShipperRef\": \"6.4-88K-3X33\",\n" +
                "    \"Value\": 2,\n" +
                "    \"GrossWeight\": 6.4,\n" +
                "    \"GrossWeightUnitOfMeasure\": \"KGM\",\n" +
                "    \"Volume\": 88000,\n" +
                "    \"VolumeUnitOfMeasure\": \"CMQ\",\n" +
                "    \"PackageType\": \"CT\",\n" +
                "    \"Length\": \"33\",\n" +
                "    \"Width\": \"33\",\n" +
                "    \"Height\": \"33\",\n" +
                "    \"DimensionsUnitOfMeasure\": \"CMT\"\n" +
                "}";
        requestSpecShipments2 = given().header("Shipper-Code", "LBI")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(requestJsonBodyShipments2);
        responseSpecShipments2 = expect().statusCode(200)
                .and()
                .contentType(ContentType.JSON);
        validateResponseShipments2 = given().spec(requestSpecShipments2)
                .when()
                .post(Environment.BASE_URL + "/shipments/" + shipmentIdFromShipmentsRequest + "/shippingunits/Label/")
                .then()
                .spec(responseSpecShipments2);


        requestSpecShipmentsPOST = given().header("Shipper-Code", "LBI")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON);
        responseSpecShipmentsPOST = expect().statusCode(200)
                .and()
                .contentType(ContentType.JSON);
        validateResponseShipmentsPOST = given().spec(requestSpecShipmentsPOST)
                .when()
                .get(Environment.BASE_URL + "/shipments/" + shipmentIdFromShipmentsRequest + "/confirm/")
                .then()
                .spec(responseSpecShipmentsPOST);

    }
}
