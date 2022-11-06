package com.cydeo.day2;

import com.cydeo.utility.DB_Util;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LibraryDashboardTest {


    @Test
    public void testDashboardBookCount(){

        // Dashboard numbers are previously not matching the database numbers
        // the test is meant to check
        // the actual results from dashboard page matches database results

        // DO YOUR UI THING HERE AND GET THE ACTUAL COUNT
        // We will just hard code it for now
        int actualBookCount = 973 ;

        // expected result we can get from running this query
        // SELECT COUNT(*) AS BOOK_COUNT FROM books
        String url = "jdbc:mysql://34.230.35.214:3306/library2";
        String username = "library2_client";
        String password = "6s2LQQTjBcGFfDhY" ;

        DB_Util.createConnection(url, username, password);
        DB_Util.runQuery("SELECT COUNT(*) AS BOOK_COUNT FROM books");
        int expectedResult =  Integer.parseInt( DB_Util.getFirstRowFirstColumn() )  ;

        //import static org.testng.Assert.assertEquals;
        assertEquals(actualBookCount, expectedResult) ;

        // destroy your connection
        DB_Util.destroy();
    }


    @Test
    public void testDashboardUserCount(){

        // actual result , get it by actually automating this and getting the text of element
        int actualUserCount = 141 ;

        // expected result we can get from running this query
        // SELECT COUNT(*) AS USER_COUNT FROM users
        String url = "jdbc:mysql://34.230.35.214:3306/library2";
        String username = "library2_client";
        String password = "6s2LQQTjBcGFfDhY" ;

        DB_Util.createConnection(url, username, password);
        DB_Util.runQuery("SELECT COUNT(*) AS USER_COUNT FROM users");
        int expectedResult =  Integer.parseInt( DB_Util.getFirstRowFirstColumn() )  ;

        // assert
        assertEquals(actualUserCount, expectedResult) ;

        // clean up the connection
        DB_Util.destroy();

    }


}
