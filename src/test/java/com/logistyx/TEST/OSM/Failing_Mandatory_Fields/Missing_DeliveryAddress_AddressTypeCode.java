package com.logistyx.TEST.OSM.Failing_Mandatory_Fields;

import com.logistyx.utilities.AbstractBaseClasses.OSM.Failing_Mandatory_Fields.OSMBaseEmptyPickupAddressAddressTypeCode;
import com.logistyx.utilities.AbstractBaseClasses.OSM.Failing_Mandatory_Fields.OSMBaseMissingDeliveryAddressAddressTypeCode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class Missing_DeliveryAddress_AddressTypeCode extends OSMBaseMissingDeliveryAddressAddressTypeCode {

    static {
        OSMBaseMissingDeliveryAddressAddressTypeCode.shipmentsLabel();
    }

    @DisplayName("shipment.Delivery Address")
    @Test
    public void test1() {

        //    validateResponseShipments.extract().response().prettyPrint();
        String errorMessage1 = validateResponseShipments.extract().response().path("InvalidData[0].ValidationMessages[0]");
        //    System.out.println("errorMessage1 = " + errorMessage1);
        assertThat(errorMessage1, is(equalTo("Delivery Address must be provided")));

    }

    @DisplayName("JSON Body Request")
    @Test
    public void test2() {
        System.out.println("requestJsonBodyShipments = " + requestJsonBodyShipments);
    }


    @DisplayName("JSON Body Response")
    @Test
    public void test3() {
        validateResponseShipments.extract().response().prettyPrint();
    }


}
