/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        setTitle("Inventory System");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonsPanel = new javax.swing.JPanel();
        Items_Button = new javax.swing.JButton();
        Employee_Button = new javax.swing.JButton();
        Inventory_Button = new javax.swing.JButton();
        Tabs = new javax.swing.JTabbedPane();
        BlankTab = new javax.swing.JPanel();
        Inventory = new javax.swing.JPanel();
        ChooseEmployeeLabel = new javax.swing.JLabel();
        EmployeeDropdownBox = new javax.swing.JComboBox<>();
        InventoryPane = new javax.swing.JScrollPane();
        InventoryTable = new javax.swing.JTable();
        Export_Button = new javax.swing.JButton();
        Close_Button = new javax.swing.JButton();
        InsertDataButton = new javax.swing.JButton();
        Employee = new javax.swing.JPanel();
        AddEmployeeButton = new javax.swing.JButton();
        SearchBar = new javax.swing.JTextField();
        Export_Button1 = new javax.swing.JButton();
        Close_Button1 = new javax.swing.JButton();
        SearchEmployeeLabel = new javax.swing.JLabel();
        Search_Employee_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        Items = new javax.swing.JPanel();
        ItemsContent = new javax.swing.JTabbedPane();
        FurnituresPanel = new javax.swing.JPanel();
        FurnituresPane = new javax.swing.JScrollPane();
        FurnituresTable = new javax.swing.JTable();
        SchoolSuppliesPanel = new javax.swing.JPanel();
        SchoolSuppliesPane = new javax.swing.JScrollPane();
        SchoolSuppliesTable = new javax.swing.JTable();
        OfficeSuppliesEtcPanel = new javax.swing.JPanel();
        OfficeSuppliesEtcPane = new javax.swing.JScrollPane();
        EquipmentsTable = new javax.swing.JTable();
        EquipmentsPanel = new javax.swing.JPanel();
        OfficeSuppliesEtcPane1 = new javax.swing.JScrollPane();
        OthersTable = new javax.swing.JTable();
        SearchEmployeeLabel1 = new javax.swing.JLabel();
        ItemSearchBar = new javax.swing.JTextField();
        Add_Item_Button = new javax.swing.JButton();
        Export_Button2 = new javax.swing.JButton();
        Close_Button2 = new javax.swing.JButton();
        Search_Item_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(965, 605));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonsPanel.setBackground(new java.awt.Color(153, 153, 153));

        Items_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Items_Button.setText("Items");
        Items_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Items_ButtonActionPerformed(evt);
            }
        });

        Employee_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Employee_Button.setText("Employee");
        Employee_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_ButtonActionPerformed(evt);
            }
        });

        Inventory_Button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Inventory_Button.setText("Inventory");
        Inventory_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inventory_ButtonActionPerformed(evt);
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
                    .addComponent(Items_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Inventory_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Employee_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Items_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        getContentPane().add(ButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        BlankTab.setPreferredSize(new java.awt.Dimension(866, 605));

        javax.swing.GroupLayout BlankTabLayout = new javax.swing.GroupLayout(BlankTab);
        BlankTab.setLayout(BlankTabLayout);
        BlankTabLayout.setHorizontalGroup(
            BlankTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        BlankTabLayout.setVerticalGroup(
            BlankTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );

        Tabs.addTab("tab4", BlankTab);

        Inventory.setPreferredSize(new java.awt.Dimension(866, 605));

        ChooseEmployeeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChooseEmployeeLabel.setText("Choose Employee:");

        EmployeeDropdownBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EmployeeDropdownBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeDropdownBoxActionPerformed(evt);
            }
        });

        InventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Description", "Stock No.", "Unit of Measure", "Unit Value", "Balance Per Card", "On Hand Per Count", "Shortage/Overage (Quantity)", "Shortage/OVerage(Value)", "Remarks"
            }
        ));
        InventoryPane.setViewportView(InventoryTable);

        Export_Button.setText("Export");
        Export_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_ButtonActionPerformed(evt);
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

        javax.swing.GroupLayout InventoryLayout = new javax.swing.GroupLayout(Inventory);
        Inventory.setLayout(InventoryLayout);
        InventoryLayout.setHorizontalGroup(
            InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InventoryLayout.createSequentialGroup()
                        .addComponent(Export_Button)
                        .addGap(18, 18, 18)
                        .addComponent(Close_Button))
                    .addGroup(InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(InventoryLayout.createSequentialGroup()
                            .addComponent(ChooseEmployeeLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(EmployeeDropdownBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(InsertDataButton))
                        .addComponent(InventoryPane, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        InventoryLayout.setVerticalGroup(
            InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InventoryLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeDropdownBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChooseEmployeeLabel)
                    .addComponent(InsertDataButton))
                .addGap(18, 18, 18)
                .addComponent(InventoryPane, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_Button)
                    .addComponent(Export_Button))
                .addGap(47, 47, 47))
        );

        Tabs.addTab("tab1", Inventory);

        Employee.setPreferredSize(new java.awt.Dimension(866, 605));

        AddEmployeeButton.setText("Add Employee");
        AddEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeButtonActionPerformed(evt);
            }
        });

        Export_Button1.setText("Export");
        Export_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_Button1ActionPerformed(evt);
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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Employee Position"
            }
        ));
        EmployeeTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(EmployeeTable);

        javax.swing.GroupLayout EmployeeLayout = new javax.swing.GroupLayout(Employee);
        Employee.setLayout(EmployeeLayout);
        EmployeeLayout.setHorizontalGroup(
            EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EmployeeLayout.createSequentialGroup()
                        .addComponent(SearchEmployeeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchBar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search_Employee_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddEmployeeButton))
                    .addGroup(EmployeeLayout.createSequentialGroup()
                        .addComponent(Export_Button1)
                        .addGap(18, 18, 18)
                        .addComponent(Close_Button1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        EmployeeLayout.setVerticalGroup(
            EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddEmployeeButton)
                    .addComponent(SearchEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Employee_Button))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_Button1)
                    .addComponent(Export_Button1))
                .addContainerGap())
        );

        Tabs.addTab("tab1", Employee);

        Items.setPreferredSize(new java.awt.Dimension(866, 605));

        ItemsContent.setMaximumSize(new java.awt.Dimension(2147483647, 80));
        ItemsContent.setMinimumSize(new java.awt.Dimension(150, 80));

        FurnituresPanel.setPreferredSize(new java.awt.Dimension(750, 80));

        FurnituresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Furniture  No.", "Furniture Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FurnituresTable.getTableHeader().setReorderingAllowed(false);
        FurnituresPane.setViewportView(FurnituresTable);
        if (FurnituresTable.getColumnModel().getColumnCount() > 0) {
            FurnituresTable.getColumnModel().getColumn(0).setMinWidth(250);
            FurnituresTable.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        javax.swing.GroupLayout FurnituresPanelLayout = new javax.swing.GroupLayout(FurnituresPanel);
        FurnituresPanel.setLayout(FurnituresPanelLayout);
        FurnituresPanelLayout.setHorizontalGroup(
            FurnituresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FurnituresPane, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        FurnituresPanelLayout.setVerticalGroup(
            FurnituresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FurnituresPane, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        ItemsContent.addTab("Furnitures", FurnituresPanel);

        SchoolSuppliesPanel.setPreferredSize(new java.awt.Dimension(750, 80));

        SchoolSuppliesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "School Supply No.", "School Supply Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SchoolSuppliesTable.getTableHeader().setReorderingAllowed(false);
        SchoolSuppliesPane.setViewportView(SchoolSuppliesTable);
        if (SchoolSuppliesTable.getColumnModel().getColumnCount() > 0) {
            SchoolSuppliesTable.getColumnModel().getColumn(0).setMinWidth(250);
            SchoolSuppliesTable.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        javax.swing.GroupLayout SchoolSuppliesPanelLayout = new javax.swing.GroupLayout(SchoolSuppliesPanel);
        SchoolSuppliesPanel.setLayout(SchoolSuppliesPanelLayout);
        SchoolSuppliesPanelLayout.setHorizontalGroup(
            SchoolSuppliesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SchoolSuppliesPane, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        SchoolSuppliesPanelLayout.setVerticalGroup(
            SchoolSuppliesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SchoolSuppliesPane, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        ItemsContent.addTab("School Supplies", SchoolSuppliesPanel);

        OfficeSuppliesEtcPanel.setPreferredSize(new java.awt.Dimension(750, 80));

        EquipmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Equipment No.", "Equipment Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EquipmentsTable.getTableHeader().setReorderingAllowed(false);
        OfficeSuppliesEtcPane.setViewportView(EquipmentsTable);
        if (EquipmentsTable.getColumnModel().getColumnCount() > 0) {
            EquipmentsTable.getColumnModel().getColumn(0).setMinWidth(250);
            EquipmentsTable.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        javax.swing.GroupLayout OfficeSuppliesEtcPanelLayout = new javax.swing.GroupLayout(OfficeSuppliesEtcPanel);
        OfficeSuppliesEtcPanel.setLayout(OfficeSuppliesEtcPanelLayout);
        OfficeSuppliesEtcPanelLayout.setHorizontalGroup(
            OfficeSuppliesEtcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OfficeSuppliesEtcPane, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        OfficeSuppliesEtcPanelLayout.setVerticalGroup(
            OfficeSuppliesEtcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OfficeSuppliesEtcPane, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        ItemsContent.addTab("Equipments", OfficeSuppliesEtcPanel);

        OthersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Office Supply No.", "Office Supply Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OthersTable.getTableHeader().setReorderingAllowed(false);
        OfficeSuppliesEtcPane1.setViewportView(OthersTable);
        if (OthersTable.getColumnModel().getColumnCount() > 0) {
            OthersTable.getColumnModel().getColumn(0).setMinWidth(250);
            OthersTable.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        javax.swing.GroupLayout EquipmentsPanelLayout = new javax.swing.GroupLayout(EquipmentsPanel);
        EquipmentsPanel.setLayout(EquipmentsPanelLayout);
        EquipmentsPanelLayout.setHorizontalGroup(
            EquipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OfficeSuppliesEtcPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        );
        EquipmentsPanelLayout.setVerticalGroup(
            EquipmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OfficeSuppliesEtcPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        ItemsContent.addTab("Others", EquipmentsPanel);

        SearchEmployeeLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SearchEmployeeLabel1.setText("Search:");
        SearchEmployeeLabel1.setMaximumSize(new java.awt.Dimension(109, 20));
        SearchEmployeeLabel1.setMinimumSize(new java.awt.Dimension(109, 20));
        SearchEmployeeLabel1.setPreferredSize(new java.awt.Dimension(109, 20));

        ItemSearchBar.setText("\n");

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

        javax.swing.GroupLayout ItemsLayout = new javax.swing.GroupLayout(Items);
        Items.setLayout(ItemsLayout);
        ItemsLayout.setHorizontalGroup(
            ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ItemsLayout.createSequentialGroup()
                        .addComponent(Export_Button2)
                        .addGap(18, 18, 18)
                        .addComponent(Close_Button2))
                    .addGroup(ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ItemsLayout.createSequentialGroup()
                            .addComponent(SearchEmployeeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ItemSearchBar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Search_Item_Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Add_Item_Button))
                        .addComponent(ItemsContent, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        ItemsLayout.setVerticalGroup(
            ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Item_Button)
                    .addComponent(SearchEmployeeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Item_Button))
                .addGap(18, 18, 18)
                .addComponent(ItemsContent, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(ItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close_Button2)
                    .addComponent(Export_Button2))
                .addGap(41, 41, 41))
        );

        Tabs.addTab("tab3", Items);

        getContentPane().add(Tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, -35, 850, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void Employee_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_ButtonActionPerformed
        Tabs.setSelectedIndex(2);
        DefaultTableModel model= AddEmployee.getEmployeeData();
        EmployeeTable.setModel(model);
    }//GEN-LAST:event_Employee_ButtonActionPerformed

    private void Export_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Export_ButtonActionPerformed

    private void Close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_ButtonActionPerformed
        dispose();
    }//GEN-LAST:event_Close_ButtonActionPerformed

    private void InsertDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertDataButtonActionPerformed
        InsertData log =new InsertData();
        log.show();
    }//GEN-LAST:event_InsertDataButtonActionPerformed

    private void Items_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Items_ButtonActionPerformed
        Tabs.setSelectedIndex(3);
        DefaultTableModel model1 = AddItem.getFurnituresData();
        FurnituresTable.setModel(model1);
        DefaultTableModel model2 = AddItem.getSchoolSuppliesData();
        SchoolSuppliesTable.setModel(model2);
        DefaultTableModel model3 = AddItem.getEquipmentsData();
        EquipmentsTable.setModel(model3);
        DefaultTableModel model4 = AddItem.getOthersData();
        OthersTable.setModel(model4);
    }//GEN-LAST:event_Items_ButtonActionPerformed

    private void Export_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Export_Button1ActionPerformed

    private void Close_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_Button1ActionPerformed
        dispose();
    }//GEN-LAST:event_Close_Button1ActionPerformed

    private void Add_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Item_ButtonActionPerformed
        AddItem item = new AddItem();
        item.show();
    }//GEN-LAST:event_Add_Item_ButtonActionPerformed

    private void AddEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeButtonActionPerformed
        AddEmployee employee = new AddEmployee();
        employee.show();
    }//GEN-LAST:event_AddEmployeeButtonActionPerformed

    private void Export_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_Button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Export_Button2ActionPerformed

    private void Close_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_Button2ActionPerformed
        dispose();
    }//GEN-LAST:event_Close_Button2ActionPerformed

    private void Search_Item_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Item_ButtonActionPerformed
        // TODO add your handling code here:
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

    private void EmployeeDropdownBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeDropdownBoxActionPerformed
        String selectedEmployee = (String) EmployeeDropdownBox.getSelectedItem();
        if (selectedEmployee != null) {
            updateInventoryTable(selectedEmployee);
        }
    }//GEN-LAST:event_EmployeeDropdownBoxActionPerformed
      
    private void updateInventoryTable(String employeeName) {
        String DB_URL = "jdbc:mysql://localhost:3306/inventory_system";
        String USER = "root";
        String PASSWORD = "";

        String sql = "SELECT item, description, stockno, unitmeasure, unitvalue, balpercard, onhandcount, quantity, value, remarks FROM inventory WHERE name = ?";

        DefaultTableModel model = new DefaultTableModel(new String[]{
            "Item", "Description", "Stock No.", "Unit of Measure", "Unit Value", "Balance Per Card", 
            "On Hand Per Count", "Shortage/Overage (Quantity)", "Shortage/Overage (Value)", "Remarks"
        }, 0);

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, employeeName);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String item = rs.getString("item");
                String description = rs.getString("description");
                String stockNo = rs.getString("stockno");
                String unitMeasure = rs.getString("unitmeasure");
                double unitValue = rs.getDouble("unitvalue");
                int balancePerCard = rs.getInt("balpercard");
                int onHandPerCount = rs.getInt("onhandcount");
                int shortageOverageQuantity = rs.getInt("quantity");
                double shortageOverageValue = rs.getDouble("value");
                String remarks = rs.getString("remarks");

                model.addRow(new Object[]{item, description, stockNo, unitMeasure, unitValue, balancePerCard, onHandPerCount, shortageOverageQuantity, shortageOverageValue, remarks});
            }
            InventoryTable.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching inventory data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void EmployeeCombo() {
        String DB_URL = "jdbc:mysql://localhost:3306/inventory_system";
        String USER = "root";
        String PASSWORD = "";

        String sql = "SELECT name FROM employees";

        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            EmployeeDropdownBox.removeAllItems();

            while (rs.next()) {
                EmployeeDropdownBox.addItem(rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching employee data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
            
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployeeButton;
    private javax.swing.JButton Add_Item_Button;
    private javax.swing.JPanel BlankTab;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel ChooseEmployeeLabel;
    private javax.swing.JButton Close_Button;
    private javax.swing.JButton Close_Button1;
    private javax.swing.JButton Close_Button2;
    private javax.swing.JPanel Employee;
    private javax.swing.JComboBox<String> EmployeeDropdownBox;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JButton Employee_Button;
    private javax.swing.JPanel EquipmentsPanel;
    private javax.swing.JTable EquipmentsTable;
    private javax.swing.JButton Export_Button;
    private javax.swing.JButton Export_Button1;
    private javax.swing.JButton Export_Button2;
    private javax.swing.JScrollPane FurnituresPane;
    private javax.swing.JPanel FurnituresPanel;
    private javax.swing.JTable FurnituresTable;
    private javax.swing.JButton InsertDataButton;
    private javax.swing.JPanel Inventory;
    private javax.swing.JScrollPane InventoryPane;
    private javax.swing.JTable InventoryTable;
    private javax.swing.JButton Inventory_Button;
    private javax.swing.JTextField ItemSearchBar;
    private javax.swing.JPanel Items;
    private javax.swing.JTabbedPane ItemsContent;
    private javax.swing.JButton Items_Button;
    private javax.swing.JScrollPane OfficeSuppliesEtcPane;
    private javax.swing.JScrollPane OfficeSuppliesEtcPane1;
    private javax.swing.JPanel OfficeSuppliesEtcPanel;
    private javax.swing.JTable OthersTable;
    private javax.swing.JScrollPane SchoolSuppliesPane;
    private javax.swing.JPanel SchoolSuppliesPanel;
    private javax.swing.JTable SchoolSuppliesTable;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JLabel SearchEmployeeLabel;
    private javax.swing.JLabel SearchEmployeeLabel1;
    private javax.swing.JButton Search_Employee_Button;
    private javax.swing.JButton Search_Item_Button;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
