package com.company;

import java.util.ArrayList;

public class DeviceDatabase implements Database {

    private ArrayList<Device> devices = new ArrayList<>();

    @Override
    public void create(String name, int price) {
        Device newDevice = new Device(name, price);
        devices.add(newDevice);
    }

    @Override
    public void delete(int id) {
        devices.remove(id);
    }

    @Override
    public void edit(int id, String newName) {
        devices.get(id).setName(newName);
    }

    @Override
    public void edit(int id, int newPrice){
        devices.get(id).setPrice(newPrice);
    }

    @Override
    public StringBuilder printDatabase() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < devices.size(); i++){
            stringBuilder.append(i+". Name: "+devices.get(i).getName()+"; Price: "+devices.get(i).getPrice()+"\n");
        }
        return stringBuilder;
    }
}
