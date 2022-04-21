package com.logistyx.TEST.OSM.Failing_Mandatory_Fields;

import com.logistyx.utilities.AbstractBaseClasses.OSM.Failing_Mandatory_Fields.OSMBaseMissingPickupAddress;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Missing_PickupAddress111 extends OSMBaseMissingPickupAddress {

    static {
        OSMBaseMissingPickupAddress.shipmentsLabel();
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

