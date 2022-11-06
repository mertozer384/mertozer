package com.cydeo.day1;

import java.sql.*;

public class FlexibleNavigation {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:oracle:thin:@54.236.150.168:1521:XE" ;
        String username = "hr" ;
        String password = "hr" ;

        Connection conn = DriverManager.getConnection(url,username,password) ;
        // creating statement this way will only allow to
        // get ResultSet that forward only when we executeQuery
//        Statement stmt = conn.createStatement();
        // In order to be able to move through any row in the resultSet
        // with the help of ResultSet navigation methods like next previous absolute
        // we need to create Statement object in below way
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs   = stmt.executeQuery("SELECT * FROM REGIONS") ;
        /*
         * In order to access data in ResultSet object , we need to use cursor navigation methods :
         *
         * next() -move to next row and return true false according to if we have valid row
         * previous() -move to previous row and return true false according to if we have valid row
         * first() - move to first row from anywhere
         * last() - move to last row from anywhere
         * beforeFirst() - move to before first location from anywhere
         * afterLast() - move to after last location from anywhere
         * absolute(8) - move to any row by using row number , for example 8 in this case
         * And more
         * * relative(3) - move 3 row down from current row, -3 will move 3 row up from current row
         * isFirst()  -     check if current row is first row or not
         * isBeforeFirst() -check if currently at beforeFirst location or not
         * isLast()   -     check if current row is last row or not
         * isAfterLast()   -check if currently at AfterLast location or not
         * */

        rs.next() ; // row 1
        System.out.println("rs.next() : "  +  rs.getString("REGION_ID") +" "+ rs.getString("REGION_NAME"));

        rs.last() ; // last row , row 4
        System.out.println("rs.last() : "  +  rs.getString("REGION_ID") +" "+ rs.getString("REGION_NAME"));

        rs.first() ; // row 1
        System.out.println("rs.first() : " + rs.getString("REGION_ID") +" "+ rs.getString("REGION_NAME"));

        rs.absolute(3) ; // row 3
        System.out.println("rs.absolute(3) : " + rs.getString("REGION_ID") +" "+ rs.getString("REGION_NAME"));

        rs.previous() ; // row 2
        System.out.println("rs.previous() : " + rs.getString("REGION_ID") +" "+ rs.getString("REGION_NAME"));

        rs.beforeFirst();  // before first location
//        System.out.println("rs.beforeFirst() : " + rs.getString("REGION_ID") +" "+ rs.getString("REGION_NAME"));
        rs.next() ; // row 1 ;
        rs.afterLast(); // now we are at after last location , nothing is here
        rs.previous() ; // last row , row 4
        System.out.println("rs.previous() : " + rs.getString("REGION_ID") +" "+ rs.getString("REGION_NAME"));

    }

}
