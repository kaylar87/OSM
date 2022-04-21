package com.logistyx.TEST.OSM.Failing_Mandatory_Fields;

import com.logistyx.utilities.AbstractBaseClasses.OSM.Failing_Mandatory_Fields.OSMBaseMissingGrossWeight;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class Missing_GrossWeight111 extends OSMBaseMissingGrossWeight {

    static {
        OSMBaseMissingGrossWeight.shipmentsLabel();
    }


    @DisplayName("shipment.ShippingUnits[0].GrossWeight")
    @Test
    public void test1() {

        //    validateResponseShipments.extract().response().prettyPrint();
        String errorMessage1 = validateResponseShipments.extract().response().path("InvalidData[0].ValidationMessages[0]");
        //    System.out.println("errorMessage1 = " + errorMessage1);
        assertThat(errorMessage1, is(equalTo("Received  - Expected a Forwarder Division Code from the list of supported Forwarder Divisions.")));

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

