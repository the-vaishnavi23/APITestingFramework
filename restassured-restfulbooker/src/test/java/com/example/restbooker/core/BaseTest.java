package com.example.restbooker.core;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected static Properties config;

    @BeforeClass
    public void setup() throws IOException {
        config = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/config/dev.properties");
        config.load(fis);

        RestAssured.baseURI = config.getProperty("baseUrl");

        if (Boolean.parseBoolean(config.getProperty("requestLogging"))) {
            RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        }
    }

    public String getUsername() {
        return config.getProperty("username");
    }

    public String getPassword() {
        return config.getProperty("password");
    }
}
