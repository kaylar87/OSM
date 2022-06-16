package com.logistyx.TEST.OSM._19239.CN22;


import com.logistyx.utilities.AbstractBaseClasses.OSM._19239.OSMBasePriorityMailNotDG_APO_CN22_19239;
import com.logistyx.utilities.AbstractBaseClasses.OSM._19239.OSMBaseStandardMailMarketingParcelNotDG_APO_CN22_19239;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Standard_Mail_Marketing_Parcel_APO_CN22_19239 extends OSMBaseStandardMailMarketingParcelNotDG_APO_CN22_19239 {

    static {

        OSMBaseStandardMailMarketingParcelNotDG_APO_CN22_19239.shipmentsLabel();

    }


    @DisplayName("ShippingId is not NULL")
    @Test
    public void test1() {


        assertThat(osmPojoShipments.getShipmentId(), is(notNullValue()));
        System.out.println("decodedStringShipmentsCN22 = " + decodedStringShipmentsCN22);
    }


    @DisplayName("ZPL Label is not NULL")
    @Test
    public void test2() {

        assertThat(encodedStringFromPostmanShipments, is(notNullValue()));

    }


    @DisplayName("ZPL Label size > 500 characters")
    @Test
    public void test3() {

        assertThat(encodedStringFromPostmanShipments.length(), is(greaterThan(500)));

    }


    @DisplayName("ZPL CN22 is not NULL")
    @Test
    public void test4() {

        assertThat(encodedStringFromPostmanShipmentsCN22, is(notNullValue()));

    }


    @DisplayName("ZPL CN22 size > 500 characters")
    @Test
    public void test5() {

        assertThat(encodedStringFromPostmanShipmentsCN22.length(), is(greaterThan(500)));

    }


    @DisplayName("ZPL CN22 Carrier service A - 'US Postal Service'")
    @Test
    public void test6() {

        String carrierServiceAHardcoded = "US Postal Service";
        //    System.out.println("carrierServiceAHardcoded = " + carrierServiceAHardcoded);
        int carrierServiceAFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT97,601^A0B,22,27^FD") + 22;
        String carrierServiceAFromLabel = decodedStringShipmentsCN22.substring(carrierServiceAFromLabelStart, carrierServiceAFromLabelStart + carrierServiceAHardcoded.length());
        //    System.out.println("carrierServiceAFromLabel = " + carrierServiceAFromLabel);
        assertThat(carrierServiceAHardcoded, is(equalTo(carrierServiceAFromLabel)));

    }


    @DisplayName("ZPL CN22 Carrier service B - '02/01/2022'")
    @Test
    public void test7() {

        String carrierServiceBFromJsonConverted = osmPojoShipments.getRequestedPickupDateTime().substring(5, 7) + "/" + osmPojoShipments.getRequestedPickupDateTime().substring(8, 10) + "/" + osmPojoShipments.getRequestedPickupDateTime().substring(0, 4);
        //    System.out.println("carrierServiceBFromJsonConverted = " + carrierServiceBFromJsonConverted);
        int carrierServiceBFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT97,297^A0B,22,27^FD") + 22;
        String carrierServiceBFromLabel = decodedStringShipmentsCN22.substring(carrierServiceBFromLabelStart, carrierServiceBFromLabelStart + carrierServiceBFromJsonConverted.length());
        //    System.out.println("carrierServiceBFromLabel = " + carrierServiceBFromLabel);
        assertThat(carrierServiceBFromJsonConverted, is(equalTo(carrierServiceBFromLabel)));

    }


    @DisplayName("ZPL CN22 Carrier service C - 'Something'")
    @Test
    public void test8() {

        if (requestJsonBodyShipments.contains("CATEGORY_OF_GOODS")) {
            String carrierServiceCFromJsonConverted = categoryOfGoodsValueFromJsonMap.get(categoryOfGoodsFromJson);
            //    System.out.println("carrierServiceCFromJsonConverted = " + carrierServiceCFromJsonConverted);
            int carrierServiceCFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT157,601^A0B,22,27^FD") + 23;
            String carrierServiceCFromLabel = decodedStringShipmentsCN22.substring(carrierServiceCFromLabelStart, carrierServiceCFromLabelStart + carrierServiceCFromJsonConverted.length());
            //   System.out.println("carrierServiceCFromLabel = " + carrierServiceCFromLabel);
            assertThat(carrierServiceCFromLabel, is(equalTo(carrierServiceCFromJsonConverted)));
        } else {
            String carrierServiceCHardcoded = "Merchandise";
            //    System.out.println("carrierServiceCHardcoded = " + carrierServiceCHardcoded);
            int carrierServiceCFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT157,601^A0B,22,27^FD") + 23;
            String carrierServiceCFromLabel = decodedStringShipmentsCN22.substring(carrierServiceCFromLabelStart, carrierServiceCFromLabelStart + carrierServiceCHardcoded.length());
            //    System.out.println("carrierServiceCFromLabel = " + carrierServiceCFromLabel);
            assertThat(carrierServiceCFromLabel, is(equalTo(carrierServiceCHardcoded)));
        }
    }


    @DisplayName("ZPL CN22 Carrier service D - 'COLD KIT, WARM KIT'")
    @Test
    public void test9() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        //    System.out.println("numberOfSUIFromJson = " + numberOfSUIFromJson);
        ArrayList<String> carrierServiceDFromJsonArray = new ArrayList<>();
        for (int i = 0; i < numberOfSUIFromJson; i++) {
            carrierServiceDFromJsonArray.add(osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(i).getDescription());
        }
        String carrierServiceDFromJsonConverted = carrierServiceDFromJsonArray.toString().replace("[", "").replace("]", "");
        //    System.out.println("carrierServiceDFromJsonConverted = " + carrierServiceDFromJsonConverted);
        int carrierServiceDFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT273,601^A0B,22,24^FD") + 23;
        String carrierServiceDFromLabel = decodedStringShipmentsCN22.substring(carrierServiceDFromLabelStart, carrierServiceDFromLabelStart + carrierServiceDFromJsonConverted.length());
        //    System.out.println("carrierServiceDFromLabel = " + carrierServiceDFromLabel);
        assertThat(carrierServiceDFromJsonConverted, is(equalTo(carrierServiceDFromLabel)));

    }


    @DisplayName("ZPL CN22 Carrier service E - '2', '3'")
    @Test
    public void test10() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        if (numberOfSUIFromJson == 1) {
            String carrierServiceEFromJson = String.valueOf(osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getQuantity());
            //    System.out.println("carrierServiceEFromJson = " + carrierServiceEFromJson);
            int carrierServiceEFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT447,569^A0B,16,16^FD") + 23;
            String carrierServiceEFromLabel = decodedStringShipmentsCN22.substring(carrierServiceEFromLabelStart, carrierServiceEFromLabelStart + carrierServiceEFromJson.length());
            //    System.out.println("carrierServiceEFromLabel = " + carrierServiceEFromLabel);
            assertThat(carrierServiceEFromJson, is(equalTo(carrierServiceEFromLabel)));
        } else if (numberOfSUIFromJson == 2) {
            String carrierServiceEFromJson1 = String.valueOf(osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getQuantity());
            //    System.out.println("carrierServiceEFromJson1 = " + carrierServiceEFromJson1);
            int carrierServiceEFromLabelStart1 = decodedStringShipmentsCN22.indexOf("^FT447,569^A0B,16,16^FD") + 23;
            String carrierServiceEFromLabel1 = decodedStringShipmentsCN22.substring(carrierServiceEFromLabelStart1, carrierServiceEFromLabelStart1 + carrierServiceEFromJson1.length());
            //    System.out.println("carrierServiceEFromLabel1 = " + carrierServiceEFromLabel1);
            assertThat(carrierServiceEFromJson1, is(equalTo(carrierServiceEFromLabel1)));

            String carrierServiceEFromJson2 = String.valueOf(osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(1).getQuantity());
            //    System.out.println("carrierServiceEFromJson2 = " + carrierServiceEFromJson2);
            int carrierServiceEFromLabelStart2 = decodedStringShipmentsCN22.indexOf("^FT469,569^A0B,16,16^FD") + 23;
            String carrierServiceEFromLabel2 = decodedStringShipmentsCN22.substring(carrierServiceEFromLabelStart2, carrierServiceEFromLabelStart2 + carrierServiceEFromJson2.length());
            //    System.out.println("carrierServiceEFromLabel2 = " + carrierServiceEFromLabel2);
            assertThat(carrierServiceEFromJson2, is(equalTo(carrierServiceEFromLabel2)));
        }
    }


    @DisplayName("ZPL CN22 Carrier service F - '9', '1'")
    @Test
    public void test11() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        if (numberOfSUIFromJson == 1) {
            float carrierServiceFFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getWeight();
            int carrierServiceFFromJsonConverted = (int) carrierServiceFFromJson;
            //    System.out.println("carrierServiceFFromJson = " + carrierServiceFFromJson);
            //    System.out.println("carrierServiceFFromJsonConverted = " + carrierServiceFFromJsonConverted);
            int carrierServiceFFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT447,495^A0B,16,16^FD") + 23;
            String carrierServiceFFromLabel = decodedStringShipmentsCN22.substring(carrierServiceFFromLabelStart, carrierServiceFFromLabelStart + String.valueOf(carrierServiceFFromJsonConverted).length());
            //    System.out.println("carrierServiceFFromLabel = " + carrierServiceFFromLabel);
            assertThat(String.valueOf(carrierServiceFFromJsonConverted), is(equalTo(carrierServiceFFromLabel)));
        } else if (numberOfSUIFromJson == 2) {
            float carrierServiceFFromJson1 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getWeight();
            int carrierServiceFFromJsonConverted1 = (int) carrierServiceFFromJson1;
            //    System.out.println("carrierServiceFFromJson1 = " + carrierServiceFFromJson1);
            //    System.out.println("carrierServiceFFromJsonConverted1 = " + carrierServiceFFromJsonConverted1);
            int carrierServiceFFromLabelStart1 = decodedStringShipmentsCN22.indexOf("^FT447,495^A0B,16,16^FD") + 23;
            String carrierServiceFFromLabel1 = decodedStringShipmentsCN22.substring(carrierServiceFFromLabelStart1, carrierServiceFFromLabelStart1 + String.valueOf(carrierServiceFFromJsonConverted1).length());
            //    System.out.println("carrierServiceFFromLabel1 = " + carrierServiceFFromLabel1);
            assertThat(String.valueOf(carrierServiceFFromJsonConverted1), is(equalTo(carrierServiceFFromLabel1)));

            float carrierServiceFFromJson2 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(1).getWeight();
            int carrierServiceFFromJsonConverted2 = (int) carrierServiceFFromJson2;
            //    System.out.println("carrierServiceFFromJson2 = " + carrierServiceFFromJson2);
            //    System.out.println("carrierServiceFFromJsonConverted2 = " + carrierServiceFFromJsonConverted2);
            int carrierServiceFFromLabelStart2 = decodedStringShipmentsCN22.indexOf("^FT469,495^A0B,16,16^FD") + 23;
            String carrierServiceFFromLabel2 = decodedStringShipmentsCN22.substring(carrierServiceFFromLabelStart2, carrierServiceFFromLabelStart2 + String.valueOf(carrierServiceFFromJsonConverted2).length());
            //    System.out.println("carrierServiceFFromLabel2 = " + carrierServiceFFromLabel2);
            assertThat(String.valueOf(carrierServiceFFromJsonConverted2), is(equalTo(carrierServiceFFromLabel2)));
        }
    }


    @DisplayName("ZPL CN22 Carrier service G - '14', '5'")
    @Test
    public void test12() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        if (numberOfSUIFromJson == 1) {
            float carrierServiceGFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getWeight();
            int carrierServiceGFromJsonLb = (int) carrierServiceGFromJson;
            int carrierServiceGFromJsonConverted = Math.round((carrierServiceGFromJson - carrierServiceGFromJsonLb) * 16);
            //    System.out.println("carrierServiceGFromJson = " + carrierServiceGFromJson);
            //    System.out.println("carrierServiceGFromJsonConverted = " + carrierServiceGFromJsonConverted);
            int carrierServiceGFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT447,442^A0B,16,16^FD") + 23;
            String carrierServiceGFromLabel = decodedStringShipmentsCN22.substring(carrierServiceGFromLabelStart, carrierServiceGFromLabelStart + String.valueOf(carrierServiceGFromJsonConverted).length());
            //    System.out.println("carrierServiceGFromLabel = " + carrierServiceGFromLabel);
            assertThat(String.valueOf(carrierServiceGFromJsonConverted), is(equalTo(carrierServiceGFromLabel)));
        } else if (numberOfSUIFromJson == 2) {
            float carrierServiceGFromJson1 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getWeight();
            int carrierServiceGFromJsonLb1 = (int) carrierServiceGFromJson1;
            int carrierServiceGFromJsonConverted1 = Math.round((carrierServiceGFromJson1 - carrierServiceGFromJsonLb1) * 16);
            //    System.out.println("carrierServiceGFromJson1 = " + carrierServiceGFromJson1);
            //    System.out.println("carrierServiceGFromJsonConverted1 = " + carrierServiceGFromJsonConverted1);
            int carrierServiceGFromLabelStart1 = decodedStringShipmentsCN22.indexOf("^FT447,442^A0B,16,16^FD") + 23;
            String carrierServiceGFromLabel1 = decodedStringShipmentsCN22.substring(carrierServiceGFromLabelStart1, carrierServiceGFromLabelStart1 + String.valueOf(carrierServiceGFromJsonConverted1).length());
            //    System.out.println("carrierServiceGFromLabel1 = " + carrierServiceGFromLabel1);
            assertThat(String.valueOf(carrierServiceGFromJsonConverted1), is(equalTo(carrierServiceGFromLabel1)));

            float carrierServiceGFromJson2 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(1).getWeight();
            int carrierServiceGFromJsonLb2 = (int) carrierServiceGFromJson2;
            int carrierServiceGFromJsonConverted2 = Math.round((carrierServiceGFromJson2 - carrierServiceGFromJsonLb2) * 16);
            //    System.out.println("carrierServiceGFromJson2 = " + carrierServiceGFromJson2);
            //    System.out.println("carrierServiceGFromJsonConverted2 = " + carrierServiceGFromJsonConverted2);
            int carrierServiceGFromLabelStart2 = decodedStringShipmentsCN22.indexOf("^FT469,438^A0B,16,16^FD") + 23;
            String carrierServiceGFromLabel2 = decodedStringShipmentsCN22.substring(carrierServiceGFromLabelStart2, carrierServiceGFromLabelStart2 + String.valueOf(carrierServiceGFromJsonConverted2).length());
            //    System.out.println("carrierServiceGFromLabel2 = " + carrierServiceGFromLabel2);
            assertThat(String.valueOf(carrierServiceGFromJsonConverted2), is(equalTo(carrierServiceGFromLabel2)));
        }
    }


    @DisplayName("ZPL CN22 Carrier service H - '1.55', '1.00'")
    @Test
    public void test13() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        if (numberOfSUIFromJson == 1) {
            float carrierServiceHFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getValue();
            //    System.out.println("carrierServiceHFromJson = " + carrierServiceHFromJson);
            int carrierServiceHFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT447,368^A0B,16,16^FD") + 23;
            String carrierServiceHFromLabel = decodedStringShipmentsCN22.substring(carrierServiceHFromLabelStart, carrierServiceHFromLabelStart + String.valueOf(carrierServiceHFromJson).length());
            //    System.out.println("carrierServiceHFromLabel = " + carrierServiceHFromLabel);
            assertThat(String.valueOf(carrierServiceHFromJson), is(equalTo(carrierServiceHFromLabel)));
        } else if (numberOfSUIFromJson == 2) {
            float carrierServiceHFromJson1 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getValue();
            //    System.out.println("carrierServiceHFromJson1 = " + carrierServiceHFromJson1);
            int carrierServiceHFromLabelStart1 = decodedStringShipmentsCN22.indexOf("^FT447,368^A0B,16,16^FD") + 23;
            String carrierServiceHFromLabel1 = decodedStringShipmentsCN22.substring(carrierServiceHFromLabelStart1, carrierServiceHFromLabelStart1 + String.valueOf(carrierServiceHFromJson1).length());
            //    System.out.println("carrierServiceHFromLabel1 = " + carrierServiceHFromLabel1);
            assertThat(String.valueOf(carrierServiceHFromJson1), is(equalTo(carrierServiceHFromLabel1)));

            float carrierServiceHFromJson2 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(1).getValue();
            //    System.out.println("carrierServiceHFromJson2 = " + carrierServiceHFromJson2);
            int carrierServiceHFromLabelStart2 = decodedStringShipmentsCN22.indexOf("^FT469,368^A0B,16,16^FD") + 23;
            String carrierServiceHFromLabel2 = decodedStringShipmentsCN22.substring(carrierServiceHFromLabelStart2, carrierServiceHFromLabelStart2 + String.valueOf(carrierServiceHFromJson2).length());
            //    System.out.println("carrierServiceHFromLabel2 = " + carrierServiceHFromLabel2);
            assertThat(String.valueOf(carrierServiceHFromJson2), is(equalTo(carrierServiceHFromLabel2)));
        }
    }


    @DisplayName("ZPL CN22 Carrier service I - '8516808000', '8516808000'")
    @Test
    public void test14() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        if (numberOfSUIFromJson == 1) {
            String carrierServiceIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getHarmonisedSystemCode();
            //    System.out.println("carrierServiceIFromJson = " + carrierServiceIFromJson);
            int carrierServiceIFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT447,280^A0B,16,16^FD") + 23;
            String carrierServiceIFromLabel = decodedStringShipmentsCN22.substring(carrierServiceIFromLabelStart, carrierServiceIFromLabelStart + String.valueOf(carrierServiceIFromJson).length());
            //    System.out.println("carrierServiceIFromLabel = " + carrierServiceIFromLabel);
            assertThat(String.valueOf(carrierServiceIFromJson), is(equalTo(carrierServiceIFromLabel)));
        } else if (numberOfSUIFromJson == 2) {
            String carrierServiceIFromJson1 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getHarmonisedSystemCode();
            //    System.out.println("carrierServiceIFromJson1 = " + carrierServiceIFromJson1);
            int carrierServiceIFromLabelStart1 = decodedStringShipmentsCN22.indexOf("^FT447,280^A0B,16,16^FD") + 23;
            String carrierServiceIFromLabel1 = decodedStringShipmentsCN22.substring(carrierServiceIFromLabelStart1, carrierServiceIFromLabelStart1 + String.valueOf(carrierServiceIFromJson1).length());
            //    System.out.println("carrierServiceIFromLabel1 = " + carrierServiceIFromLabel1);
            assertThat(String.valueOf(carrierServiceIFromJson1), is(equalTo(carrierServiceIFromLabel1)));

            String carrierServiceIFromJson2 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(1).getHarmonisedSystemCode();
            //    System.out.println("carrierServiceIFromJson2 = " + carrierServiceIFromJson2);
            int carrierServiceIFromLabelStart2 = decodedStringShipmentsCN22.indexOf("^FT469,280^A0B,16,16^FD") + 23;
            String carrierServiceIFromLabel2 = decodedStringShipmentsCN22.substring(carrierServiceIFromLabelStart2, carrierServiceIFromLabelStart2 + String.valueOf(carrierServiceIFromJson2).length());
            //    System.out.println("carrierServiceIFromLabel2 = " + carrierServiceIFromLabel2);
            assertThat(String.valueOf(carrierServiceIFromJson2), is(equalTo(carrierServiceIFromLabel2)));
        }
    }


    @DisplayName("ZPL CN22 Carrier service J - 'US', 'US'")
    @Test
    public void test15() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        if (numberOfSUIFromJson == 1) {
            String carrierServiceJFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getCountryOfOrigin();
            //    System.out.println("carrierServiceJFromJson = " + carrierServiceJFromJson);
            int carrierServiceJFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT447,50^A0B,16,16^FD") + 22;
            String carrierServiceJFromLabel = decodedStringShipmentsCN22.substring(carrierServiceJFromLabelStart, carrierServiceJFromLabelStart + String.valueOf(carrierServiceJFromJson).length());
            //    System.out.println("carrierServiceJFromLabel = " + carrierServiceJFromLabel);
            assertThat(String.valueOf(carrierServiceJFromJson), is(equalTo(carrierServiceJFromLabel)));
        } else if (numberOfSUIFromJson == 2) {
            String carrierServiceJFromJson1 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getCountryOfOrigin();
            //    System.out.println("carrierServiceJFromJson1 = " + carrierServiceJFromJson1);
            int carrierServiceJFromLabelStart1 = decodedStringShipmentsCN22.indexOf("^FT447,50^A0B,16,16^FD") + 22;
            String carrierServiceJFromLabel1 = decodedStringShipmentsCN22.substring(carrierServiceJFromLabelStart1, carrierServiceJFromLabelStart1 + String.valueOf(carrierServiceJFromJson1).length());
            //    System.out.println("carrierServiceJFromLabel1 = " + carrierServiceJFromLabel1);
            assertThat(String.valueOf(carrierServiceJFromJson1), is(equalTo(carrierServiceJFromLabel1)));

            String carrierServiceJFromJson2 = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(1).getCountryOfOrigin();
            //    System.out.println("carrierServiceJFromJson2 = " + carrierServiceJFromJson2);
            int carrierServiceJFromLabelStart2 = decodedStringShipmentsCN22.indexOf("^FT469,50^A0B,16,16^FD") + 22;
            String carrierServiceJFromLabel2 = decodedStringShipmentsCN22.substring(carrierServiceJFromLabelStart2, carrierServiceJFromLabelStart2 + String.valueOf(carrierServiceJFromJson2).length());
            //    System.out.println("carrierServiceJFromLabel2 = " + carrierServiceJFromLabel2);
            assertThat(String.valueOf(carrierServiceJFromJson2), is(equalTo(carrierServiceJFromLabel2)));
        }
    }


    @DisplayName("ZPL CN22 Carrier service K - '11'")
    @Test
    public void test16() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        //    System.out.println("numberOfSUIFromJson = " + numberOfSUIFromJson);
        float carrierServiceKFromJson = 0.00f;
        for (int i = 0; i < numberOfSUIFromJson; i++) {
            carrierServiceKFromJson += osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(i).getWeight();
        }
        //    System.out.println("carrierServiceKFromJson = " + carrierServiceKFromJson);
        int carrierServiceKFromJsonConverted = (int) carrierServiceKFromJson;
        //    System.out.println("carrierServiceKFromJsonConverted = " + carrierServiceKFromJsonConverted);
        int carrierServiceKFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT587,502^A0B,22,22^FD") + 23;
        String carrierServiceKFromLabel = decodedStringShipmentsCN22.substring(carrierServiceKFromLabelStart, carrierServiceKFromLabelStart + String.valueOf(carrierServiceKFromJsonConverted).length());
        //    System.out.println("carrierServiceKFromLabel = " + carrierServiceKFromLabel);
        assertThat(String.valueOf(carrierServiceKFromJsonConverted), is(equalTo(carrierServiceKFromLabel)));
    }


    @DisplayName("ZPL CN22 Carrier service L - '3'")
    @Test
    public void test17() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        //    System.out.println("numberOfSUIFromJson = " + numberOfSUIFromJson);
        float carrierServiceLFromJson = 0.00f;
        for (int i = 0; i < numberOfSUIFromJson; i++) {
            carrierServiceLFromJson += osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(i).getWeight();
        }
        //    System.out.println("carrierServiceLFromJson = " + carrierServiceLFromJson);
        int carrierServiceLFromJsonLb = (int) carrierServiceLFromJson;
        int carrierServiceLFromJsonConverted = Math.round((carrierServiceLFromJson - carrierServiceLFromJsonLb) * 16);
        //    System.out.println("carrierServiceLFromJsonConverted = " + carrierServiceLFromJsonConverted);
        int carrierServiceLFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT587,440^A0B,22,22^FD") + 23;
        String carrierServiceLFromLabel = decodedStringShipmentsCN22.substring(carrierServiceLFromLabelStart, carrierServiceLFromLabelStart + String.valueOf(carrierServiceLFromJsonConverted).length());
        //    System.out.println("carrierServiceLFromLabel = " + carrierServiceLFromLabel);
        assertThat(String.valueOf(carrierServiceLFromJsonConverted), is(equalTo(carrierServiceLFromLabel)));

    }


    @DisplayName("ZPL CN22 Carrier service M - '2.55'")
    @Test
    public void test18() {

        int numberOfSUIFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size();
        //    System.out.println("numberOfSUIFromJson = " + numberOfSUIFromJson);
        float carrierServiceMFromJson = 0.00f;
        for (int i = 0; i < numberOfSUIFromJson; i++) {
            carrierServiceMFromJson += osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(i).getValue();
        }
        //    System.out.println("carrierServiceMFromJson = " + carrierServiceMFromJson);
        int carrierServiceMFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT587,373^A0B,22,22^FD") + 23;
        String carrierServiceMFromLabel = decodedStringShipmentsCN22.substring(carrierServiceMFromLabelStart, carrierServiceMFromLabelStart + String.valueOf(carrierServiceMFromJson).length());
        //    System.out.println("carrierServiceMFromLabel = " + carrierServiceMFromLabel);
        assertThat(String.valueOf(carrierServiceMFromJson), is(equalTo(carrierServiceMFromLabel)));
    }


    @DisplayName("ZPL CN22 Carrier service N - '02/01/2022'")
    @Test
    public void test19() {

        String carrierServiceNFromJsonConverted = osmPojoShipments.getRequestedPickupDateTime().substring(5, 7) + "/" + osmPojoShipments.getRequestedPickupDateTime().substring(8, 10) + "/" + osmPojoShipments.getRequestedPickupDateTime().substring(0, 4);
        //    System.out.println("carrierServiceNFromJsonConverted = " + carrierServiceNFromJsonConverted);
        int carrierServiceNFromLabelStart = decodedStringShipmentsCN22.indexOf("^FT783,302^A0B,22,27^FD") + 23;
        String carrierServiceNFromLabel = decodedStringShipmentsCN22.substring(carrierServiceNFromLabelStart, carrierServiceNFromLabelStart + carrierServiceNFromJsonConverted.length());
        //    System.out.println("carrierServiceNFromLabel = " + carrierServiceNFromLabel);
        assertThat(carrierServiceNFromJsonConverted, is(equalTo(carrierServiceNFromLabel)));

    }


    @DisplayName("JSON Body Request")
    @Test
    public void test45() {
        System.out.println("requestJsonBodyShipments = " + requestJsonBodyShipments);

    }


    @DisplayName("JSON Body Response")
    @Test
    public void test46() {
        validateResponseShipments.extract().response().prettyPrint();

    }
}
