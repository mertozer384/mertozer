package com.cydeo.day1;

import java.sql.*;

public class SimpleNavigation {

    public static void main(String[] args) throws SQLException {

        // Step 1 : Create Connection by providing Connection information
        // this connection jdbc url , also known as connection string
        // syntax look like this jdbc:DataBaseType:subprotocol:@Host:port:SID
        // PLEASE REPLACE THIS IP WITH YOUR OWN WORKING EC2 SERVER IP!!
        String url = "jdbc:oracle:thin:@54.236.150.168:1521:XE" ;
        String username = "hr" ;
        String password = "hr" ;

        // now JDBC Provide utility class called DriverManager with many methods
        // the getConnection method accept 3 parameters url , username, password
        // according this information ,
        // it will first look for the driver of the database type you are connecting to
        // once it's found , use the rest of connection information like
        //          host ip , username password , port , sid to make connection
        // MAKE SURE YOUR CONNECTION WORKS MANUALLY ,
        // ANYTHING THAT DOES NOT WORK MANUALLY WILL NOT WORK WITH AUTOMATION

        Connection conn = DriverManager.getConnection(url, username, password) ;
        System.out.println("Successfully Connected");

        // Once we have the connection , now we use this connection object to create statement object
        Statement stmt = conn.createStatement() ;

        // Once we have Statement object , now we can execute query to get ResultSet
        //  It stores the query result
        // It uses iterator to move through the rows using cursor
        // to hold position of where it's currently at
        ResultSet rs = stmt.executeQuery("SELECT * FROM REGIONS") ;
        // By default , the cursor(pointer) of the ResultSet object is at
        // a location known as BeforeFirst , basically right before the first row
        // in order to get to the first row, you need to call next() method
        // next method move your pointer to next row
        // it will return true if there is valid next row
        // false if there is no more valid row
        rs.next() ; // now we are at first row

        // The resulting data has two column REGION_ID , REGION_NAME
        // In order to access the cell value ,
        // we can use getX(X here is data type) method that accept 1 parameter
        // either using column name or using 1 based index
        // getString , getInt , getDouble and so on we will be just using getString for now
        System.out.println("rs.getString(\"REGION_ID\") = "
                        + rs.getString("REGION_ID"));
        System.out.println("rs.getString(\"REGION_NAME\") = "
                        + rs.getString("REGION_NAME"));
        // you can also column index
        System.out.println("rs.getString(1) = " + rs.getString(1));
        System.out.println("rs.getString(2) = " + rs.getString(2));

        // now we want to move to next row
        rs.next() ; // Now we are at 2nd row
        System.out.println("rs.getString(\"REGION_ID\") = "
                                + rs.getString("REGION_ID"));
        System.out.println("rs.getString(\"REGION_NAME\") = "
                                + rs.getString("REGION_NAME"));

        // now we want to move to next row
        rs.next() ; // Now we are at 3rd row
        System.out.println("rs.getString(\"REGION_ID\") = "
                                + rs.getString("REGION_ID"));
        System.out.println("rs.getString(\"REGION_NAME\") = "
                                + rs.getString("REGION_NAME"));

        // now we want to move to next row
        rs.next() ; // Now we are at 4th row
        System.out.println("rs.getString(\"REGION_ID\") = "
                                + rs.getString("REGION_ID"));
        System.out.println("rs.getString(\"REGION_NAME\") = "
                                + rs.getString("REGION_NAME"));

        // we are currently at last row and rs.next will return false if called again
        System.out.println("rs.next() = " + rs.next() );
        // now try to get the cell value ??? NO ! WE ARE AT AFTER LAST ROW
//        System.out.println("rs.getString(\"REGION_NAME\") = "
//                + rs.getString("REGION_NAME"));

    }


}
