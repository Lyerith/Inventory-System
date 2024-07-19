package com.mycompany.inventorysystem;

public class InventorySystem {

    public static void main(String[] args) {
        DatabaseCreator.createDatabaseIfNotExists("Inventory_System");
        MainWindow log = new MainWindow();
        log.show();
    }
}
