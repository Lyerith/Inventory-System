/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.Component;
import java.awt.GridLayout;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

class EmployeeButtonEditor extends AbstractCellEditor implements TableCellEditor {
    private final JPanel panel;
    private final JButton editButton;
    private final JButton deleteButton;
    private final JTable table;

    public EmployeeButtonEditor(JTable table) {
        this.table = table;
        panel = new JPanel(new java.awt.FlowLayout());

        editButton = new JButton("Edit");
        deleteButton = new JButton("Delete");

        // Add buttons to the panel
        panel.add(editButton);
        panel.add(deleteButton);

        // Add action listeners for Edit and Delete buttons
        editButton.addActionListener(e -> editAction());
        deleteButton.addActionListener(e -> deleteAction());
    }

    // Edit Action
    private void editAction() {
        int row = table.getSelectedRow();
        int employeeId = (int) table.getValueAt(row, 0); // Assuming employee ID is in the first column

        // Existing employee details
        String currentName = (String) table.getValueAt(row, 1);  // Name in the second column
        String currentPosition = (String) table.getValueAt(row, 2);  // Position in the third column
        String currentDesignation = (String) table.getValueAt(row, 3);  // Designation in the fourth column

        // Create input fields for name, position, and designation
        JTextField nameField = new JTextField(currentName);
        JTextField positionField = new JTextField(currentPosition);
        JTextField designationField = new JTextField(currentDesignation);

        // Create the panel to hold the input fields
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Edit Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Edit Position:"));
        panel.add(positionField);
        panel.add(new JLabel("Edit Designation:"));
        panel.add(designationField);

        // Show input dialog
        int result = JOptionPane.showConfirmDialog(null, panel, "Edit Employee", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            String updatedName = nameField.getText();
            String updatedPosition = positionField.getText();
            String updatedDesignation = designationField.getText();

            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
                // Update the employee details in the database
                String query = "UPDATE employees SET name = ?, position = ?, designation = ? WHERE employee_id = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, updatedName);
                pstmt.setString(2, updatedPosition);
                pstmt.setString(3, updatedDesignation);
                pstmt.setInt(4, employeeId);
                pstmt.executeUpdate();

                // Update the table data to reflect the changes
                table.setValueAt(updatedName, row, 1);  // Update name in table
                table.setValueAt(updatedPosition, row, 2);  // Update position in table
                table.setValueAt(updatedDesignation, row, 3);  // Update designation in table
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error updating employee: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        fireEditingStopped();  // Stop cell editing
    }

    // Delete Action
    private void deleteAction() {
        int row = table.getSelectedRow();
        int employeeId = (int) table.getValueAt(row, 0); // Get the employee ID
        
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this employee?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
                String query = "DELETE FROM employees WHERE employee_id = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setInt(1, employeeId);
                pstmt.executeUpdate();

                // Remove the row from the table
                ((DefaultTableModel) table.getModel()).removeRow(row);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error deleting employee: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        fireEditingStopped();  // Stop cell editing
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return panel;  // Return the panel with buttons
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory_system";
    private static final String USER = "root";
    private static final String PASSWORD = "";
}
