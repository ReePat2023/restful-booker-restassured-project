package com.restful.booker.testbase;


import io.restassured.RestAssured;

import org.junit.BeforeClass;
import utils.TestUtils;

public class TestBase extends TestUtils {
    public static String basePath;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RestAssured.basePath = "/booking";
    }
}
