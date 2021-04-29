// Francisco Guzman Toray Warren
// CSC 485: Database Implementation: Final 
// Java Front End Connection with Restuarant Database from SQL
package restuarantdatabase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

public class RestuarantDatabase {

    
public static void main(String[] args) {
 // Actual login info changed for privacy   
String url ="jdbc:sqlserver://hostname:1433;databseName=Resturant";
String username = "username";
String password = "password"; 

try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement stmt = connection.createStatement( );
            System.out.println("Connected to Microsoft SQL Server.");
            
        } catch (SQLException ex) {
            Logger.getLogger(RestuarantDatabase.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Oops, there's an error:"); 
            ex.printStackTrace();
        }
    
    // Employee Data Insertion
    Scanner scan = new Scanner(System.in);
            int SSN;
            String Fname, Mname, Lname, employeeAddress;
          
            //Enter New Information of the Employee
            System.out.println("Enter New Employee SSN");
            SSN = scan.nextInt();
            
            while(!scan.hasNextInt()){
                System.out.println("This is not a valid SSN!");
                scan.next();
            }
           
            
            System.out.println("Enter Employee Firstname:");
            Fname = scan.next();
            
            System.out.println("Enter Employee Middlename:");
            Mname = scan.next();
            
            System.out.println("Enter Employee Lastname:");
            Lname = scan.next();
            
            System.out.println("Enter Employee Address:");
            employeeAddress = scan.next();
            
   try {
        //insert data into a table of a database/schema
        String insertq= "INSERT INTO EMPLOYEE2(SSN, Fname,"
                + "Mname, Lname, Employee_Address)"
                + " values ('"+SSN+ "','"+Fname+"','"+Mname+ "','"+Lname+ "', "
                            + "'"+employeeAddress+" ')"; 
        Connection connection = DriverManager.getConnection(url, username, password);
       PreparedStatement insertst = connection.prepareStatement(insertq);
       insertst.executeUpdate();
            }catch (SQLException ex){
            }
            finally{ 
                System.out.println("The record has been created and inserted");
            }
        
   Scanner scan1 = new Scanner(System.in);
   int Customer_ID;
   String customerFname, customerLname, Customer_Address;
   
     // Enter New Informatiom for Customer
     System.out.println("Enter New Customer ID");
            Customer_ID = scan1.nextInt();
            
            while(!scan.hasNextInt()){
                System.out.println("This is not a valid Customer_ID!");
                scan1.nextInt();
            }
           
            
            System.out.println("Enter Customer Firstname:");
            customerFname = scan1.next();
            
            
            System.out.println("Enter Customer Lastname:");
            customerLname = scan.next();
            
            System.out.println("Enter Customer Address:");
            Customer_Address = scan1.next();
            
            try {
        //insert data into a table of a database/schema
        String insertq= "INSERT INTO CUSTOMER2(SSN, Fname,"
                + "Mname, Lname, Employee_Address)"
                + " values ('"+Customer_ID+ "','"+customerFname+"','"+customerLname+ "', "
                            + "'"+Customer_Address+" ')"; 
        Connection connection = DriverManager.getConnection(url, username, password);
       PreparedStatement insertst = connection.prepareStatement(insertq);
       insertst.executeUpdate();
            }catch (SQLException ex){
            }
            finally{ 
                System.out.println("The record has been created and inserted");
            }
    } 
}



            
