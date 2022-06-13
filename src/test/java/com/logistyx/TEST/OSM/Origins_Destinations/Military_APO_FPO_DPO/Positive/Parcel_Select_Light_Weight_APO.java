package com.logistyx.TEST.OSM.Origins_Destinations.Military_APO_FPO_DPO.Positive;


import com.logistyx.utilities.AbstractBaseClasses.OSM.Origins_Destinations.Military_APO_FPO_DPO.Positive.OSMBaseParcelSelectLightWeightNotDGAPO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Parcel_Select_Light_Weight_APO extends OSMBaseParcelSelectLightWeightNotDGAPO {

    static {

        OSMBaseParcelSelectLightWeightNotDGAPO.shipmentsLabel();

    }


    @DisplayName("ShippingId is not NULL")
    @Test
    public void test1() {


        assertThat(osmPojoShipments.getShipmentId(), is(notNullValue()));

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


    @DisplayName("ZPL Carrier service A - 'ZZ'")
    @Test
    public void test4() {

        //    System.out.println("sortCode1 = " + sortCode1);
        int carrierServiceAFromLabelStart = decodedStringShipments.indexOf("^FT76,73^A0N,43,74^FD") + 21;
        String carrierServiceAFromLabel = decodedStringShipments.substring(carrierServiceAFromLabelStart, carrierServiceAFromLabelStart + sortCode1.length());
        //    System.out.println("carrierServiceAFromLabel = " + carrierServiceAFromLabel);
        assertThat(sortCode1, is(equalTo(carrierServiceAFromLabel)));

    }


    @DisplayName("ZPL Carrier service B - '03'")
    @Test
    public void test5() {

        //    System.out.println("sortCode2 = " + sortCode2);
        int sc2int = (int) Double.parseDouble(sortCode2);
        String sc2 = "0" + sc2int;
        //    System.out.println("sc2 = " + sc2);
        int carrierServiceBFromLabelStart = decodedStringShipments.indexOf("^FT235,73^A0N,43,74^FD") + 22;
        String carrierServiceBFromLabel = decodedStringShipments.substring(carrierServiceBFromLabelStart, carrierServiceBFromLabelStart + String.valueOf(sc2).length());
        //    System.out.println("carrierServiceBFromLabel = " + carrierServiceBFromLabel);
        assertThat(sc2, is(equalTo(carrierServiceBFromLabel)));

    }


    @DisplayName("ZPL Carrier service C - 'LW'")
    @Test
    public void test6() {

        String carrierServiceCFromJsonConverted = carrierServiceMCValueFromJsonMap.get(carrierServiceFromJson);
        //    System.out.println("carrierServiceCFromJsonConverted = " + carrierServiceCFromJsonConverted);
        int carrierServiceCFromLabelStart = decodedStringShipments.indexOf("^FT76,115^A0N,33,59^FD") + 22;
        String carrierServiceCFromLabel = decodedStringShipments.substring(carrierServiceCFromLabelStart, carrierServiceCFromLabelStart + carrierServiceCFromJsonConverted.length());
        //    System.out.println("carrierServiceCFromLabel = " + carrierServiceCFromLabel);
        assertThat(carrierServiceCFromJsonConverted, is(equalTo(carrierServiceCFromLabel)));

    }


    @DisplayName("ZPL Carrier service D - 'V23'")
    @Test
    public void test7() {

        //    System.out.println("sortCode4 = " + sortCode4);
        int carrierServiceDFromLabelStart = decodedStringShipments.indexOf("^FT227,115^A0N,33,59^FD") + 23;
        String carrierServiceDFromLabel = decodedStringShipments.substring(carrierServiceDFromLabelStart, carrierServiceDFromLabelStart + sortCode4.length());
        //    System.out.println("carrierServiceDFromLabel = " + carrierServiceDFromLabel);
        assertThat(sortCode4, is(equalTo(carrierServiceDFromLabel)));

    }


    @DisplayName("ZPL Carrier service E1 - 'PS LIGHTWEIGHT'")
    @Test
    public void test8() {

        String carrierServiceE1FromJsonConverted = carrierServiceE1ValueFromJsonMap.get(carrierServiceFromJson);
        //    System.out.println("carrierServiceE1FromJsonConverted = " + carrierServiceE1FromJsonConverted);
        int carrierServiceE1FromLabelStart = decodedStringShipments.indexOf("^FT437,65^A0N,27,27^FD") + 22;
        String carrierServiceE1FromLabel = decodedStringShipments.substring(carrierServiceE1FromLabelStart, carrierServiceE1FromLabelStart + carrierServiceE1FromJsonConverted.length());
        //    System.out.println("carrierServiceE1FromLabel = " + carrierServiceE1FromLabel);
        assertThat(carrierServiceE1FromJsonConverted, is(equalTo(carrierServiceE1FromLabel)));

    }


    @DisplayName("ZPL Carrier service E2 - 'U.S POSTAGE AND FEES PAID'")
    @Test
    public void test9() {

        String carrierServiceE2FromJsonConverted = carrierServiceE2ValueFromJsonMap.get(carrierServiceFromJson);
        //    System.out.println("carrierServiceE2FromJsonConverted = " + carrierServiceE2FromJsonConverted);
        int carrierServiceE2FromLabelStart = decodedStringShipments.indexOf("^FT437,97^A0N,27,27^FD") + 22;
        String carrierServiceE2FromLabel = decodedStringShipments.substring(carrierServiceE2FromLabelStart, carrierServiceE2FromLabelStart + carrierServiceE2FromJsonConverted.length());
        //    System.out.println("carrierServiceE2FromLabel = " + carrierServiceE2FromLabel);
        assertThat(carrierServiceE2FromJsonConverted, is(equalTo(carrierServiceE2FromLabel)));

    }


    @DisplayName("ZPL Carrier service E3 - 'OSM'")
    @Test
    public void test10() {

        String carrierServiceE3Hardcoded = "OSM";
        //    System.out.println("carrierServiceE3Hardcoded = " + carrierServiceE3Hardcoded);
        int carrierServiceE3FromLabelStart = decodedStringShipments.indexOf("^FT437,130^A0N,27,27^FD") + 23;
        String carrierServiceE3FromLabel = decodedStringShipments.substring(carrierServiceE3FromLabelStart, carrierServiceE3FromLabelStart + carrierServiceE3Hardcoded.length());
        //    System.out.println("carrierServiceE3FromLabel = " + carrierServiceE3FromLabel);
        assertThat(carrierServiceE3Hardcoded, is(equalTo(carrierServiceE3FromLabel)));

    }


    @DisplayName("ZPL Carrier service E4 - 'E-VS'")
    @Test
    public void test11() {

        String carrierServiceE4Hardcoded = "E-VS";
        //    System.out.println("carrierServiceE4Hardcoded = " + carrierServiceE4Hardcoded);
        int carrierServiceE4FromLabelStart = decodedStringShipments.indexOf("^FT437,163^A0N,27,27^FD") + 23;
        String carrierServiceE4FromLabel = decodedStringShipments.substring(carrierServiceE4FromLabelStart, carrierServiceE4FromLabelStart + carrierServiceE4Hardcoded.length());
        //    System.out.println("carrierServiceE4FromLabel = " + carrierServiceE4FromLabel);
        assertThat(carrierServiceE4Hardcoded, is(equalTo(carrierServiceE4FromLabel)));

    }


    @DisplayName("ZPL Carrier service F1 - 'GEN_BERLIN'")
    @Test
    public void test12() {

        String carrierServiceF1FromJson = osmPojoShipments.getPickupAddress().getReference();
        //    System.out.println("carrierServiceF1FromJson = " + carrierServiceF1FromJson);
        int carrierServiceF1FromLabelStart = decodedStringShipments.indexOf("^FT35,337^A0N,27,27^FH^FD") + 25;
        String carrierServiceF1FromLabel = (decodedStringShipments.substring(carrierServiceF1FromLabelStart, carrierServiceF1FromLabelStart + carrierServiceF1FromJson.length() + 2)).replace("5F", "");
        //    System.out.println("carrierServiceF1FromLabel = " + carrierServiceF1FromLabel);
        assertThat(carrierServiceF1FromJson, is(equalTo(carrierServiceF1FromLabel)));

    }


    @DisplayName("ZPL Carrier service F2 - '745 E KNOPF RD'")
    @Test
    public void test13() {

        String carrierServiceF2FromJson = ((String) osmPojoShipments.getPickupAddress().getAddressLines().get(0).getValue()).toUpperCase();
        //    System.out.println("carrierServiceF2FromJson = " + carrierServiceF2FromJson);
        int carrierServiceF2FromLabelStart = decodedStringShipments.indexOf("^FT35,369^A0N,27,27^FD") + 22;
        String carrierServiceF2FromLabel = decodedStringShipments.substring(carrierServiceF2FromLabelStart, carrierServiceF2FromLabelStart + carrierServiceF2FromJson.length());
        //    System.out.println("carrierServiceF2FromLabel = " + carrierServiceF2FromLabel);
        assertThat(carrierServiceF2FromJson, is(equalTo(carrierServiceF2FromLabel)));

    }


    @DisplayName("ZPL Carrier service F3 - 'BERLIN, WI 54923'")
    @Test
    public void test14() {

        String carrierServiceF3FromJson = (osmPojoShipments.getPickupAddress().getLocalityName()).toUpperCase() + ", " + osmPojoShipments.getPickupAddress().getSubdivisionCode() + " " + osmPojoShipments.getPickupAddress().getPostalCode();
        //    System.out.println("carrierServiceF3FromJson = " + carrierServiceF3FromJson);
        int carrierServiceF3FromLabelStart = decodedStringShipments.indexOf("^FT35,402^A0N,27,27^FD") + 22;
        String carrierServiceF3FromLabel = decodedStringShipments.substring(carrierServiceF3FromLabelStart, carrierServiceF3FromLabelStart + carrierServiceF3FromJson.length());
        //    System.out.println("carrierServiceF3FromLabel = " + carrierServiceF3FromLabel);
        assertThat(carrierServiceF3FromJson, is(equalTo(carrierServiceF3FromLabel)));

    }


    @DisplayName("ZPL Carrier service G1 - 'B COMPANY'")
    @Test
    public void test15() {

        String carrierServiceG1FromJson = osmPojoShipments.getDeliveryAddress().getReference();
        //    System.out.println("carrierServiceG1FromJson = " + carrierServiceG1FromJson);
        int carrierServiceG1FromLabelStart = decodedStringShipments.indexOf("^FT81,536^A0N,35,35^FD") + 22;
        String carrierServiceG1FromLabel = decodedStringShipments.substring(carrierServiceG1FromLabelStart, carrierServiceG1FromLabelStart + carrierServiceG1FromJson.length());
        //   System.out.println("carrierServiceG1FromLabel = " + carrierServiceG1FromLabel);
        assertThat(carrierServiceG1FromJson.toUpperCase(), is(equalTo(carrierServiceG1FromLabel)));

    }


    @DisplayName("ZPL Carrier service G2 - 'Squidward Jarhead Grunt Rotorhead'")
    @Test
    public void test16() {

        String carrierServiceG2FromJson = osmPojoShipments.getDeliveryAddress().getContacts().get(0).getName();
        //    System.out.println("carrierServiceG2FromJson = " + carrierServiceG2FromJson);
        int carrierServiceG2FromLabelStart = decodedStringShipments.indexOf("^FT81,579^A0N,35,31^FD") + 22;
        String carrierServiceG2FromLabel = decodedStringShipments.substring(carrierServiceG2FromLabelStart, carrierServiceG2FromLabelStart + carrierServiceG2FromJson.length());
        //    System.out.println("carrierServiceG2FromLabel = " + carrierServiceG2FromLabel);
        assertThat(carrierServiceG2FromJson, is(equalTo(carrierServiceG2FromLabel)));

    }


    @DisplayName("ZPL Carrier service G3 - '2-10 INFANTRY BATTALION'")
    @Test
    public void test17() {

        String carrierServiceG3FromJson = (osmPojoShipments.getDeliveryAddress().getAddressLines().get(0).getValue());
        //    System.out.println("carrierServiceG3FromJson = " + carrierServiceG3FromJson);
        int carrierServiceG3FromLabelStart = decodedStringShipments.indexOf("^FT81,621^A0N,35,35^FD") + 22;
        String carrierServiceG3FromLabel = decodedStringShipments.substring(carrierServiceG3FromLabelStart, carrierServiceG3FromLabelStart + carrierServiceG3FromJson.length());
        //    System.out.println("carrierServiceG3FromLabel = " + carrierServiceG3FromLabel);
        assertThat(carrierServiceG3FromJson.toUpperCase(), is(equalTo(carrierServiceG3FromLabel)));

    }


    @DisplayName("ZPL Carrier service G4 - 'APO, AE 09354'")
    @Test
    public void test18() {

        String carrierServiceG4FromJson = (osmPojoShipments.getDeliveryAddress().getLocalityName()) + ", " + osmPojoShipments.getDeliveryAddress().getSubdivisionCode() + " " + osmPojoShipments.getDeliveryAddress().getPostalCode();
        //    System.out.println("carrierServiceG4FromJson = " + carrierServiceG4FromJson);
        int carrierServiceG4FromLabelStart = decodedStringShipments.indexOf("^FT81,663^A0N,35,35^FD") + 22;
        String carrierServiceG4FromLabel = decodedStringShipments.substring(carrierServiceG4FromLabelStart, carrierServiceG4FromLabelStart + carrierServiceG4FromJson.length());
        //   System.out.println("carrierServiceG4FromLabel = " + carrierServiceG4FromLabel);
        assertThat(carrierServiceG4FromJson.toUpperCase(), is(equalTo(carrierServiceG4FromLabel)));

    }


    @DisplayName("ZPL Carrier service H1 - 'Shipper Reference'")
    @Test
    public void test19() {

        String carrierServiceH1FromJson = osmPojoShipments.getShipperRef();
        //    System.out.println("carrierServiceH1FromJson = " + carrierServiceH1FromJson);
        int carrierServiceH1FromLabelStart = decodedStringShipments.indexOf("^FT35,783^A0N,22,22^FDRef1#: ") + 29;
        String carrierServiceH1FromLabel = decodedStringShipments.substring(carrierServiceH1FromLabelStart, carrierServiceH1FromLabelStart + carrierServiceH1FromJson.length());
        //   System.out.println("carrierServiceH1FromLabel = " + carrierServiceH1FromLabel);
        assertThat(carrierServiceH1FromJson, is(equalTo(carrierServiceH1FromLabel)));

    }


    @DisplayName("ZPL Carrier service H2 - 'Receiver Reference'")
    @Test
    public void test20() {

        String carrierServiceH2FromJson = (String) osmPojoShipments.getReceiverRef();
        //    System.out.println("carrierServiceH2FromJson = " + carrierServiceH2FromJson);
        int carrierServiceH2FromLabelStart = decodedStringShipments.indexOf("^FT35,809^A0N,22,22^FDRef2#: ") + 29;
        String carrierServiceH2FromLabel = decodedStringShipments.substring(carrierServiceH2FromLabelStart, carrierServiceH2FromLabelStart + carrierServiceH2FromJson.length());
        //   System.out.println("carrierServiceH2FromLabel = " + carrierServiceH2FromLabel);
        assertThat(carrierServiceH2FromJson, is(equalTo(carrierServiceH2FromLabel)));

    }


    @DisplayName("ZPL Carrier service I - 'USPS TRACKING # eVS'")
    @Test
    public void test21() {

        String carrierServiceIHardcoded = "USPS TRACKING # eVS";
        //    System.out.println("carrierServiceIHardcoded = " + carrierServiceIHardcoded);
        int carrierServiceIFromLabelStart = decodedStringShipments.indexOf("^FT257,898^A0N,33,33^FD") + 23;
        String carrierServiceIFromLabel = decodedStringShipments.substring(carrierServiceIFromLabelStart, carrierServiceIFromLabelStart + carrierServiceIHardcoded.length());
        //    System.out.println("carrierServiceIFromLabel = " + carrierServiceIFromLabel);
        assertThat(carrierServiceIHardcoded, is(equalTo(carrierServiceIFromLabel)));

    }


    @DisplayName("ZPL Carrier service J - '420535349205520220307000005826'")
    @Test
    public void test22() {

        String carrierServiceJFromJson = "420" + osmPojoShipments.getDeliveryAddress().getPostalCode() + "92" + carrierServiceSTCValueFromJsonMap.get(carrierServiceFromJson) + osmPojoShipments.getPickupForwarderDivisionAccountCode() + osmPojoShipments.getShippingUnits().get(0).getForwarderRef().substring(22, 29) + checkDigit;
        //    System.out.println("carrierServiceJFromJson = " + carrierServiceJFromJson);
        int carrierServiceJFromLabelStart = decodedStringShipments.indexOf("^FO106,935^BCN,142,N^FD>;") + 25;
        String carrierServiceJFromLabel = decodedStringShipments.substring(carrierServiceJFromLabelStart, carrierServiceJFromLabelStart + carrierServiceJFromJson.length());
        //    System.out.println("carrierServiceJFromLabel = " + carrierServiceJFromLabel);
        assertThat(carrierServiceJFromJson, is(equalTo(carrierServiceJFromLabel)));

    }


    @DisplayName("ZPL Carrier service K - '9205 5202 2030 7000 0058 26'")
    @Test
    public void test23() {

        String carrierServiceKFromJson = "92" + carrierServiceSTCValueFromJsonMap.get(carrierServiceFromJson) + osmPojoShipments.getPickupForwarderDivisionAccountCode() + osmPojoShipments.getShippingUnits().get(0).getForwarderRef().substring(22, 29) + checkDigit;
        //    System.out.println("carrierServiceKFromJson = " + carrierServiceKFromJson);
        int carrierServiceKFromLabelStart = decodedStringShipments.indexOf("^FT218,1143^A0N,33,33^FD") + 24;
        String carrierServiceKFromLabel = decodedStringShipments.substring(carrierServiceKFromLabelStart, carrierServiceKFromLabelStart + carrierServiceKFromJson.length() + 5);
        //    System.out.println("carrierServiceKFromLabel = " + carrierServiceKFromLabel);
        assertThat(carrierServiceKFromJson, is(equalTo(carrierServiceKFromLabel.replace(" ", ""))));

    }


    @DisplayName("EDI - Package Id - '9241920220307000007615'")
    @Test
    public void test26() {

        String packageIdFromJson = osmPojoShipments.getShippingUnits().get(0).getForwarderRef().substring(8);
        //    System.out.println("packageIdFromJson = " + packageIdFromJson);
        String packageIdFromEDI = decodedValuesInternational.get(0).replace("\"", "");
        //    System.out.println("packageIdFromEDI = " + packageIdFromEDI);
        assertThat(packageIdFromEDI, is(equalTo(packageIdFromJson)));

    }


    @DisplayName("EDI - Service - '0'")
    @Test
    public void test27() {

        String serviceHarcoded = carrierServiceSTCValueAPOFromJsonMap.get(carrierServiceFromJson).substring(2);
        //    System.out.println("serviceHarcoded = " + serviceHarcoded);
        String serviceFromEDI = decodedValuesInternational.get(1);
        //    System.out.println("serviceFromEDI = " + serviceFromEDI);
        assertThat(serviceFromEDI, is(equalTo(serviceHarcoded)));

    }


    @DisplayName("EDI - Cost Center Id - ''")
    @Test
    public void test28() {

        String costCenterIdFromEDI = decodedValuesInternational.get(2);
        //    System.out.println("costCenterIdFromEDI = " + costCenterIdFromEDI);
        assertThat(costCenterIdFromEDI, is(equalTo("")));

    }


    @DisplayName("EDI - Total Value - ''")
    @Test
    public void test29() {

        if (osmPojoShipments.getShippingUnits().get(0).getCustomsValue() != null) {
            double totalValueFromJson = (double) osmPojoShipments.getShippingUnits().get(0).getCustomsValue();
            //    System.out.println("totalValueFromJson = " + totalValueFromJson);
            String totalValueFromEDI = decodedValuesInternational.get(3);
            //    System.out.println("totalValueFromEDI = " + totalValueFromEDI);
            assertThat(totalValueFromEDI, is(equalTo(String.valueOf(totalValueFromJson))));
        } else {
            String totalValueFromJson = "";
            //    System.out.println("totalValueFromJson = " + totalValueFromJson);
            String totalValueFromEDI = decodedValuesInternational.get(3);
            //    System.out.println("totalValueFromEDI = " + totalValueFromEDI);
            assertThat(totalValueFromEDI, is(equalTo(totalValueFromJson)));
        }
    }


    @DisplayName("EDI - Weight Lbs - '5.86'")
    @Test
    public void test30() {


        String weightFromJson = String.valueOf(osmPojoShipments.getShippingUnits().get(0).getGrossWeight());
        //    System.out.println("weightFromJson = " + weightFromJson);
        String weightFromEDI = decodedValuesInternational.get(4);
        //    System.out.println("weightFromEDI = " + weightFromEDI);
        assertThat(weightFromEDI, is(equalTo(weightFromJson)));

    }


    @DisplayName("EDI - Number of Items - '1'")
    @Test
    public void test31() {


        String numberOfItemsFromJson = String.valueOf(osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size());
        //    System.out.println("numberOfItemsFromJson = " + numberOfItemsFromJson);
        String numberOfItemsFromEDI = decodedValuesInternational.get(5);
        //    System.out.println("numberOfItemsFromEDI = " + numberOfItemsFromEDI);
        assertThat(numberOfItemsFromEDI, is(equalTo(numberOfItemsFromJson)));

    }


    @DisplayName("EDI - Company - 'B Company'")
    @Test
    public void test32() {

        String companyFromJson = osmPojoShipments.getDeliveryAddress().getReference();
        //    System.out.println("companyFromJson = " + companyFromJson);
        String companyFromEDI = decodedValuesInternational.get(6);
        //    System.out.println("companyFromEDI = " + companyFromEDI);
        assertThat(companyFromEDI, is(equalTo(companyFromJson)));

    }


    @DisplayName("EDI - Name - 'Squidward Jarhead Grunt Rotorhead'")
    @Test
    public void test33() {

        String nameFromJson = osmPojoShipments.getDeliveryAddress().getContacts().get(0).getName();
        //    System.out.println("nameFromJson = " + nameFromJson);
        String nameFromEDI = decodedValuesInternational.get(7);
        //    System.out.println("nameFromEDI = " + nameFromEDI);
        assertThat(nameFromEDI, is(equalTo(nameFromJson)));

    }


    @DisplayName("EDI - Address 1 - '2-10 Infantry Battalion'")
    @Test
    public void test34() {

        String address1FromJson = osmPojoShipments.getDeliveryAddress().getAddressLines().get(0).getValue();
        //    System.out.println("address1FromJson = " + address1FromJson);
        String address1FromEDI = decodedValuesInternational.get(8);
        //    System.out.println("address1FromEDI = " + address1FromEDI);
        assertThat(address1FromEDI, is(equalTo(address1FromJson)));

    }


    @DisplayName("EDI - Address 2 - '1st Platoon'")
    @Test
    public void test35() {

        if (osmPojoShipments.getDeliveryAddress().getAddressLines().size() == 2) {
            String address2FromJson = osmPojoShipments.getDeliveryAddress().getAddressLines().get(1).getValue();
            //    System.out.println("address2FromJson = " + address2FromJson);
            String address2FromEDI = decodedValuesInternational.get(9);
            //    System.out.println("address2FromEDI = " + address2FromEDI);
            assertThat(address2FromEDI, is(equalTo(address2FromJson)));
        } else {
            String address2FromJson = "";
            //    System.out.println("address2FromJson = " + address2FromJson);
            String address2FromEDI = decodedValuesInternational.get(9);
            //    System.out.println("address2FromEDI = " + address2FromEDI);
            assertThat(address2FromEDI, is(equalTo(address2FromJson)));
        }

    }


    @DisplayName("EDI - Address 3 - ''")
    @Test
    public void test36() {

        if (osmPojoShipments.getDeliveryAddress().getAddressLines().size() == 3) {
            String address3FromJson = osmPojoShipments.getDeliveryAddress().getAddressLines().get(2).getValue();
            //    System.out.println("address3FromJson = " + address3FromJson);
            String address3FromEDI = decodedValuesInternational.get(10);
            //    System.out.println("address3FromEDI = " + address3FromEDI);
            assertThat(address3FromEDI, is(equalTo(address3FromJson)));
        } else {
            String address3FromJson = "";
            //    System.out.println("address3FromJson = " + address3FromJson);
            String address3FromEDI = decodedValuesInternational.get(10);
            //    System.out.println("address3FromEDI = " + address3FromEDI);
            assertThat(address3FromEDI, is(equalTo(address3FromJson)));
        }

    }


    @DisplayName("EDI - City - 'APO'")
    @Test
    public void test37() {

        String cityFromJson = osmPojoShipments.getDeliveryAddress().getLocalityName();
        //    System.out.println("cityFromJson = " + cityFromJson);
        String cityFromEDI = decodedValuesInternational.get(11);
        //    System.out.println("cityFromEDI = " + cityFromEDI);
        assertThat(cityFromEDI, is(equalTo(cityFromJson)));

    }


    @DisplayName("EDI - State - 'AE'")
    @Test
    public void test38() {

        if (osmPojoShipments.getDeliveryAddress().getSubdivisionCode() != null) {
            String stateFromJson = osmPojoShipments.getDeliveryAddress().getSubdivisionCode();
            //    System.out.println("stateFromJson = " + stateFromJson);
            String stateFromEDI = decodedValuesInternational.get(12);
            //    System.out.println("stateFromEDI = " + stateFromEDI);
            assertThat(stateFromEDI, is(equalTo(stateFromJson)));
        } else {
            String stateFromJson = "";
            //    System.out.println("stateFromJson = " + stateFromJson);
            String stateFromEDI = decodedValuesInternational.get(12);
            //    System.out.println("stateFromEDI = " + stateFromEDI);
            assertThat(stateFromEDI, is(equalTo(stateFromJson)));
        }
    }


    @DisplayName("EDI - Zip - '09354'")
    @Test
    public void test39() {

        String zipFromJson = osmPojoShipments.getDeliveryAddress().getPostalCode();
        //    System.out.println("zipFromJson = " + zipFromJson);
        String zipFromEDI = decodedValuesInternational.get(13);
        //    System.out.println("zipFromEDI = " + zipFromEDI);
        assertThat(zipFromEDI, is(equalTo(zipFromJson)));

    }


    @DisplayName("EDI - Country - 'US'")
    @Test
    public void test40() {

        String countryFromJson = osmPojoShipments.getDeliveryAddress().getCountryCode();
        //    System.out.println("countryFromJson = " + countryFromJson);
        String countryFromEDI = decodedValuesInternational.get(14);
        //    System.out.println("countryFromEDI = " + countryFromEDI);
        assertThat(countryFromEDI, is(equalTo(countryFromJson)));

    }


    @DisplayName("EDI - EmailAddress - ''")
    @Test
    public void test41() {

        if (osmPojoShipments.getDeliveryAddress().getContacts().get(0).getEmailAddress() != null) {
            String emailAddressFromJson = osmPojoShipments.getDeliveryAddress().getContacts().get(0).getEmailAddress();
            //    System.out.println("emailAddressFromJson = " + emailAddressFromJson);
            String emailAddressFromEDI = decodedValuesInternational.get(15);
            //    System.out.println("emailAddressFromEDI = " + emailAddressFromEDI);
            assertThat(emailAddressFromEDI, is(equalTo(emailAddressFromJson)));
        } else {
            String emailAddressFromJson = "";
            //    System.out.println("emailAddressFromJson = " + emailAddressFromJson);
            String emailAddressFromEDI = decodedValuesInternational.get(15);
            //    System.out.println("emailAddressFromEDI = " + emailAddressFromEDI);
            assertThat(emailAddressFromEDI, is(equalTo(emailAddressFromJson)));
        }
    }


    @DisplayName("EDI - Phone Number - '202-456-1414'")
    @Test
    public void test42() {

        String phoneNumberFromJson = osmPojoShipments.getDeliveryAddress().getContacts().get(0).getPhoneNumber();
        //    System.out.println("phoneNumberFromJson = " + phoneNumberFromJson);
        String phoneNumberFromEDI = decodedValuesInternational.get(16);
        //    System.out.println("phoneNumberFromEDI = " + phoneNumberFromEDI);
        assertThat(phoneNumberFromEDI, is(equalTo(phoneNumberFromJson)));

    }


    @DisplayName("EDI - Reference 1 - 'Shipper Reference'")
    @Test
    public void test43() {

        if (osmPojoShipments.getShipperRef() != null) {
            String reference1FromJson = osmPojoShipments.getShipperRef();
            //    System.out.println("reference1FromJson = " + reference1FromJson);
            String reference1FromEDI = decodedValuesInternational.get(17);
            //    System.out.println("reference1FromEDI = " + reference1FromEDI);
            assertThat(reference1FromEDI, is(equalTo(reference1FromJson)));
        } else {
            String reference1FromJson = "";
            //    System.out.println("reference1FromJson = " + reference1FromJson);
            String reference1FromEDI = decodedValuesInternational.get(17);
            //    System.out.println("reference1FromEDI = " + reference1FromEDI);
            assertThat(reference1FromEDI, is(equalTo(reference1FromJson)));
        }
    }


    @DisplayName("EDI - Reference 2 - 'Receiver Reference'")
    @Test
    public void test44() {

        if (osmPojoShipments.getReceiverRef() != null) {
            String reference2FromJson = (String) osmPojoShipments.getReceiverRef();
            //   System.out.println("reference2FromJson = " + reference2FromJson);
            String reference2FromEDI = decodedValuesInternational.get(18);
            //    System.out.println("reference2FromEDI = " + reference2FromEDI);
            assertThat(reference2FromEDI, is(equalTo(reference2FromJson)));
        } else {
            String reference2FromJson = "";
            //   System.out.println("reference2FromJson = " + reference2FromJson);
            String reference2FromEDI = decodedValuesInternational.get(18);
            //    System.out.println("reference2FromEDI = " + reference2FromEDI);
            assertThat(reference2FromEDI, is(equalTo(reference2FromJson)));
        }
    }


    @DisplayName("EDI - Reference 3 - ''")
    @Test
    public void test45() {

        String reference3FromEDI = decodedValuesInternational.get(19);
        //    System.out.println("reference3FromEDI = " + reference3FromEDI);
        assertThat(reference3FromEDI, is(equalTo("")));

    }


    @DisplayName("EDI - Reference 4 - ''")
    @Test
    public void test46() {

        String reference4FromEDI = decodedValuesInternational.get(20);
        //    System.out.println("reference4FromEDI = " + reference4FromEDI);
        assertThat(reference4FromEDI, is(equalTo("")));

    }


    @DisplayName("EDI - Return Name - ''")
    @Test
    public void test47() {

        if (osmPojoShipments.getAddresses().size() == 3) {
            String returnNameFromJson = osmPojoShipments.getAddresses().get(2).getReference();
            //    System.out.println("returnNameFromJson = " + returnNameFromJson);
            String returnNameFromEDI = decodedValuesInternational.get(21);
            //    System.out.println("returnNameFromEDI = " + returnNameFromEDI);
            assertThat(returnNameFromEDI, is(equalTo(returnNameFromJson)));
        } else {
            String returnNameFromJson = "";
            //    System.out.println("returnNameFromJson = " + returnNameFromJson);
            String returnNameFromEDI = decodedValuesInternational.get(21);
            //    System.out.println("returnNameFromEDI = " + returnNameFromEDI);
            assertThat(returnNameFromEDI, is(equalTo(returnNameFromJson)));
        }

    }


    @DisplayName("EDI - Return Address 1 - ''")
    @Test
    public void test48() {

        if (osmPojoShipments.getAddresses().size() == 3) {
            String returnAddress1FromJson = (String) osmPojoShipments.getAddresses().get(2).getAddressLines().get(0).getValue();
            //    System.out.println("returnAddress1FromJson = " + returnAddress1FromJson);
            String returnAddress1FromEDI = decodedValuesInternational.get(22);
            //    System.out.println("returnAddress1FromEDI = " + returnAddress1FromEDI);
            assertThat(returnAddress1FromEDI, is(equalTo(returnAddress1FromJson)));
        } else {
            String returnAddress1FromJson = "";
            //    System.out.println("returnAddress1FromJson = " + returnAddress1FromJson);
            String returnAddress1FromEDI = decodedValuesInternational.get(22);
            //    System.out.println("returnAddress1FromEDI = " + returnAddress1FromEDI);
            assertThat(returnAddress1FromEDI, is(equalTo(returnAddress1FromJson)));
        }


    }


    @DisplayName("EDI - Return Address 2 - ''")
    @Test
    public void test49() {

        if (osmPojoShipments.getAddresses().size() == 3) {
            if (osmPojoShipments.getAddresses().get(2).getAddressLines().size() == 2) {
                String returnAddress2FromJson = (String) osmPojoShipments.getAddresses().get(2).getAddressLines().get(1).getValue();
                //    System.out.println("returnAddress2FromJson = " + returnAddress2FromJson);
                String returnAddress2FromEDI = decodedValuesInternational.get(23);
                //    System.out.println("returnAddress2FromEDI = " + returnAddress2FromEDI);
                assertThat(returnAddress2FromEDI, is(equalTo(returnAddress2FromJson)));
            } else {
                String returnAddress2FromJson = "";
                //    System.out.println("returnAddress2FromJson = " + returnAddress2FromJson);
                String returnAddress2FromEDI = decodedValuesInternational.get(23);
                //    System.out.println("returnAddress2FromEDI = " + returnAddress2FromEDI);
                assertThat(returnAddress2FromEDI, is(equalTo(returnAddress2FromJson)));
            }
        } else {
            String returnAddress2FromJson = "";
            //    System.out.println("returnAddress2FromJson = " + returnAddress2FromJson);
            String returnAddress2FromEDI = decodedValuesInternational.get(23);
            //    System.out.println("returnAddress2FromEDI = " + returnAddress2FromEDI);
            assertThat(returnAddress2FromEDI, is(equalTo(returnAddress2FromJson)));
        }


    }

    @DisplayName("EDI - Return Address 3 - ''")
    @Test
    public void test50() {

        if (osmPojoShipments.getAddresses().size() == 3) {
            if (osmPojoShipments.getAddresses().get(2).getAddressLines().size() == 3) {
                String returnAddress3FromJson = (String) osmPojoShipments.getAddresses().get(2).getAddressLines().get(2).getValue();
                //    System.out.println("returnAddress3FromJson = " + returnAddress3FromJson);
                String returnAddress3FromEDI = decodedValuesInternational.get(24);
                //    System.out.println("returnAddress3FromEDI = " + returnAddress3FromEDI);
                assertThat(returnAddress3FromEDI, is(equalTo(returnAddress3FromJson)));
            } else {
                String returnAddress3FromJson = "";
                //    System.out.println("returnAddress3FromJson = " + returnAddress3FromJson);
                String returnAddress3FromEDI = decodedValuesInternational.get(24);
                //    System.out.println("returnAddress3FromEDI = " + returnAddress3FromEDI);
                assertThat(returnAddress3FromEDI, is(equalTo(returnAddress3FromJson)));
            }
        } else {
            String returnAddress3FromJson = "";
            //    System.out.println("returnAddress3FromJson = " + returnAddress3FromJson);
            String returnAddress3FromEDI = decodedValuesInternational.get(24);
            //    System.out.println("returnAddress3FromEDI = " + returnAddress3FromEDI);
            assertThat(returnAddress3FromEDI, is(equalTo(returnAddress3FromJson)));
        }

    }


    @DisplayName("EDI - Return City - ''")
    @Test
    public void test51() {
        if (osmPojoShipments.getAddresses().size() == 3) {
            String returnCityFromJson = osmPojoShipments.getAddresses().get(2).getLocalityName();
            //    System.out.println("returnCityFromJson = " + returnCityFromJson);
            String returnCityFromEDI = decodedValuesInternational.get(25);
            //    System.out.println("returnCityFromEDI = " + returnCityFromEDI);
            assertThat(returnCityFromEDI, is(equalTo(returnCityFromJson)));
        } else {
            String returnCityFromJson = "";
            //    System.out.println("returnCityFromJson = " + returnCityFromJson);
            String returnCityFromEDI = decodedValuesInternational.get(25);
            //    System.out.println("returnCityFromEDI = " + returnCityFromEDI);
            assertThat(returnCityFromEDI, is(equalTo(returnCityFromJson)));
        }

    }


    @DisplayName("EDI - Return State - ''")
    @Test
    public void test52() {

        if (osmPojoShipments.getAddresses().size() == 3) {
            String returnStateFromJson = osmPojoShipments.getAddresses().get(2).getSubdivisionCode();
            //    System.out.println("returnStateFromJson = " + returnStateFromJson);
            String returnStateFromEDI = decodedValuesInternational.get(26);
            //    System.out.println("returnStateFromEDI = " + returnStateFromEDI);
            assertThat(returnStateFromEDI, is(equalTo(returnStateFromJson)));
        } else {
            String returnStateFromJson = "";
            //    System.out.println("returnStateFromJson = " + returnStateFromJson);
            String returnStateFromEDI = decodedValuesInternational.get(26);
            //    System.out.println("returnStateFromEDI = " + returnStateFromEDI);
            assertThat(returnStateFromEDI, is(equalTo(returnStateFromJson)));
        }

    }

    @DisplayName("EDI - Return Zip - ''")
    @Test
    public void test53() {

        if (osmPojoShipments.getAddresses().size() == 3) {
            String returnZipFromJson = osmPojoShipments.getAddresses().get(2).getPostalCode();
            //    System.out.println("returnZipFromJson = " + returnZipFromJson);
            String returnZipFromEDI = decodedValuesInternational.get(27);
            //    System.out.println("returnZipFromEDI = " + returnZipFromEDI);
            assertThat(returnZipFromEDI, is(equalTo(returnZipFromJson)));
        } else {
            String returnZipFromJson = "";
            //    System.out.println("returnZipFromJson = " + returnZipFromJson);
            String returnZipFromEDI = decodedValuesInternational.get(27);
            //    System.out.println("returnZipFromEDI = " + returnZipFromEDI);
            assertThat(returnZipFromEDI, is(equalTo(returnZipFromJson)));
        }

    }


    @DisplayName("EDI - Return Country - ''")
    @Test
    public void test54() {

        if (osmPojoShipments.getAddresses().size() == 3) {
            String returnCountryFromJson = osmPojoShipments.getAddresses().get(2).getCountryCode();
            //    System.out.println("returnCountryFromJson = " + returnCountryFromJson);
            String returnCountryFromEDI = decodedValuesInternational.get(28);
            //    System.out.println("returnCountryFromEDI = " + returnCountryFromEDI);
            assertThat(returnCountryFromEDI, is(equalTo(returnCountryFromJson)));
        } else {
            String returnCountryFromJson = "";
            //    System.out.println("returnCountryFromJson = " + returnCountryFromJson);
            String returnCountryFromEDI = decodedValuesInternational.get(28);
            //    System.out.println("returnCountryFromEDI = " + returnCountryFromEDI);
            assertThat(returnCountryFromEDI, is(equalTo(returnCountryFromJson)));
        }

    }


    @DisplayName("EDI - Recipient Tax Id - ''")
    @Test
    public void test55() {

        if (osmPojoShipments.getDeliveryAddress().getVatNumber() != null) {
            int recipientTaxIdFromJson = (int) osmPojoShipments.getDeliveryAddress().getVatNumber();
            //   System.out.println("recipientTaxIdFromJson = " + recipientTaxIdFromJson);
            String recipientTaxIdFromEDI = decodedValuesInternational.get(29);
            //    System.out.println("recipientTaxIdFromEDI = " + recipientTaxIdFromEDI);
            assertThat(recipientTaxIdFromEDI, is(equalTo(String.valueOf(recipientTaxIdFromJson))));
        } else {
            String recipientTaxIdFromJson = "";
            //    System.out.println("recipientTaxIdFromJson = " + recipientTaxIdFromJson);
            String recipientTaxIdFromEDI = decodedValuesInternational.get(29);
            //    System.out.println("recipientTaxIdFromEDI = " + recipientTaxIdFromEDI);
            assertThat(recipientTaxIdFromEDI, is(equalTo(recipientTaxIdFromJson)));
        }

    }


    @DisplayName("EDI - Sender Business Name - 'GEN_BERLIN'")
    @Test
    public void test56() {

        String senderBusinessNameFromJson = osmPojoShipments.getPickupAddress().getReference();
        //    System.out.println("senderBusinessNameFromJson = " + senderBusinessNameFromJson);
        String senderBusinessNameFromEDI = decodedValuesInternational.get(30);
        //    System.out.println("senderBusinessNameFromEDI = " + senderBusinessNameFromEDI);
        assertThat(senderBusinessNameFromEDI, is(equalTo(senderBusinessNameFromJson)));

    }


    @DisplayName("EDI - Sender Address - '745 E Knopf Rd'")
    @Test
    public void test57() {

        String senderAddressFromJson = osmPojoShipments.getPickupAddress().getAddressLines().get(0).getValue();
        //    System.out.println("senderAddressFromJson = " + senderAddressFromJson);
        String senderAddressFromEDI = decodedValuesInternational.get(31);
        //    System.out.println("senderAddressFromEDI = " + senderAddressFromEDI);
        assertThat(senderAddressFromEDI, is(equalTo(senderAddressFromJson)));

    }


    @DisplayName("EDI - Sender City - 'Berlin'")
    @Test
    public void test58() {

        String senderCityFromJson = osmPojoShipments.getPickupAddress().getLocalityName();
        //    System.out.println("senderCityFromJson = " + senderCityFromJson);
        String senderCityFromEDI = decodedValuesInternational.get(32);
        //    System.out.println("senderCityFromEDI = " + senderCityFromEDI);
        assertThat(senderCityFromEDI, is(equalTo(senderCityFromJson)));

    }


    @DisplayName("EDI - Sender State - 'WI'")
    @Test
    public void test59() {

        String senderStateFromJson = osmPojoShipments.getPickupAddress().getSubdivisionCode();
        //    System.out.println("senderStateFromJson = " + senderStateFromJson);
        String senderStateFromEDI = decodedValuesInternational.get(33);
        //    System.out.println("senderStateFromEDI = " + senderStateFromEDI);
        assertThat(senderStateFromEDI, is(equalTo(senderStateFromJson)));

    }


    @DisplayName("EDI - Sender Zip Code - '54923'")
    @Test
    public void test60() {

        String senderZipCodeFromJson = osmPojoShipments.getPickupAddress().getPostalCode();
        //    System.out.println("senderZipCodeFromJson = " + senderZipCodeFromJson);
        String senderZipCodeFromEDI = decodedValuesInternational.get(34);
        //    System.out.println("senderZipCodeFromEDI = " + senderZipCodeFromEDI);
        assertThat(senderZipCodeFromEDI, is(equalTo(senderZipCodeFromJson)));

    }


    @DisplayName("EDI - Sender Zip Code Plus 4 - ''")
    @Test
    public void test61() {

        String senderZipCodePlus4FromJson = "";
        String senderZipCodePlus4FromEDI = decodedValuesInternational.get(35);
        //    System.out.println("senderZipCodePlus4FromEDI = " + senderZipCodePlus4FromEDI);
        assertThat(senderZipCodePlus4FromEDI, is(equalTo(senderZipCodePlus4FromJson)));

    }


    @DisplayName("EDI - Sender Phone - '262-544-4811'")
    @Test
    public void test62() {

        String senderPhoneFromJson = (String) osmPojoShipments.getPickupAddress().getContacts().get(0).getPhoneNumber();
        //    System.out.println("senderPhoneFromJson = " + senderPhoneFromJson);
        String senderPhoneFromEDI = decodedValuesInternational.get(36);
        //    System.out.println("senderPhoneFromEDI = " + senderPhoneFromEDI);
        assertThat(senderPhoneFromEDI, is(equalTo(senderPhoneFromJson)));

    }


    @DisplayName("EDI - Hazardous - '0'")
    @Test
    public void test63() {
        String hazardousFromJson;
        if (osmPojoShipments.getShippingUnits().get(0).getDangerousGoods().size() == 0 & osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getDangerousGoods().size() == 0) {
            hazardousFromJson = "0";
        } else {
            hazardousFromJson = "1";
        }
        //    System.out.println("hazardousFromJson = " + hazardousFromJson);
        String hazardousFromEDI = decodedValuesInternational.get(37);
        //    System.out.println("hazardousFromEDI = " + hazardousFromEDI);
        assertThat(hazardousFromEDI, is(equalTo(hazardousFromJson)));

    }


    @DisplayName("EDI - SoftPack - ''")
    @Test
    public void test64() {

        String softPackFromEDI = decodedValuesInternational.get(38);
        //    System.out.println("softPackFromEDI = " + softPackFromEDI);
        assertThat(softPackFromEDI, is(equalTo("")));

    }


    @DisplayName("EDI - OSM BOL - ''")
    @Test
    public void test65() {

        String osmBolFromEDI = decodedValuesInternational.get(39);
        //    System.out.println("osmBolFromEDI = " + osmBolFromEDI);
        assertThat(osmBolFromEDI, is(equalTo("")));

    }


    @DisplayName("EDI - Item Number - '1'")
    @Test
    public void test66() {

        if (osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size() == 1) {
            String itemNumberFromEDI = decodedValuesInternational.get(40);
            //    System.out.println("itemNumberFromEDI = " + itemNumberFromEDI);
            assertThat(itemNumberFromEDI, is(equalTo("1")));
        } else if (osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().size() == 2) {
            String itemNumberFromEDI = decodedValuesInternational.get(40);
            //    System.out.println("itemNumberFromEDI = " + itemNumberFromEDI);
            assertThat(itemNumberFromEDI, is(equalTo("1")));
            String itemNumberFromEDI2 = decodedValuesInternational2.get(40);
            //    System.out.println("itemNumberFromEDI2 = " + itemNumberFromEDI2);
            assertThat(itemNumberFromEDI2, is(equalTo("2")));
        }
    }


    @DisplayName("EDI - Item Quantity - '2'")
    @Test
    public void test67() {

        String itemQuantityFromJson = String.valueOf(osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getQuantity());
        //    System.out.println("itemQuantityFromJson = " + itemQuantityFromJson);
        String itemQuantityFromEDI = decodedValuesInternational.get(41);
        //    System.out.println("itemQuantityFromEDI = " + itemQuantityFromEDI);
        assertThat(itemQuantityFromEDI, is(equalTo(itemQuantityFromJson)));

    }


    @DisplayName("EDI - Item Sku - 'G0062120'")
    @Test
    public void test68() {

        String itemSkuFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getProductCode();
        //    System.out.println("itemSkuFromJson = " + itemSkuFromJson);
        String itemSkuFromEDI = decodedValuesInternational.get(42);
        //    System.out.println("itemSkuFromEDI = " + itemSkuFromEDI);
        assertThat(itemSkuFromEDI, is(equalTo(itemSkuFromJson)));

    }


    @DisplayName("EDI - Item Description - 'COLD WEATHER KIT A/C HSB'")
    @Test
    public void test69() {

        String itemDescriptionFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getDescription();
        //    System.out.println("itemDescriptionFromJson = " + itemDescriptionFromJson);
        String itemDescriptionFromEDI = decodedValuesInternational.get(43);
        //    System.out.println("itemDescriptionFromEDI = " + itemDescriptionFromEDI);
        assertThat(itemDescriptionFromEDI, is(equalTo(itemDescriptionFromJson)));

    }


    @DisplayName("EDI - Item Harmonized Code - '8516808000'")
    @Test
    public void test70() {

        String itemHarmonizedCodeFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getHarmonisedSystemCode();
        //    System.out.println("itemHarmonizedCodeFromJson = " + itemHarmonizedCodeFromJson);
        String itemHarmonizedCodeFromEDI = decodedValuesInternational.get(45);
        //    System.out.println("itemHarmonizedCodeFromEDI = " + itemHarmonizedCodeFromEDI);
        assertThat(itemHarmonizedCodeFromEDI, is(equalTo(itemHarmonizedCodeFromJson)));

    }


    @DisplayName("EDI - Item Value - '1.00'")
    @Test
    public void test71() {

        String itemValueFromJson = String.format("%.2f", osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getValue());
        //    System.out.println("itemValueFromJson = " + itemValueFromJson);
        String itemValueFromEDI = decodedValuesInternational.get(46);
        //    System.out.println("itemValueFromEDI = " + itemValueFromEDI);
        assertThat(itemValueFromEDI, is(equalTo(itemValueFromJson)));

    }


    @DisplayName("EDI - Item Weight - '1.33'")
    @Test
    public void test72() {

        String itemWeightFromJson = String.valueOf(osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getWeight());
        //    System.out.println("itemWeightFromJson = " + itemWeightFromJson);
        String itemWeightFromEDI = decodedValuesInternational.get(47);
        //    System.out.println("itemWeightFromEDI = " + itemWeightFromEDI);
        assertThat(itemWeightFromEDI, is(equalTo(itemWeightFromJson)));

    }


    @DisplayName("EDI - Item Country Of Origin - 'US'")
    @Test
    public void test73() {

        String itemCountryOfOriginFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getCountryOfOrigin();
        //    System.out.println("itemCountryOfOriginFromJson = " + itemCountryOfOriginFromJson);
        String itemCountryOfOriginFromEDI = decodedValuesInternational.get(48);
        //    System.out.println("itemCountryOfOriginFromEDI = " + itemCountryOfOriginFromEDI);
        assertThat(itemCountryOfOriginFromEDI, is(equalTo(itemCountryOfOriginFromJson)));

    }

    @DisplayName("EDI - CategoryOfGoods - ''")
    @Test
    public void test74() {

        if (requestJsonBodyShipments.contains("CATEGORY_OF_GOODS")) {
            String categoryOfGoodsFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getAdditionalValues().get(0).getValue();
            //    System.out.println("categoryOfGoodsFromJson = " + categoryOfGoodsFromJson);
            String categoryOfGoodsFromEDI = decodedValuesInternational.get(49);
            //    System.out.println("categoryOfGoodsFromEDI = " + categoryOfGoodsFromEDI);
            assertThat(categoryOfGoodsFromEDI, is(equalTo(String.valueOf(categoryOfGoodsFromJson))));
        } else {
            String categoryOfGoodsFromJson = "1";
            //    System.out.println("categoryOfGoodsFromJson = " + categoryOfGoodsFromJson);
            String categoryOfGoodsFromEDI = decodedValuesInternational.get(49);
            //    System.out.println("categoryOfGoodsFromEDI = " + categoryOfGoodsFromEDI);
            assertThat(categoryOfGoodsFromEDI, is(equalTo(String.valueOf(categoryOfGoodsFromJson))));
        }
    }


    @DisplayName("EDI - ContentComments - ''")
    @Test
    public void test75() {
        if (requestJsonBodyShipments.contains("CATEGORY_OF_GOODS")) {
            if (osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getAdditionalValues().get(0).getValue() == "6") {
                String contentCommentsFromJson = osmPojoShipments.getShippingUnits().get(0).getShippingUnitItems().get(0).getAdditionalValues().get(1).getValue();
                //    System.out.println("contentCommentsFromJson = " + contentCommentsFromJson);
                String contentCommentsFromEDI = decodedValuesInternational.get(50);
                //    System.out.println("contentCommentsFromEDI = " + contentCommentsFromEDI);
                assertThat(contentCommentsFromEDI, is(equalTo(String.valueOf(contentCommentsFromJson))));
            } else {
                String contentCommentsFromJson = "\"";
                //    System.out.println("contentCommentsFromJson = " + contentCommentsFromJson);
                String contentCommentsFromEDI = decodedValuesInternational.get(50);
                //    System.out.println("contentCommentsFromEDI = " + contentCommentsFromEDI);
                assertThat(contentCommentsFromEDI, is(equalTo(String.valueOf(contentCommentsFromJson))));
            }
        }
    }


    @DisplayName("JSON Body Request")
    @Test
    public void test76() {
        System.out.println("requestJsonBodyShipments = " + requestJsonBodyShipments);

    }


    @DisplayName("JSON Body Response")
    @Test
    public void test77() {
        validateResponseShipments.extract().response().prettyPrint();

    }


}