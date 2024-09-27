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
        int row = table.getSelectedRow();
        int InventoryId = (int) table.getValueAt(row, 0);
        
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
                String query = "DELETE FROM inventory WHERE inventory_id = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setInt(1, InventoryId);
                pstmt.executeUpdate();
                // Remove the row from the table
                ((DefaultTableModel) table.getModel()).removeRow(row);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error deleting Item: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
