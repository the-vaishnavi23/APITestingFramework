package com.example.restbooker.tests;

import com.example.restbooker.client.AuthClient;
import com.example.restbooker.core.BaseTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class AuthNegativeTest extends BaseTest {

    @Test
    public void testInvalidAuth() {
        given()
                .contentType("application/json")
                .body("{\"username\":\"wrong\",\"password\":\"wrong\"}")
        .when()
                .post("/auth")
        .then()
                .statusCode(200)
                .body("reason", equalTo("Bad credentials"));
    }
}
