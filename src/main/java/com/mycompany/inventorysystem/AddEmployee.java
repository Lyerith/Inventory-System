/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorysystem;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 *
 * @author User-PC
 */
public class AddEmployee extends javax.swing.JFrame {

    public AddEmployee() {
        initComponents();
        setTitle("Add Employee");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmployeeNameField = new javax.swing.JTextField();
        Employee_Name_Label = new javax.swing.JLabel();
        Employee_Position_Label = new javax.swing.JLabel();
        EmployeePositionField = new javax.swing.JTextField();
        Close_Button = new javax.swing.JButton();
        AddEmployeeButton = new javax.swing.JButton();
        ImportEmployees = new javax.swing.JButton();
        Employee_Position_Label1 = new javax.swing.JLabel();
        EmployeeDesignationField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Employee_Name_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Employee_Name_Label.setText("Employee Name");

        Employee_Position_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Employee_Position_Label.setText("Employee Position");

        Close_Button.setText("Close");
        Close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_ButtonActionPerformed(evt);
            }
        });

        AddEmployeeButton.setText("Add Employee");
        AddEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeButtonActionPerformed(evt);
            }
        });

        ImportEmployees.setText("Import Employees");
        ImportEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportEmployeesActionPerformed(evt);
            }
        });

        Employee_Position_Label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Employee_Position_Label1.setText("Employee Designation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Employee_Position_Label)
                            .addComponent(Employee_Name_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeePositionField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImportEmployees)
                            .addComponent(Employee_Position_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AddEmployeeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Close_Button))
                            .addComponent(EmployeeDesignationField))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Employee_Name_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Employee_Position_Label)
                    .addComponent(EmployeePositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Employee_Position_Label1)
                    .addComponent(EmployeeDesignationField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_Button)
                    .addComponent(AddEmployeeButton)
                    .addComponent(ImportEmployees))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_ButtonActionPerformed
        dispose();
    }//GEN-LAST:event_Close_ButtonActionPerformed

    private void AddEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeButtonActionPerformed
        
        String employee = EmployeeNameField.getText();
        String position = EmployeePositionField.getText();
        String designation = EmployeeDesignationField.getText();

        if (employee.equals("") && position.equals("")) {
            JOptionPane.showMessageDialog(this, "No Input Added");
        } else if (employee.equals("") || position.equals("")) {
            JOptionPane.showMessageDialog(this, "Missing Credentials");
        } else {
            Connection con = null;
            Statement stmt = null;
            PreparedStatement pstmt = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_system", "root", "");
                    stmt = con.createStatement();
                    String sql = "INSERT INTO employees (name, position, designation) VALUES (?, ?, ?)";
                    pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, employee);
                    pstmt.setString(2, position);
                    pstmt.setString(3, designation);
                    pstmt.executeUpdate();
                    EmployeeNameField.setText("");
                    EmployeePositionField.setText("");
                    EmployeeDesignationField.setText("");
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    }//GEN-LAST:event_AddEmployeeButtonActionPerformed
    
    public static DefaultTableModel getEmployeeData() {
    DefaultTableModel model = new DefaultTableModel(new String[]{"Employee ID","Employee Name", "Employee Position", "Employee Designation", "Actions"}, 0);

    try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

        while (rs.next()) {
            int id = rs.getInt("employee_id");
            String name = rs.getString("name");
            String position = rs.getString("position");
            String designation = rs.getString("designation");
            
            // Add row with data and placeholder for "Actions" column
            model.addRow(new Object[]{id, name, position, designation, ""});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error fetching employee data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return model;
}
    
    private void ImportEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportEmployeesActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            importFromExcel(selectedFile);
        }
        dispose();
    }//GEN-LAST:event_ImportEmployeesActionPerformed
    
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
                String sql = "INSERT INTO employees (name, position) VALUES (?, ?)";
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

        } catch (IOException ex1) {
            JOptionPane.showMessageDialog(this, "Error reading file");
        } catch (SQLException ex2) {
            JOptionPane.showMessageDialog(this, "Database Error");
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddEmployee().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployeeButton;
    private javax.swing.JButton Close_Button;
    private javax.swing.JTextField EmployeeDesignationField;
    private javax.swing.JTextField EmployeeNameField;
    private javax.swing.JTextField EmployeePositionField;
    private javax.swing.JLabel Employee_Name_Label;
    private javax.swing.JLabel Employee_Position_Label;
    private javax.swing.JLabel Employee_Position_Label1;
    private javax.swing.JButton ImportEmployees;
    // End of variables declaration//GEN-END:variables
    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory_system";
    private static final String USER = "root";
    private static final String PASSWORD = "";
}
