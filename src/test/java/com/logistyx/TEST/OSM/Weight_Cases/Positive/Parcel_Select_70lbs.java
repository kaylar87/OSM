package com.logistyx.TEST.OSM.Weight_Cases.Positive;


import com.logistyx.utilities.AbstractBaseClasses.OSM.Weight_Cases.Positive.OSMBaseParcelSelectNotDG70lbs;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Parcel_Select_70lbs extends OSMBaseParcelSelectNotDG70lbs {

    static {

        OSMBaseParcelSelectNotDG70lbs.shipmentsLabel();

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
