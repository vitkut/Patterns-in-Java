package com.company;

public class Main {

    public static void main(String[] args) {
        Users admin = new Users();
        admin.setPermission(Users.Permissions.admin);
        ConsoleGui consoleGui = new ConsoleGui(admin);
        consoleGui.print();
        consoleGui.create();
        consoleGui.print();
        consoleGui.delete();
        consoleGui.print();
        consoleGui.edit();
        consoleGui.print();
        consoleGui.setUsername();
        consoleGui.getUserStatus();
        consoleGui.setPermissions();
        consoleGui.getUserStatus();
        consoleGui.print();
    }

    public static DeviceDatabase getDeviceDatabase(){
        DeviceDatabase database = new DeviceDatabase();
        database.create("Iphone 11", 1000);
        database.create("Lenovo", 500);
        database.create("Xiaomi 5+", 200);
        return database;
    }
}
