//18. Write a program to generate SQLException
package com.exceptions;

import java.sql.*;

public class Test18 {

  public static void main(String[] args) {

    try {
      // Attempt to connect to a non-existent database
      String url = "jdbc:mysql://localhost:3306/nonexistentdb";
      Connection connection = DriverManager.getConnection(url, "root", "password");
    } catch (SQLException e) {
      System.out.println("Exception caught: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
