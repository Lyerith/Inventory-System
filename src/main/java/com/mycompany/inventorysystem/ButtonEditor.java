/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.Component;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

class ButtonEditor extends AbstractCellEditor implements TableCellEditor {
    private final JPanel panel;
    private final JButton editButton;
    private final JButton deleteButton;
    private final JTable table;

    public ButtonEditor(JTable table) {
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
        int employeeId = (int) table.getValueAt(row, 0); // Get the employee ID
        
        // Edit logic here, e.g., prompt the user to edit the employee name
        String updatedName = JOptionPane.showInputDialog("Edit Name:", table.getValueAt(row, 1));
        if (updatedName != null) {
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
                String query = "UPDATE employees SET name = ? WHERE employee_id = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, updatedName);
                pstmt.setInt(2, employeeId);
                pstmt.executeUpdate();

                // Update the table data
                table.setValueAt(updatedName, row, 1);
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
