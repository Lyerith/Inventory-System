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

class ItemsButtonEditor extends AbstractCellEditor implements TableCellEditor {
    private final JPanel panel;
    private final JButton editButton;
    private final JButton deleteButton;
    private final JTable table;

    public ItemsButtonEditor(JTable table) {
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
    int itemId = (int) table.getValueAt(row, 0); // Assuming item ID is in the first column
    
    // Existing item details
    String currentItemName = (String) table.getValueAt(row, 1);  // Item name in the second column
    String currentItemCategory = (String) table.getValueAt(row, 2);  // Item category in the third column
    
    // Create input fields for item name and item category
    JTextField nameField = new JTextField(currentItemName);
    JTextField categoryField = new JTextField(currentItemCategory);
    
    // Create the panel to hold the input fields
    JPanel panel = new JPanel(new GridLayout(0, 1));
    panel.add(new JLabel("Edit Item Name:"));
    panel.add(nameField);
    panel.add(new JLabel("Edit Item Category:"));
    panel.add(categoryField);
    
    // Show input dialog
    int result = JOptionPane.showConfirmDialog(null, panel, "Edit Item", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
        String updatedName = nameField.getText();
        String updatedCategory = categoryField.getText();
        
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
            // Update the item details in the database
            String query = "UPDATE items SET item_name = ?, category = ? WHERE item_id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, updatedName);
            pstmt.setString(2, updatedCategory);
            pstmt.setInt(3, itemId);
            pstmt.executeUpdate();
            
            // Update the table data to reflect the changes
            table.setValueAt(updatedName, row, 1);  // Update item name in table
            table.setValueAt(updatedCategory, row, 2);  // Update item category in table
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error updating item: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    fireEditingStopped();  // Stop cell editing
}


    // Delete Action
    private void deleteAction() {
        int row = table.getSelectedRow();
        int ItemId = (int) table.getValueAt(row, 0);
        
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this item?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
                String query = "DELETE FROM items WHERE item_id = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setInt(1, ItemId);
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
