package com.cybertek.tests.day12_api_authentication;

import com.cybertek.tests.SpartanTestBase;
import com.cybertek.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

public class SpartanWithAuthTest {

    @BeforeAll
    public static void init() {
        baseURI = ConfigurationReader.getProperty("spartan.auth.url");
    }

    /**
     * Given accept type is json
     * and basic auth credentials are "admin" , "admin"
     * When I send get request to "/api/spartans"
     * Then status code is 200
     * and content type is json
     * And json response should have Spartan list
     */
    @Test
    public void adminGetAllSpartans() {
       List<Integer> allIds = given().accept(ContentType.JSON)
                .and().auth().basic("admin","admin")
                .when().get("/api/spartans")
                .then().assertThat().statusCode(200)
                .and().contentType(ContentType.JSON)
                //.and().body("id", isA(List.class)).log().all();
                .and().extract().body().path("id");
        //check if the result of "id" path returns a List
        System.out.println("allIds.size() = " + allIds.size());
        System.out.println("allIds = " + allIds);
    }
    /**
     * Given accept type is json
     * and no credentials
     * When I send get request to "/api/spartans"
     * Then status code is 401
     * and content type is json
     * And json response should have "message": "Unauthorized"
     */
    @Test
    public void noAuthGetSpartansNegativeTest() {
        given().accept(ContentType.JSON)
                .when().get("/api/spartans")
                .then().assertThat().statusCode(401)
                .and().contentType(ContentType.JSON)
                .and().body("message" , is("Unauthorized"));
    }

}
