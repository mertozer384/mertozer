package com.bookit.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BookitUtils {


    public static String generateToken(String email, String password){

        Response response = given()
                .accept(ContentType.JSON)
                .queryParam("email", email)
                .and()
                .queryParam("password", password)
                .when().get(ConfigurationReader.get("base_url") + "/sign");

        String token = "Bearer " +response.path("accessToken");

        return token;
    }

    //hw
    //create method that accepts String like "teacher", "student-leader","student-member"
    // you will get one valid email and password for each from configuration.properties
    //and return valid token
}
