/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorysystem;


public class InsertData extends javax.swing.JFrame {

    public InsertData() {
        initComponents();
        setTitle("Insert Data");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Item = new javax.swing.JLabel();
        DescLabel = new javax.swing.JLabel();
        DescriptionField = new javax.swing.JTextField();
        StockLabel = new javax.swing.JLabel();
        StockNoField = new javax.swing.JTextField();
        UnitMeasureLabel = new javax.swing.JLabel();
        UnitValueLabel = new javax.swing.JLabel();
        BalCardLabel = new javax.swing.JLabel();
        OnHandCardLabel = new javax.swing.JLabel();
        ShortageOverageLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        ValueLabel = new javax.swing.JLabel();
        RemarksLabel = new javax.swing.JLabel();
        UnitMeasureField = new javax.swing.JTextField();
        UnitValueField = new javax.swing.JTextField();
        BalPerCardField = new javax.swing.JTextField();
        OnHandCountField = new javax.swing.JTextField();
        QuantityField = new javax.swing.JTextField();
        ValueField = new javax.swing.JTextField();
        Insert_Button = new javax.swing.JButton();
        Cancel_Button = new javax.swing.JButton();
        RemarksField = new javax.swing.JTextField();
        EmployeeBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ItemBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Item.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Item.setText("Item:");

        DescLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescLabel.setText("Description:");

        StockLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StockLabel.setText("Stock No.:");

        UnitMeasureLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UnitMeasureLabel.setText("Unit of Measure:");

        UnitValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        UnitValueLabel.setText("Unit Value:");

        BalCardLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BalCardLabel.setText("Balance Per Card:");

        OnHandCardLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        OnHandCardLabel.setText("On Hand Per Count:");

        ShortageOverageLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ShortageOverageLabel.setText("Shortage/Overage");

        QuantityLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        QuantityLabel.setText("Quantity:");

        ValueLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ValueLabel.setText("Value:");

        RemarksLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RemarksLabel.setText("Remarks");

        Insert_Button.setText("Insert");
        Insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_ButtonActionPerformed(evt);
            }
        });

        Cancel_Button.setText("Cancel");
        Cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_ButtonActionPerformed(evt);
            }
        });

        EmployeeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Employee:");

        ItemBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Insert_Button)
                        .addGap(15, 15, 15)
                        .addComponent(Cancel_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(OnHandCardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShortageOverageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BalCardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UnitValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UnitMeasureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ValueLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(QuantityLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(RemarksLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UnitMeasureField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(UnitValueField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BalPerCardField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OnHandCountField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(QuantityField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ValueField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RemarksField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescLabel)
                            .addComponent(StockLabel)
                            .addComponent(Item, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StockNoField)
                            .addComponent(DescriptionField)
                            .addComponent(EmployeeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ItemBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Item)
                    .addComponent(ItemBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DescLabel)
                    .addComponent(DescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StockLabel)
                    .addComponent(StockNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnitMeasureLabel)
                    .addComponent(UnitMeasureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnitValueLabel)
                    .addComponent(UnitValueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalCardLabel)
                    .addComponent(BalPerCardField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OnHandCardLabel)
                    .addComponent(OnHandCountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ShortageOverageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantityLabel)
                    .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValueLabel)
                    .addComponent(ValueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemarksLabel)
                    .addComponent(RemarksField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert_Button)
                    .addComponent(Cancel_Button))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_ButtonActionPerformed
        //String Item =ItemField.getText();
        String Description = DescriptionField.getText();
        String StockNo= StockNoField.getText();
        String UnitMeasure = UnitMeasureField.getText();
        String UnitValue = UnitValueField.getText();
        String BalPerCard = BalPerCardField.getText();
        String OnHandCount = OnHandCountField.getText();
        String Quantity = QuantityField.getText();
        String Value = ValueField.getText();
        String Remarks = RemarksField.getText();
    }//GEN-LAST:event_Insert_ButtonActionPerformed

    private void Cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_ButtonActionPerformed
        dispose();
    }//GEN-LAST:event_Cancel_ButtonActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalCardLabel;
    private javax.swing.JTextField BalPerCardField;
    private javax.swing.JButton Cancel_Button;
    private javax.swing.JLabel DescLabel;
    private javax.swing.JTextField DescriptionField;
    private javax.swing.JComboBox<String> EmployeeBox;
    private javax.swing.JButton Insert_Button;
    private javax.swing.JLabel Item;
    private javax.swing.JComboBox<String> ItemBox;
    private javax.swing.JLabel OnHandCardLabel;
    private javax.swing.JTextField OnHandCountField;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JTextField RemarksField;
    private javax.swing.JLabel RemarksLabel;
    private javax.swing.JLabel ShortageOverageLabel;
    private javax.swing.JLabel StockLabel;
    private javax.swing.JTextField StockNoField;
    private javax.swing.JTextField UnitMeasureField;
    private javax.swing.JLabel UnitMeasureLabel;
    private javax.swing.JTextField UnitValueField;
    private javax.swing.JLabel UnitValueLabel;
    private javax.swing.JTextField ValueField;
    private javax.swing.JLabel ValueLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
