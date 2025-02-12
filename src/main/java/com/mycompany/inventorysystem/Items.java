/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Items extends javax.swing.JFrame {

    public Items() {
        initComponents();
        setTitle("Add Item");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Item_Category_Label = new javax.swing.JLabel();
        ItemNamelabel = new javax.swing.JLabel();
        Close_Button = new javax.swing.JButton();
        AddItemButton = new javax.swing.JButton();
        ItemNameField = new javax.swing.JTextField();
        CategoryBox = new javax.swing.JComboBox<>();
        ImportItems = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Item_Category_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Item_Category_Label.setText("Item Category:");

        ItemNamelabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ItemNamelabel.setText("Item Name:");

        Close_Button.setText("Close");
        Close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_ButtonActionPerformed(evt);
            }
        });

        AddItemButton.setText("Add Item");
        AddItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemButtonActionPerformed(evt);
            }
        });

        CategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "Furnitures", "School Supplies","Equipments", "Others"}));

        ImportItems.setText("Import Items");
        ImportItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportItemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImportItems)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Close_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemNamelabel)
                            .addComponent(Item_Category_Label))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CategoryBox, 0, 287, Short.MAX_VALUE)
                            .addComponent(ItemNameField))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item_Category_Label)
                    .addComponent(CategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemNamelabel)
                    .addComponent(ItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_Button)
                    .addComponent(AddItemButton)
                    .addComponent(ImportItems))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_ButtonActionPerformed
        dispose();
    }//GEN-LAST:event_Close_ButtonActionPerformed

    private void AddItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemButtonActionPerformed
        String Category = String.valueOf(CategoryBox.getSelectedItem());
        String ItemName = ItemNameField.getText();
        
        if (Category.equals("") && ItemName.equals("")) {
            JOptionPane.showMessageDialog(this, "No Input Added");
        } else if (Category.equals("") || ItemName.equals("")) {
            JOptionPane.showMessageDialog(this, "Missing Credentials");
        } else {
            Connection con = null;
            Statement stmt = null;
            PreparedStatement pstmt = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_system", "root", "");
                stmt = con.createStatement();

                // Insert data into the table
                String sql = "INSERT INTO items (item_name, category) VALUES (?, ?)";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, ItemName);
                pstmt.setString(2, Category);
                pstmt.executeUpdate();
                ItemNameField.setText("");

            } catch (ClassNotFoundException | SQLException e) {

            } finally {
                try {
                    if (pstmt != null) pstmt.close();
                    if (stmt != null) stmt.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_AddItemButtonActionPerformed

    private void ImportItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportItemsActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            importFromExcel(selectedFile);
        }
        dispose();
    }//GEN-LAST:event_ImportItemsActionPerformed
    
    public void importFromExcel(File file) {
        int batchSize = 20;
        Connection connection = null;

        try {
            FileInputStream inputStream = new FileInputStream(file);
            PreparedStatement statement;
            try (Workbook workbook = new XSSFWorkbook(inputStream)) {
                Sheet firstSheet = workbook.getSheetAt(0);
                Iterator<Row> rowIterator = firstSheet.iterator();
                connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                connection.setAutoCommit(false);
                String sql = "INSERT INTO items (item_name, category) VALUES (?, ?)";
                statement = connection.prepareStatement(sql);
                int count = 0;
                rowIterator.next(); // skip the header row
                while (rowIterator.hasNext()) {
                    Row nextRow = rowIterator.next();
                    String name = null;
                    String position = null;
                    
                    for (Cell cell : nextRow) {
                        int columnIndex = cell.getColumnIndex();
                        
                        switch (columnIndex) {
                            case 0 -> {
                                if (cell.getCellType() == CellType.STRING) {
                                    name = cell.getStringCellValue();
                                } else if (cell.getCellType() == CellType.NUMERIC) {
                                    name = String.valueOf(cell.getNumericCellValue());
                                }
                            }
                            case 1 -> {
                                if (cell.getCellType() == CellType.STRING) {
                                    position = cell.getStringCellValue();
                                } else if (cell.getCellType() == CellType.NUMERIC) {
                                    position = String.valueOf(cell.getNumericCellValue());
                                }
                            }
                        }
                    }
                    
                    statement.setString(1, name);
                    statement.setString(2, position);
                    statement.addBatch();
                    
                    if (++count % batchSize == 0) {
                        statement.executeBatch();
                    }
                }
            }
            statement.executeBatch();
            connection.commit();
            connection.close();
        } catch (IOException | SQLException ex1) {
            JOptionPane.showMessageDialog(null, "Error: " + ex1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static DefaultTableModel getAllItemsData() {
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"Item No.", "Item Name", "Item Category", "Actions"}, 0);

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM items ")) {

            while (rs.next()) {
                int id = rs.getInt("item_id");
                String name = rs.getString("item_name");
                String category = rs.getString("category");
                model.addRow(new Object[]{id, name, category, ""});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching inventory data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }
    
    public static DefaultTableModel getFurnituresData() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Furniture No.", "Furniture Name", "Category", "Actions"}, 0);

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM items WHERE category='Furnitures' OR category ='furnitures' OR category='Furniture' OR category='furniture'")) {

            while (rs.next()) {
                int id = rs.getInt("item_id");
                String name = rs.getString("item_name");
                String category = rs.getString("category");
                model.addRow(new Object[]{id, name, category, ""});
            }
        } catch (SQLException e) {
            
        }
        return model;
    }
    
    public static DefaultTableModel getSchoolSuppliesData() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"School Supply No.", "School Supply Name", "Category", "Actions"}, 0);

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM items WHERE category='School Supplies' OR category='School supplies' OR category='school Supplies' OR category='school supplies' or category='SchoolSupplies' OR category='schoolSupplies' OR category='Schoolsupplies' OR category='schoolsupplies' OR category ='School Supply' OR category = 'school supply' OR category = 'Schoolsupply'")) {

            while (rs.next()) {
                int id = rs.getInt("item_id");
                String name = rs.getString("item_name");
                String category = rs.getString("category");
                model.addRow(new Object[]{id, name, category, ""});
            }
        } catch (SQLException e) {
            
        }
        return model;
    }
    
    public static DefaultTableModel getEquipmentsData() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Equipment No.", "Equipment Name", "Category", "Actions"}, 0);

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM items WHERE category='Equipments' OR category='Equipment' OR category='equipments' OR category='equipment'")) {

            while (rs.next()) {
                int id = rs.getInt("item_id");
                String name = rs.getString("item_name");
                String category = rs.getString("category");
                model.addRow(new Object[]{id, name, category, ""});
            }
        } catch (SQLException e) {
            
        }
        return model;
    }
    
    public static DefaultTableModel getOthersData() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"Item No.", "Item Name", "Category", "Actions"}, 0);

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM items WHERE category='Others' OR category='others'OR category='Other' OR category='other'")) {

            while (rs.next()) {
                int id = rs.getInt("item_id");
                String name = rs.getString("item_name");
                String category = rs.getString("category");
                model.addRow(new Object[]{id, name, category, ""});
            }
        } catch (SQLException e) {

        }
        return model;
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Items().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItemButton;
    private javax.swing.JComboBox<String> CategoryBox;
    private javax.swing.JButton Close_Button;
    private javax.swing.JButton ImportItems;
    private javax.swing.JTextField ItemNameField;
    private javax.swing.JLabel ItemNamelabel;
    private javax.swing.JLabel Item_Category_Label;
    // End of variables declaration//GEN-END:variables
    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory_system";
    private static final String USER = "root";
    private static final String PASSWORD = "";
}
