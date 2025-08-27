package com.example.restbooker.client;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthClient {
    public String createToken(String username, String password) {
        Map<String, String> credentials = new HashMap<>();
        credentials.put("username", username);
        credentials.put("password", password);

        return given()
                .contentType("application/json")
                .body(credentials)
                .when()
                .post("/auth")
                .then()
                .statusCode(200)
                .extract()
                .path("token");
    }
}
