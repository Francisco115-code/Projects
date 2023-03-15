
package com.example.demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

public class LoginRegistrationSQLDriverDB {

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:3306;databaseName=Employee_Registration";
        String username = "root";
        String password = "password";

        try {
            // Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement stmt = connection.createStatement();
            System.out.println("Connected to MYSQL Server Oracle.");

        } catch (SQLException ex) {
            Logger.getLogger(LoginRegistrationSQLDriverDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Oops, there's an error:");
            ex.printStackTrace();
        }
    }

}
