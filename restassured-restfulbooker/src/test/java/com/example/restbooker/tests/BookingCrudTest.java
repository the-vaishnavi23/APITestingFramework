package com.example.restbooker.tests;

import com.example.restbooker.client.BookingClient;
import com.example.restbooker.model.Booking;
import com.example.restbooker.model.BookingDates;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingCrudTest {

    @Test
    public void testCreateBooking() {
        BookingDates dates = new BookingDates();
        dates.setCheckin("2025-08-01");
        dates.setCheckout("2025-08-10");

        Booking booking = new Booking();
        booking.setFirstname("John");
        booking.setLastname("Doe");
        booking.setTotalprice(123);
        booking.setDepositpaid(true);
        booking.setBookingdates(dates);
        booking.setAdditionalneeds("Breakfast");

        BookingClient client = new BookingClient();
        var response = client.createBooking(booking);

        response.then().statusCode(200);
        Assert.assertNotNull(response.jsonPath().get("bookingid"));
    }
}
