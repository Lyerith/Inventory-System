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

class InventoryButtonEditor extends AbstractCellEditor implements TableCellEditor {
    private final JPanel panel;
    private final JButton editButton;
    private final JButton deleteButton;
    private final JTable table;

    public InventoryButtonEditor(JTable table) {
        this.table = table;
        panel = new JPanel(new java.awt.FlowLayout());

        editButton = new JButton("Edit");
        deleteButton = new JButton("Delete");

        // Add buttons to the panel
        panel.add(editButton);
        panel.add(deleteButton);

        // Add action listeners for Edit and Delete buttons
        //editButton.addActionListener(e -> editAction());
        deleteButton.addActionListener(e -> deleteAction());
    }

    // Delete Action
    private void deleteAction() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Check if the model has at least one row and one column
        if (model.getRowCount() == 0 || model.getColumnCount() == 0) {
            JOptionPane.showMessageDialog(null, "No data to delete.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int row = table.getSelectedRow();

        // Ensure a row is selected
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Please select an employee to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Ensure the table has enough columns to access the employee ID
        if (model.getColumnCount() > 0) {
            int employeeId = (int) table.getValueAt(row, 0); // Get the employee ID
            System.out.println(employeeId);

            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this employee?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
                    String query = "DELETE FROM employees WHERE employee_id = ?";
                    PreparedStatement pstmt = con.prepareStatement(query);
                    pstmt.setInt(1, employeeId);
                    pstmt.executeUpdate();

                    // Remove the row from the table
                    model.removeRow(row);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error deleting employee: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            fireEditingStopped();  // Stop cell editing
        } else {
            JOptionPane.showMessageDialog(null, "Table has no valid columns.", "Error", JOptionPane.ERROR_MESSAGE);
        }
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
