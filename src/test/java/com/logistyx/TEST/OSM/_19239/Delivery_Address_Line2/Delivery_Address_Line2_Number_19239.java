package com.logistyx.TEST.OSM._19239.Delivery_Address_Line2;

import com.logistyx.pojo.osm.OSMPojo;
import com.logistyx.utilities.Environment;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.time.OffsetDateTime;
import java.util.*;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Delivery_Address_Line2_Number_19239 {

    public static String requestJsonBodyShipments;
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

    @ParameterizedTest
    @CsvFileSource(resources = "/Domestic.csv")
    public void test1(String ForwarderServiceCode) {


        requestJsonBodyShipments = "{\n" +
                "    \"ProjectCode\": \"LX_CHICAGO\",\n" +
                "    \"ForwarderDivisionCode\": \"OSM\",\n" +
                "    \"ForwarderServiceCode\": \"" + ForwarderServiceCode + "\",\n" +
                "    \"ShipperRef\": \"Shipper Reference\",\n" +
                "    \"ReceiverRef\": \"Receiver Reference\",\n" +
                "    \"Addresses\": [\n" +
                "        {\n" +
                "            \"Reference\": \"LOWE'S COMPANIES, INC.\",\n" +
                "            \"AddressLines\": [\n" +
                "                {\n" +
                "                    \"Index\": 1,\n" +
                "                    \"Value\": \"15 Main St\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"Index\": 2,\n" +
                "                    \"Value\": \"11\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"PostalCode\": \"62001\",\n" +
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
                "            \"GrossWeight\": 0.86,\n" +
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
        encodedStringFromPostmanShipments = osmPojoShipments.getDocuments().get(1).getContent();
        decodedBytesShipments = Base64.getDecoder().decode(encodedStringFromPostmanShipments);
        decodedStringShipments = new String(decodedBytesShipments);

        int shipmentIdFromShipmentsRequest = osmPojoShipments.getShipmentId();
        JSONObject objectShipmentIdFromShipmentsRequest = new JSONObject();
        JSONArray array = new JSONArray();
        objectShipmentIdFromShipmentsRequest.put("Shipments", array);
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("ShipmentId", shipmentIdFromShipmentsRequest);
        array.add(map);
        requestSpecConveyances = given().header("Shipper-Code", "LBI")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(objectShipmentIdFromShipmentsRequest);
        responseSpecConveyances = expect().statusCode(200)
                .and()
                .contentType(ContentType.JSON);
        validateResponseConveyances = given().spec(requestSpecConveyances)
                .when()
                .post(Environment.BASE_URL + "/conveyances/confirm")
                .then()
                .spec(responseSpecConveyances);
        osmPojoConveyances = validateResponseConveyances.extract().as(OSMPojo.class);
        encodedStringFromPostmanConveyances = osmPojoConveyances.getDocuments().get(0).getContent();
        decodedBytesConveyances = Base64.getDecoder().decode(encodedStringFromPostmanConveyances);
        decodedStringConveyances = new String(decodedBytesConveyances);

        String[] decodeArrDomestic = decodedStringConveyances.split("\r\n");
        decodeArrListDomestic = Arrays.asList(decodeArrDomestic);

        Object a = decodeArrListDomestic.get(0);
        decodedHeadersDomestic = new ArrayList<>();
        //    System.out.println("a = " + a);
        for (String s : a.toString().split("\",\"")) {
            decodedHeadersDomestic.add(s);
        }
        Object b = decodeArrListDomestic.get(1);
        decodedValuesDomestic = new ArrayList<>();
        //    System.out.println("b = " + b);
        for (String s : b.toString().split("\",\"")) {
            decodedValuesDomestic.add(s);
        }

        System.out.println("requestJsonBodyShipments = " + requestJsonBodyShipments);
        validateResponseShipments.extract().response().prettyPrint();

        if (osmPojoShipments.getDeliveryAddress().getAddressLines().size() == 2) {
            String address2FromJson = osmPojoShipments.getDeliveryAddress().getAddressLines().get(1).getValue();
            //    System.out.println("address2FromJson = " + address2FromJson);
            String address2FromEDI = decodedValuesDomestic.get(4);
            //    System.out.println("address2FromEDI = " + address2FromEDI);
            assertThat(address2FromEDI, is(equalTo("#" + address2FromJson)));
        }

    }
}
