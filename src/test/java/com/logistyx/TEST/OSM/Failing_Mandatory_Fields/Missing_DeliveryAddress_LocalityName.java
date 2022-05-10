package com.logistyx.TEST.OSM.Failing_Mandatory_Fields;

import com.logistyx.utilities.AbstractBaseClasses.OSM.Failing_Mandatory_Fields.OSMBaseMissingDeliveryAddressLocalityName;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class Missing_DeliveryAddress_LocalityName extends OSMBaseMissingDeliveryAddressLocalityName {

    static {
        OSMBaseMissingDeliveryAddressLocalityName.shipmentsLabel();
    }

    @DisplayName("shipment.Delivery Address")
    @Test
    public void test1() {

        //    validateResponseShipments.extract().response().prettyPrint();
        String errorMessage1 = validateResponseShipments.extract().response().path("InvalidData[0].ValidationMessages[0]");
        //    System.out.println("errorMessage1 = " + errorMessage1);
        assertThat(errorMessage1, is(equalTo("Locality Name is missing or invalid")));

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

