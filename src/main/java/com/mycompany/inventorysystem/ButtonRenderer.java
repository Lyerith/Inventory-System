/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.Component;

class ButtonRenderer extends JPanel implements TableCellRenderer {

    public ButtonRenderer() {
        // Add two buttons (Edit and Delete)
        setLayout(new java.awt.FlowLayout());
        add(new JButton("Edit"));
        add(new JButton("Delete"));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this; // Return the panel with buttons
    }
}