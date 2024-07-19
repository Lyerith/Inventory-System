/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User-PC
 */
public class DatabaseCreator {
    
    public static void createDatabaseIfNotExists(String databaseName) {
        
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            stmt = conn.createStatement();

            // Check if the database exists
            String checkDbQuery = "SHOW DATABASES LIKE '" + databaseName + "'";
            var rs = stmt.executeQuery(checkDbQuery);
            if (!rs.next()) {
                // Database does not exist, create it
                String createDbQuery = "CREATE DATABASE " + databaseName;
                stmt.executeUpdate(createDbQuery);
                System.out.println("A new database has been created.");  

                //createEmployeeTable(databaseName);
                //createItemsTable(databaseName);
                
            } else {
                System.out.println("Database Exists");
            }            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.out.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
    public static void createEmployeeTable(String databaseName) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL + databaseName, USER, PASSWORD);
            stmt = conn.createStatement();

            // Create the items table if it does not exist
            String createEmployeeTable = "CREATE TABLE IF NOT EXISTS employees ("
                    + "employee_id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(255) NOT NULL, "
                    + "position VARCHAR(255) NOT NULL)";
            stmt.executeUpdate(createEmployeeTable);
            System.out.println("Table 'employees' has been created or already exists."); 
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.out.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
    public static void createItemsTable(String databaseName) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL + databaseName, USER, PASSWORD);
            stmt = conn.createStatement();

            // Create the items table if it does not exist
            String createItemsTable = "CREATE TABLE IF NOT EXISTS items ("
                    + "item_id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "item_name VARCHAR(255) NOT NULL, "
                    + "category VARCHAR(255) NOT NULL)";
            stmt.executeUpdate(createItemsTable);
            System.out.println("Table 'items' has been created or already exists."); 
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                System.out.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "";
}
