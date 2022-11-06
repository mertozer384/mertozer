package com.cydeo.day1;

import java.sql.*;

public class TestOracleConnection {

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
    }


}
