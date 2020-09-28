package com.company;

public class Users {

    private Permissions permission;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPermission(Permissions permission) {
        this.permission = permission;
    }

    public Permissions getPermission() {
        return permission;
    }

    public enum Permissions {admin, user}
}

