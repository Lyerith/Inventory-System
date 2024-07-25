package com.mycompany.inventorysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class InventorySystem {

    public static void CheckConnect() {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            createDatabaseIfNotExists("Inventory_System");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    
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

                createEmployeeTable(databaseName);
                createItemsTable(databaseName);
                createInventoryTable(databaseName);
                MainWindow log = new MainWindow();
                log.show();
                
            } else {
                MainWindow log = new MainWindow();
                log.show();
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void createInventoryTable(String databaseName) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL + databaseName, USER, PASSWORD);
            stmt = conn.createStatement();

        String createInventoryTable = "CREATE TABLE IF NOT EXISTS inventory ("
                + "inventory_id INT PRIMARY KEY AUTO_INCREMENT, "
                + "name VARCHAR(255) NOT NULL, "
                + "item VARCHAR(255) NOT NULL, "
                + "description VARCHAR(255) NULL, "
                + "stockno VARCHAR(255) NULL, "
                + "unitmeasure VARCHAR(255) NULL, "
                + "unitvalue VARCHAR(255) NULL, "
                + "balpercard VARCHAR(255) NULL, "
                + "onhandcount VARCHAR(255) NULL, "
                + "quantity VARCHAR(255) NULL, "
                + "value VARCHAR(255) NULL, "
                + "remarks VARCHAR(255) NULL)";
        stmt.executeUpdate(createInventoryTable);
        System.out.println("Table 'inventory' has been created or already exists.");
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        CheckConnect();
    }
}
