package com.logistyx.TEST.OSM.Track_And_Trace.Negative;


import com.logistyx.utilities.AbstractBaseClasses.OSM.Track_And_Trace.Negative.OSMBaseGlobalPriorityePacketTrackFalseFailing;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class Global_Priority_ePacket_Track_False_Failing extends OSMBaseGlobalPriorityePacketTrackFalseFailing {

    static {

        OSMBaseGlobalPriorityePacketTrackFalseFailing.shipmentsLabel();

    }


    @DisplayName("shipment.TrackAndTrace")
    @Test
    public void test1() {

        //    validateResponseShipments.extract().response().prettyPrint();
        String errorMessage1 = validateResponseShipments.extract().response().path("InvalidData[0].ValidationMessages[0]");
        //    System.out.println("errorMessage1 = " + errorMessage1);
        assertThat(errorMessage1, is(equalTo("Unsupported feature requested - TrackAndTrace: False")));
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
