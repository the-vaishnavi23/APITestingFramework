package com.example.restbooker.tests;

import com.example.restbooker.core.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HealthCheckTest extends BaseTest {

    @Test
    public void pingHealthCheck() {
        given()
        .when()
            .get("/ping")
        .then()
            .statusCode(201)
            .body(equalTo("Created"));
    }
}
