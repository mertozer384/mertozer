package com.cydeo.day2;

import java.sql.*;

public class Library2DB_Test {

    public static void main(String[] args) throws SQLException {

    /**
     * How to connect to MySQL Database (Library2 App)
     * JDBC -> MySQL Driver -> YourCode to connect
     *
     * 1. Add MySQL Driver Dependency and reload maven
     *
     *  <dependency>
     *     <groupId>mysql</groupId>
     *     <artifactId>mysql-connector-java</artifactId>
     *     <version>8.0.28</version>
     *  </dependency>
     *
     * 2. Provide Library2 DB jdbc url,username,password
     * 3. Create connection using getConnection method
     * 4. Create statement using connection object
     * 5. get ResultSet by executing query : select * from books
     *    6. ignore if IntelliJ shows red on String query
     *    7. THERE CAN NOT BE A SYNTAX ERROR IN JAVA STRING
     * 8. Iterate over the ResultSet object and print out books name
     */

        String url = "jdbc:mysql://34.230.35.214:3306/library2";
        String username = "library2_client";
        String password = "6s2LQQTjBcGFfDhY" ;

        Connection conn = DriverManager.getConnection(url,username,password);
        Statement stmt  = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs    = stmt.executeQuery("SELECT * FROM books") ;

//        while(rs.next() ){
//            System.out.println("rs.getString(\"name\") = "
//                    + rs.getString("name"));
//        }
        // print out the first book name
        rs.next() ; // row 1
        System.out.println("rs.getString(\"name\") = " + rs.getString("name"));

        // WHAT IF NOW I WANT TO RUN THIS QUERY : SELECT COUNT(*) FROM books
        // JUST CALL THE stmt.executeQuery again and save the result
        // into rs variable or new variable with type ResultSet
        rs =  stmt.executeQuery("SELECT COUNT(*) AS BOOK_COUNT FROM books") ;
        // move to first row
        rs.next() ;
        System.out.println("rs.getString(\"BOOK_COUNT\") = "
                + rs.getString("BOOK_COUNT"));

        // Can I not overwrite previous ResultSet object and save it into new ResultSet variable
        // YES YOU CAN !
        ResultSet rs2 =  stmt.executeQuery("SELECT * from users") ;
        // do your thing here

    }


}
