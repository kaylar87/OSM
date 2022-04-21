package com.logistyx.TEST.OSM.Per_Package_Cases;

import com.logistyx.utilities.AbstractBaseClasses.OSM.Origins_Destinations.Domestic.Negative.OSMBaseBoundPrintedMatterNotDGFailingInternational;
import com.logistyx.utilities.AbstractBaseClasses.OSM.Per_Package_Cases.OSMBasePost123Get;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class Post_1_2_3_Get extends OSMBasePost123Get {

    static {
        OSMBasePost123Get.shipmentsLabel();
    }


    @DisplayName("JSON Body Request")
    @Test
    public void test1() {
        System.out.println("requestJsonBodyShipments = " + requestJsonBodyShipments);
    }

    @DisplayName("JSON Body Response")
    @Test
    public void test2() {
        validateResponseShipments.extract().response().prettyPrint();
    }


    @DisplayName("JSON Body Request 1")
    @Test
    public void test3() {
        System.out.println("requestJsonBodyShipments1 = " + requestJsonBodyShipments1);
    }

    @DisplayName("JSON Body Response 1")
    @Test
    public void test4() {
        validateResponseShipments1.extract().response().prettyPrint();
    }


    @DisplayName("JSON Body Request 2")
    @Test
    public void test5() {
        System.out.println("requestJsonBodyShipments2 = " + requestJsonBodyShipments2);
    }

    @DisplayName("JSON Body Response 2")
    @Test
    public void test6() {
        validateResponseShipments2.extract().response().prettyPrint();
    }


    @DisplayName("JSON Body Response Post")
    @Test
    public void test7() {
        validateResponseShipmentsPOST.extract().response().prettyPrint();
    }


}
