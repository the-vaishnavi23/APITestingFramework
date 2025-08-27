package com.example.restbooker.client;

import com.example.restbooker.model.Booking;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class BookingClient {

    public io.restassured.response.Response createBooking(Booking booking) {
        return given()
                .contentType(ContentType.JSON)
                .body(booking)
                .when()
                .post("/booking");
    }

    public io.restassured.response.Response getBooking(int bookingId) {
        return given()
                .when()
                .get("/booking/" + bookingId);
    }

    public io.restassured.response.Response updateBooking(int bookingId, Booking booking, String token) {
        return given()
                .contentType(ContentType.JSON)
                .header("Cookie", "token=" + token)
                .body(booking)
                .when()
                .put("/booking/" + bookingId);
    }

    public io.restassured.response.Response deleteBooking(int bookingId, String token) {
        return given()
                .header("Cookie", "token=" + token)
                .when()
                .delete("/booking/" + bookingId);
    }
}
