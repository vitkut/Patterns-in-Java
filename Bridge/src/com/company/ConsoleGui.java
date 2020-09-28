package com.company;

import java.util.Scanner;

public class ConsoleGui implements Gui {

    private Users user;
    private DeviceDatabase database = Main.getDeviceDatabase();
    private Scanner scanner = new Scanner(System.in);

    public ConsoleGui(){
        user = new Users();
    }

    public ConsoleGui(Users user){
        this.user = user;
    }

    public void setUsername() {
        System.out.println("<<Set username>>");
        System.out.println("Enter new username:");
        String name = scanner.nextLine();
        user.setName(name);
        System.out.println("Done!");
    }

    public void setPermissions() {
        System.out.println("<<Set permissions>>");
        System.out.println("Chose new permissions admin (1) or user (2):");
        if(scanner.nextInt() == 1){
            user.setPermission(Users.Permissions.admin);
        } else {
            user.setPermission(Users.Permissions.user);
        }
        System.out.println("Done!");
    }

    public void getUserStatus() {
        System.out.println("<<<<User status>>>>");
        System.out.println("Username: "+user.getName());
        System.out.println("Permissions: "+user.getPermission());
        System.out.println("<<<<Done>>>>");
    }

    @Override
    public void create() {
        System.out.println("<<Create>>");
        if (user.getPermission() == Users.Permissions.admin){
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter price:");
            int price = scanner.nextInt();
            database.create(name, price);
            System.out.println("Done!");
        } else {
            System.out.println("You have no permissions!");
        }
    }

    @Override
    public void delete() {
        System.out.println("<<Delete>>");
        if(user.getPermission() == Users.Permissions.admin){
            System.out.println("Enter id:");
            int id = scanner.nextInt();
            database.delete(id);
            System.out.println("Done!");
        } else {
            System.out.println("You have no permissions!");
        }
    }

    @Override
    public void edit() {
        System.out.println("<<Edit>>");
        if(user.getPermission() == Users.Permissions.admin){
            System.out.println("Enter id:");
            int id = scanner.nextInt();
            System.out.println("Edit name (1) or price (2):");
            if(scanner.nextInt() == 1){
                System.out.println("Enter new name:");
                scanner.nextLine();
                String newName = scanner.nextLine();
                database.edit(id, newName);
            } else {
                System.out.println("Enter new price:");
                int newPrice = scanner.nextInt();
                database.edit(id, newPrice);
            }
            System.out.println("Done!");
        } else {
            System.out.println("You have no permissions!");
        }
    }

    @Override
    public void print() {
        System.out.println("---Print database---");
        StringBuilder stringBuilder = database.printDatabase();
        System.out.println(stringBuilder);
        System.out.println("Done!");
    }


}
