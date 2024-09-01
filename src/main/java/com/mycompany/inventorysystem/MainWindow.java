/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.table.TableModel;


public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        setTitle("Inventory System");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonsPanel = new javax.swing.JPanel();
        Inventory_Button = new javax.swing.JButton();
        Employee_Button = new javax.swing.JButton();
        Items_Button = new javax.swing.JButton();
        Home_Button = new javax.swing.JButton();
        Tabs = new javax.swing.JTabbedPane();
        HomePage = new javax.swing.JPanel();
        EmployeeDropdownBox1 = new javax.swing.JComboBox<>();
        ChooseEmployeeLabel1 = new javax.swing.JLabel();
        AllItemsPane2 = new javax.swing.JScrollPane();
        EmployeeItems = new javax.swing.JTable();
        EmployeeDropdownBox2 = new javax.swing.JComboBox<>();
        DetailsLabel = new javax.swing.JLabel();
        Employee_Namelabel = new javax.swing.JLabel();
        EmployeePositionLabel = new javax.swing.JLabel();
        EmployeeDesignationLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        NameTextfield = new javax.swing.JTextField();
        PositionTextField = new javax.swing.JTextField();
        DesignationTextField = new javax.swing.JTextField();
        Employee_Namelabel1 = new javax.swing.JLabel();
        EmployeeItemsLabel = new javax.swing.JLabel();
        RecentlyAddedTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        recentaddedlabel = new javax.swing.JLabel();
        Close_Button3 = new javax.swing.JButton();
        NewEmployeeButton = new javax.swing.JButton();
        Export_Button3 = new javax.swing.JButton();
        InventoryPanel = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        AllItems = new javax.swing.JScrollPane();
        AllItemsInventory = new javax.swing.JTable();
        Furnitures = new javax.swing.JScrollPane();
        FurnituresInventory = new javax.swing.JTable();
        SchoolSupplies = new javax.swing.JScrollPane();
        SchoolSuppliesInventory = new javax.swing.JTable();
        Equipment = new javax.swing.JScrollPane();
        EquipmentInventory = new javax.swing.JTable();
        Others = new javax.swing.JScrollPane();
        OthersInventory = new javax.swing.JTable();
        ChooseEmployeeLabel = new javax.swing.JLabel();
        EmployeeDropdownBox = new javax.swing.JComboBox<>();
        InventoryExport_Button = new javax.swing.JButton();
        Close_Button = new javax.swing.JButton();
        InsertDataButton = new javax.swing.JButton();
        EmployeePanel = new javax.swing.JPanel();
        AddEmployeeButton = new javax.swing.JButton();
        SearchBar = new javax.swing.JTextField();
        EmployeeExport_Button = new javax.swing.JButton();
        Close_Button1 = new javax.swing.JButton();
        SearchEmployeeLabel = new javax.swing.JLabel();
        Search_Employee_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        ItemsPanel = new javax.swing.JPanel();
        SearchEmployeeLabel1 = new javax.swing.JLabel();
        ItemSearchBar = new javax.swing.JTextField();
        Add_Item_Button = new javax.swing.JButton();
        Export_Button2 = new javax.swing.JButton();
        Close_Button2 = new javax.swing.JButton();
        Search_Item_Button = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AllItemsPane = new javax.swing.JScrollPane();
        AllItemsTable = new javax.swing.JTable();
        FurnituresPane = new javax.swing.JScrollPane();
        FurnituresTable = new javax.swing.JTable();
        SchoolSuppliesPane = new javax.swing.JScrollPane();
        SchoolSuppliesTable = new javax.swing.JTable();
        EquipmentsPane = new javax.swing.JScrollPane();
        EquipmentsTable = new javax.swing.JTable();
        OthersPane = new javax.swing.JScrollPane();
        OthersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonsPanel.setBackground(new java.awt.Color(153, 153, 153));

        Inventory_Button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Inventory_Button.setText("Inventory");
        Inventory_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventory_ButtonActionPerformed(evt);
            }
        });

        Employee_Button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Employee_Button.setText("Employees");
        Employee_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_ButtonActionPerformed(evt);
            }
        });

        Items_Button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Items_Button.setText("Items");
        Items_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Items_ButtonActionPerformed(evt);
            }
        });

        Home_Button.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Home_Button.setText("Home");
        Home_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_Button_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Employee_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inventory_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Items_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Inventory_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Employee_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Items_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        getContentPane().add(ButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        HomePage.setPreferredSize(new java.awt.Dimension(866, 605));

        EmployeeDropdownBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeDropdownBox1ActionPerformed(evt);
            }
        });

        ChooseEmployeeLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChooseEmployeeLabel1.setText("Select Employee:");

        EmployeeItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Item Name", "Item Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeItems.getTableHeader().setReorderingAllowed(false);
        AllItemsPane2.setViewportView(EmployeeItems);

        EmployeeDropdownBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeDropdownBox2ActionPerformed(evt);
            }
        });

        DetailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DetailsLabel.setText("Employee Details:");

        Employee_Namelabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Employee_Namelabel.setText("Name:");

        EmployeePositionLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmployeePositionLabel.setText("Position:");

        EmployeeDesignationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmployeeDesignationLabel.setText("Designation:");

        Employee_Namelabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Employee_Namelabel1.setText("ID:");

        EmployeeItemsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmployeeItemsLabel.setText("Employee Items:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Added Data:", "Date Added:"
            }
        ));
        RecentlyAddedTable.setViewportView(jTable1);

        recentaddedlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recentaddedlabel.setText("Recently Added Data:");

        Close_Button3.setText("Close");

        NewEmployeeButton.setText("New Employee");
        NewEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewEmployeeButtonActionPerformed(evt);
            }
        });

        Export_Button3.setText("Export");
        Export_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_Button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addComponent(ChooseEmployeeLabel1)
                        .addGap(234, 234, 234)
                        .addComponent(EmployeeItemsLabel)
                        .addGap(141, 141, 141)
                        .addComponent(EmployeeDropdownBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(HomePageLayout.createSequentialGroup()
                                .addComponent(Export_Button3)
                                .addGap(18, 18, 18)
                                .addComponent(Close_Button3))
                            .addGroup(HomePageLayout.createSequentialGroup()
                                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(EmployeeDropdownBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HomePageLayout.createSequentialGroup()
                                            .addComponent(Employee_Namelabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HomePageLayout.createSequentialGroup()
                                            .addComponent(EmployeePositionLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(DetailsLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HomePageLayout.createSequentialGroup()
                                            .addComponent(Employee_Namelabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HomePageLayout.createSequentialGroup()
                                            .addComponent(EmployeeDesignationLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(DesignationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(RecentlyAddedTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(recentaddedlabel)
                                    .addComponent(NewEmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addComponent(AllItemsPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(649, 649, 649))))
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePageLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChooseEmployeeLabel1)
                            .addComponent(EmployeeItemsLabel))
                        .addGap(10, 10, 10)
                        .addComponent(EmployeeDropdownBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DetailsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Employee_Namelabel1)
                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Employee_Namelabel)
                            .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmployeePositionLabel)
                            .addComponent(PositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmployeeDesignationLabel)
                            .addComponent(DesignationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NewEmployeeButton)
                        .addGap(24, 24, 24)
                        .addComponent(recentaddedlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecentlyAddedTable, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addComponent(EmployeeDropdownBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AllItemsPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_Button3)
                    .addComponent(Export_Button3))
                .addGap(44, 44, 44))
        );

        Tabs.addTab("tab0", HomePage);

        InventoryPanel.setPreferredSize(new java.awt.Dimension(866, 605));

        AllItemsInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Category", "Item", "Description", "Stock No.", "Unit of Measure", "Unit Value", "Balance Per Card", "On Hand Per Count", "Shortage/Overage (Quantity)", "Shortage/OVerage(Value)", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllItemsInventory.getTableHeader().setReorderingAllowed(false);
        AllItems.setViewportView(AllItemsInventory);

        jTabbedPane3.addTab("All Items", AllItems);

        FurnituresInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Description", "Stock No.", "Unit of Measure", "Unit Value", "Balance Per Card", "On Hand Per Count", "Shortage/Overage (Quantity)", "Shortage/OVerage(Value)", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Furnitures.setViewportView(FurnituresInventory);

        jTabbedPane3.addTab("Furnitures", Furnitures);

        SchoolSuppliesInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Description", "Stock No.", "Unit of Measure", "Unit Value", "Balance Per Card", "On Hand Per Count", "Shortage/Overage (Quantity)", "Shortage/OVerage(Value)", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SchoolSupplies.setViewportView(SchoolSuppliesInventory);

        jTabbedPane3.addTab("School Supplies", SchoolSupplies);

        EquipmentInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Description", "Stock No.", "Unit of Measure", "Unit Value", "Balance Per Card", "On Hand Per Count", "Shortage/Overage (Quantity)", "Shortage/OVerage(Value)", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Equipment.setViewportView(EquipmentInventory);

        jTabbedPane3.addTab("Equipment", Equipment);

        OthersInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Description", "Stock No.", "Unit of Measure", "Unit Value", "Balance Per Card", "On Hand Per Count", "Shortage/Overage (Quantity)", "Shortage/OVerage(Value)", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Others.setViewportView(OthersInventory);

        jTabbedPane3.addTab("Others", Others);

        ChooseEmployeeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChooseEmployeeLabel.setText("Choose Employee:");

        EmployeeDropdownBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeDropdownBoxActionPerformed(evt);
            }
        });

        InventoryExport_Button.setText("Export");
        InventoryExport_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryExport_ButtonActionPerformed(evt);
            }
        });

        Close_Button.setText("Close");
        Close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_ButtonActionPerformed(evt);
            }
        });

        InsertDataButton.setText("Insert Data");
        InsertDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertDataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InventoryPanelLayout = new javax.swing.GroupLayout(InventoryPanel);
        InventoryPanel.setLayout(InventoryPanelLayout);
        InventoryPanelLayout.setHorizontalGroup(
            InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InventoryPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InventoryPanelLayout.createSequentialGroup()
                        .addComponent(InventoryExport_Button)
                        .addGap(18, 18, 18)
                        .addComponent(Close_Button))
                    .addGroup(InventoryPanelLayout.createSequentialGroup()
                        .addComponent(ChooseEmployeeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(EmployeeDropdownBox, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InsertDataButton)))
                .addGap(94, 94, 94))
            .addGroup(InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InventoryPanelLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );
        InventoryPanelLayout.setVerticalGroup(
            InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeDropdownBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseEmployeeLabel)
                    .addComponent(InsertDataButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                .addGroup(InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_Button)
                    .addComponent(InventoryExport_Button))
                .addGap(39, 39, 39))
            .addGroup(InventoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InventoryPanelLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        Tabs.addTab("tab1", InventoryPanel);

        EmployeePanel.setPreferredSize(new java.awt.Dimension(866, 605));

        AddEmployeeButton.setText("Add Employee");
        AddEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeButtonActionPerformed(evt);
            }
        });

        EmployeeExport_Button.setText("Export");
        EmployeeExport_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeExport_ButtonActionPerformed(evt);
            }
        });

        Close_Button1.setText("Close");
        Close_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_Button1ActionPerformed(evt);
            }
        });

        SearchEmployeeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SearchEmployeeLabel.setText("Search:");

        Search_Employee_Button.setText("Search Employee");
        Search_Employee_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Employee_ButtonActionPerformed(evt);
            }
        });

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Employee Position", "Employee Designation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(EmployeeTable);

        javax.swing.GroupLayout EmployeePanelLayout = new javax.swing.GroupLayout(EmployeePanel);
        EmployeePanel.setLayout(EmployeePanelLayout);
        EmployeePanelLayout.setHorizontalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EmployeePanelLayout.createSequentialGroup()
                        .addComponent(AddEmployeeButton)
                        .addGap(18, 18, 18)
                        .addComponent(EmployeeExport_Button)
                        .addGap(18, 18, 18)
                        .addComponent(Close_Button1))
                    .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EmployeePanelLayout.createSequentialGroup()
                            .addComponent(SearchEmployeeLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SearchBar)
                            .addGap(18, 18, 18)
                            .addComponent(Search_Employee_Button))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        EmployeePanelLayout.setVerticalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Employee_Button))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_Button1)
                    .addComponent(EmployeeExport_Button)
                    .addComponent(AddEmployeeButton))
                .addGap(41, 41, 41))
        );

        Tabs.addTab("tab2", EmployeePanel);

        ItemsPanel.setPreferredSize(new java.awt.Dimension(866, 605));

        SearchEmployeeLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SearchEmployeeLabel1.setText("Search:");
        SearchEmployeeLabel1.setMaximumSize(new java.awt.Dimension(109, 20));
        SearchEmployeeLabel1.setMinimumSize(new java.awt.Dimension(109, 20));
        SearchEmployeeLabel1.setPreferredSize(new java.awt.Dimension(109, 20));

        Add_Item_Button.setText("Add Item/s");
        Add_Item_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Item_ButtonActionPerformed(evt);
            }
        });

        Export_Button2.setText("Export");
        Export_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_Button2ActionPerformed(evt);
            }
        });

        Close_Button2.setText("Close");
        Close_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_Button2ActionPerformed(evt);
            }
        });

        Search_Item_Button.setText("Search Item");
        Search_Item_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Item_ButtonActionPerformed(evt);
            }
        });

        AllItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Item Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllItemsTable.getTableHeader().setReorderingAllowed(false);
        AllItemsPane.setViewportView(AllItemsTable);
        if (AllItemsTable.getColumnModel().getColumnCount() > 0) {
            AllItemsTable.getColumnModel().getColumn(0).setHeaderValue("Item ID");
        }

        jTabbedPane1.addTab("All Items", AllItemsPane);

        FurnituresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Item Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FurnituresTable.getTableHeader().setReorderingAllowed(false);
        FurnituresPane.setViewportView(FurnituresTable);

        jTabbedPane1.addTab("Furnitures", FurnituresPane);

        SchoolSuppliesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Item Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SchoolSuppliesTable.getTableHeader().setReorderingAllowed(false);
        SchoolSuppliesPane.setViewportView(SchoolSuppliesTable);

        jTabbedPane1.addTab("School Supplies", SchoolSuppliesPane);

        EquipmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Item Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EquipmentsTable.getTableHeader().setReorderingAllowed(false);
        EquipmentsPane.setViewportView(EquipmentsTable);

        jTabbedPane1.addTab("Equipments", EquipmentsPane);

        OthersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Item Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OthersTable.getTableHeader().setReorderingAllowed(false);
        OthersPane.setViewportView(OthersTable);

        jTabbedPane1.addTab("Others", OthersPane);

        javax.swing.GroupLayout ItemsPanelLayout = new javax.swing.GroupLayout(ItemsPanel);
        ItemsPanel.setLayout(ItemsPanelLayout);
        ItemsPanelLayout.setHorizontalGroup(
            ItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ItemsPanelLayout.createSequentialGroup()
                            .addComponent(Export_Button2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Close_Button2)))
                    .addGroup(ItemsPanelLayout.createSequentialGroup()
                        .addComponent(SearchEmployeeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ItemSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Search_Item_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Add_Item_Button)))
                .addGap(147, 147, 147))
        );
        ItemsPanelLayout.setVerticalGroup(
            ItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Item_Button)
                    .addComponent(SearchEmployeeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Item_Button))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_Button2)
                    .addComponent(Export_Button2))
                .addContainerGap())
        );

        Tabs.addTab("tab3", ItemsPanel);

        getContentPane().add(Tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, -35, 890, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                
    private void Employee_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_ButtonActionPerformed
        Tabs.setSelectedIndex(2);
        DefaultTableModel model= AddEmployee.getEmployeeData();
        EmployeeTable.setModel(model);
    }//GEN-LAST:event_Employee_ButtonActionPerformed

    public void openFile(String file){
        try {
            File path = new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(this, "Error opening file: " + ioe.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void exportexcel(JTable InventoryTable){
        
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File saveFile = fileChooser.getSelectedFile();
            if (!saveFile.toString().endsWith(".xlsx")) {
                saveFile = new File(saveFile.toString() + ".xlsx");
            }

            try (Workbook wb = new XSSFWorkbook();
                 FileOutputStream out = new FileOutputStream(saveFile)) {

                Sheet sheet = wb.createSheet("Inventory Data");
                TableModel model = InventoryTable.getModel();

                String selectedEmployee = (String) EmployeeDropdownBox.getSelectedItem();

                // Write selected employee
                Row employeeRow = sheet.createRow(0);
                Cell employeeCell = employeeRow.createCell(0);
                employeeCell.setCellValue("Employee: " + selectedEmployee);

                // Write column headers
                Row headerRow = sheet.createRow(1);
                for (int i = 0; i < model.getColumnCount(); i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(model.getColumnName(i));
                }

                // Write data rows
                for (int rowIdx = 0; rowIdx < model.getRowCount(); rowIdx++) {
                    Row row = sheet.createRow(rowIdx + 2);
                    for (int colIdx = 0; colIdx < model.getColumnCount(); colIdx++) {
                        Cell cell = row.createCell(colIdx);
                        Object value = model.getValueAt(rowIdx, colIdx);
                        if (value != null) {
                            cell.setCellValue(value.toString());
                        }
                    }
                }
                wb.write(out);
                openFile(saveFile.toString());

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error writing file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Export cancelled by user.", "Cancelled", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void Items_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Items_ButtonActionPerformed
        Tabs.setSelectedIndex(3);
        DefaultTableModel model0 = Items.getAllItemsData();
        AllItemsTable.setModel(model0);
        DefaultTableModel model1 = Items.getFurnituresData();
        FurnituresTable.setModel(model1);
        DefaultTableModel model2 = Items.getSchoolSuppliesData();
        SchoolSuppliesTable.setModel(model2);
        DefaultTableModel model3 = Items.getEquipmentsData();
        EquipmentsTable.setModel(model3);
        DefaultTableModel model4 = Items.getOthersData();
        OthersTable.setModel(model4);
    }//GEN-LAST:event_Items_ButtonActionPerformed

    private void EmployeeExport_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeExport_ButtonActionPerformed
        exportexcel1(EmployeeTable);
    }//GEN-LAST:event_EmployeeExport_ButtonActionPerformed

    public void exportexcel1(JTable EmployeeTable){
        
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File saveFile = fileChooser.getSelectedFile();
            if (!saveFile.toString().endsWith(".xlsx")) {
                saveFile = new File(saveFile.toString() + ".xlsx");
            }

            try (Workbook wb = new XSSFWorkbook();
                 FileOutputStream out = new FileOutputStream(saveFile)) {

                Sheet sheet = wb.createSheet("Employees Data");
                TableModel model = EmployeeTable.getModel();

                // Write column headers
                Row headerRow = sheet.createRow(0);
                for (int i = 0; i < model.getColumnCount(); i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(model.getColumnName(i));
                }

                // Write data rows
                for (int rowIdx = 0; rowIdx < model.getRowCount(); rowIdx++) {
                    Row row = sheet.createRow(rowIdx + 1);
                    for (int colIdx = 0; colIdx < model.getColumnCount(); colIdx++) {
                        Cell cell = row.createCell(colIdx);
                        Object value = model.getValueAt(rowIdx, colIdx);
                        if (value != null) {
                            cell.setCellValue(value.toString());
                        }
                    }
                }

                wb.write(out);
                openFile(saveFile.toString());

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error writing file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Export cancelled by user.", "Cancelled", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void Close_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_Button1ActionPerformed
        dispose();
    }//GEN-LAST:event_Close_Button1ActionPerformed

    private void Add_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Item_ButtonActionPerformed
        Items item = new Items();
        item.show();
    }//GEN-LAST:event_Add_Item_ButtonActionPerformed

    private void AddEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeButtonActionPerformed
        AddEmployee employee = new AddEmployee();
        employee.show();
    }//GEN-LAST:event_AddEmployeeButtonActionPerformed

    private void Export_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_Button2ActionPerformed
        exportexcel2(AllItemsTable);
    }//GEN-LAST:event_Export_Button2ActionPerformed

    public void exportexcel2(JTable AllItemsTable){
        
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File saveFile = fileChooser.getSelectedFile();
            if (!saveFile.toString().endsWith(".xlsx")) {
                saveFile = new File(saveFile.toString() + ".xlsx");
            }

            try (Workbook wb = new XSSFWorkbook();
                 FileOutputStream out = new FileOutputStream(saveFile)) {

                Sheet sheet = wb.createSheet("All Items Data");
                TableModel model = AllItemsTable.getModel();

                // Write column headers
                Row headerRow = sheet.createRow(0);
                for (int i = 0; i < model.getColumnCount(); i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(model.getColumnName(i));
                }

                // Write data rows
                for (int rowIdx = 0; rowIdx < model.getRowCount(); rowIdx++) {
                    Row row = sheet.createRow(rowIdx + 1);
                    for (int colIdx = 0; colIdx < model.getColumnCount(); colIdx++) {
                        Cell cell = row.createCell(colIdx);
                        Object value = model.getValueAt(rowIdx, colIdx);
                        if (value != null) {
                            cell.setCellValue(value.toString());
                        }
                    }
                }

                wb.write(out);
                openFile(saveFile.toString());

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error writing file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Export cancelled by user.", "Cancelled", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void Close_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_Button2ActionPerformed
        dispose();
    }//GEN-LAST:event_Close_Button2ActionPerformed

    private void Search_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Item_ButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) AllItemsTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        AllItemsTable.setRowSorter(sorter);
        String searchText = ItemSearchBar.getText();
        sorter.setRowFilter(RowFilter.regexFilter(searchText));

        if (sorter.getViewRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No matching item found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Search_Item_ButtonActionPerformed

    private void Search_Employee_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Employee_ButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        EmployeeTable.setRowSorter(sorter);
        String searchText = SearchBar.getText();
        sorter.setRowFilter(RowFilter.regexFilter(searchText));

        if (sorter.getViewRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No matching employee found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_Search_Employee_ButtonActionPerformed

    private void Inventory_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inventory_ButtonActionPerformed
        Tabs.setSelectedIndex(1);
        EmployeeCombo();
    }//GEN-LAST:event_Inventory_ButtonActionPerformed

    private void EmployeeDropdownBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeDropdownBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeDropdownBox2ActionPerformed

    private void EmployeeDropdownBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeDropdownBox1ActionPerformed
        String selectedEmployee = (String) EmployeeDropdownBox.getSelectedItem();
        if (selectedEmployee != null) {
            updateInventoryTable(selectedEmployee);
        }
    }//GEN-LAST:event_EmployeeDropdownBox1ActionPerformed

    private void Home_Button_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_Button_ActionPerformed
        Tabs.setSelectedIndex(0);
        HomeEmployee();
    }//GEN-LAST:event_Home_Button_ActionPerformed

    private void NewEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewEmployeeButtonActionPerformed
        AddEmployee employee = new AddEmployee();
        employee.show();
    }//GEN-LAST:event_NewEmployeeButtonActionPerformed

    private void Export_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_Button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Export_Button3ActionPerformed

    private void InsertDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertDataButtonActionPerformed
        InsertData log =new InsertData();
        log.show();
    }//GEN-LAST:event_InsertDataButtonActionPerformed

    private void Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_ButtonActionPerformed
        dispose();
    }//GEN-LAST:event_Close_ButtonActionPerformed

    private void InventoryExport_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryExport_ButtonActionPerformed
        exportexcel(AllItemsInventory);
    }//GEN-LAST:event_InventoryExport_ButtonActionPerformed

    private void EmployeeDropdownBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeDropdownBoxActionPerformed
        String selectedEmployee = (String) EmployeeDropdownBox.getSelectedItem();
        if (selectedEmployee != null) {
            updateInventoryTable(selectedEmployee);
        }
    }//GEN-LAST:event_EmployeeDropdownBoxActionPerformed
            
    private void updateInventoryTable(String employeeName) {

        String sql = "SELECT category, item, description, stockno, unitmeasure, unitvalue, balpercard, onhandcount, quantity, value, remarks FROM inventory WHERE name = ?";

        DefaultTableModel model = new DefaultTableModel(new String[]{
            "Category","Item", "Description", "Stock No.", "Unit of Measure", "Unit Value", "Balance Per Card", 
            "On Hand Per Count", "Shortage/Overage (Quantity)", "Shortage/Overage (Value)", "Remarks"
        }, 0);

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, employeeName);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String Category = rs.getString("category");
                String item = rs.getString("item");
                String description = rs.getString("description");
                String stockNo = rs.getString("stockno");
                String unitMeasure = rs.getString("unitmeasure");
                String unitValue = rs.getString("unitvalue");
                String balancePerCard = rs.getString("balpercard");
                String onHandPerCount = rs.getString("onhandcount");
                String shortageOverageQuantity = rs.getString("quantity");
                String shortageOverageValue = rs.getString("value");
                String remarks = rs.getString("remarks");

                model.addRow(new Object[]{Category,item, description, stockNo, unitMeasure, unitValue, balancePerCard, onHandPerCount, shortageOverageQuantity, shortageOverageValue, remarks});
            }
            AllItemsInventory.setModel(model);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching inventory data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void EmployeeCombo() {
        String sql = "SELECT name FROM employees";
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            EmployeeDropdownBox.removeAllItems(); // Clear existing items
            while (rs.next()) {
                EmployeeDropdownBox.addItem(rs.getString("name"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching employee data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void HomeEmployee() {
        String sql = "SELECT employee_id, name, position FROM employees";
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            EmployeeDropdownBox1.removeAllItems(); // Clear existing items
            HashMap<String, String[]> employeeMap = new HashMap<>();

            while (rs.next()) {
                String employeeName = rs.getString("name");
                String[] employeeDetails = new String[] {
                    rs.getString("employee_id"),
                    employeeName,
                    rs.getString("position")
                };
                employeeMap.put(employeeName, employeeDetails);
                EmployeeDropdownBox1.addItem(employeeName);
            }

            EmployeeDropdownBox1.addActionListener(e -> {
                String selectedItem = (String) EmployeeDropdownBox1.getSelectedItem();
                if (selectedItem != null && employeeMap.containsKey(selectedItem)) {
                    String[] selectedEmployeeDetails = employeeMap.get(selectedItem);
                    IDTextField.setText(selectedEmployeeDetails[0]);
                    NameTextfield.setText(selectedEmployeeDetails[1]);
                    PositionTextField.setText(selectedEmployeeDetails[2]);
                }
            });
            
        String selectedEmployee = (String) EmployeeDropdownBox1.getSelectedItem();
        if (selectedEmployee != null) {
            updateEmployeeItems(selectedEmployee);
        }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching employee data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void updateEmployeeItems(String employeeName) {
    String sql = "SELECT item, category FROM inventory WHERE name = ?";
    DefaultTableModel model = new DefaultTableModel(new String[]{
        "Item Name", "Item Category",
    }, 0);

    if (employeeName == null || employeeName.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Employee name is not specified.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, employeeName);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            String item = rs.getString("item");
            String category = rs.getString("category");
            model.addRow(new Object[]{item, category});
        }
        
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No items found for the selected employee.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

        EmployeeItems.setModel(model);
        EmployeeItems.revalidate();
        EmployeeItems.repaint();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching inventory data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployeeButton;
    private javax.swing.JButton Add_Item_Button;
    private javax.swing.JScrollPane AllItems;
    private javax.swing.JTable AllItemsInventory;
    private javax.swing.JScrollPane AllItemsPane;
    private javax.swing.JScrollPane AllItemsPane2;
    private javax.swing.JTable AllItemsTable;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel ChooseEmployeeLabel;
    private javax.swing.JLabel ChooseEmployeeLabel1;
    private javax.swing.JButton Close_Button;
    private javax.swing.JButton Close_Button1;
    private javax.swing.JButton Close_Button2;
    private javax.swing.JButton Close_Button3;
    private javax.swing.JTextField DesignationTextField;
    private javax.swing.JLabel DetailsLabel;
    private javax.swing.JLabel EmployeeDesignationLabel;
    private javax.swing.JComboBox<String> EmployeeDropdownBox;
    private javax.swing.JComboBox<String> EmployeeDropdownBox1;
    private javax.swing.JComboBox<String> EmployeeDropdownBox2;
    private javax.swing.JButton EmployeeExport_Button;
    private javax.swing.JTable EmployeeItems;
    private javax.swing.JLabel EmployeeItemsLabel;
    private javax.swing.JPanel EmployeePanel;
    private javax.swing.JLabel EmployeePositionLabel;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JButton Employee_Button;
    private javax.swing.JLabel Employee_Namelabel;
    private javax.swing.JLabel Employee_Namelabel1;
    private javax.swing.JScrollPane Equipment;
    private javax.swing.JTable EquipmentInventory;
    private javax.swing.JScrollPane EquipmentsPane;
    private javax.swing.JTable EquipmentsTable;
    private javax.swing.JButton Export_Button2;
    private javax.swing.JButton Export_Button3;
    private javax.swing.JScrollPane Furnitures;
    private javax.swing.JTable FurnituresInventory;
    private javax.swing.JScrollPane FurnituresPane;
    private javax.swing.JTable FurnituresTable;
    private javax.swing.JPanel HomePage;
    private javax.swing.JButton Home_Button;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JButton InsertDataButton;
    private javax.swing.JButton InventoryExport_Button;
    private javax.swing.JPanel InventoryPanel;
    private javax.swing.JButton Inventory_Button;
    private javax.swing.JTextField ItemSearchBar;
    private javax.swing.JPanel ItemsPanel;
    private javax.swing.JButton Items_Button;
    private javax.swing.JTextField NameTextfield;
    private javax.swing.JButton NewEmployeeButton;
    private javax.swing.JScrollPane Others;
    private javax.swing.JTable OthersInventory;
    private javax.swing.JScrollPane OthersPane;
    private javax.swing.JTable OthersTable;
    private javax.swing.JTextField PositionTextField;
    private javax.swing.JScrollPane RecentlyAddedTable;
    private javax.swing.JScrollPane SchoolSupplies;
    private javax.swing.JTable SchoolSuppliesInventory;
    private javax.swing.JScrollPane SchoolSuppliesPane;
    private javax.swing.JTable SchoolSuppliesTable;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JLabel SearchEmployeeLabel;
    private javax.swing.JLabel SearchEmployeeLabel1;
    private javax.swing.JButton Search_Employee_Button;
    private javax.swing.JButton Search_Item_Button;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel recentaddedlabel;
    // End of variables declaration//GEN-END:variables
    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory_system";
    private static final String USER = "root";
    private static final String PASSWORD = "";
}
