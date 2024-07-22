package com.mycompany.inventorysystem;

public class InventorySystem {

    public static void main(String[] args) {
        DatabaseCreator.CheckConnect();
        MainWindow log = new MainWindow();
        log.show();
    }
}
