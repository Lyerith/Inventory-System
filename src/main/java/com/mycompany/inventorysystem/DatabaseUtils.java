/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DatabaseUtils {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/Inventory_System";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static DefaultTableModel getEmployeeData() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Name", "Position"}, 0);

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                model.addRow(new Object[]{id, name, position});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return model;
    }
}