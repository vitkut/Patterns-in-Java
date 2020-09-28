package com.company;

public interface Database {

    void create(String name, int price);

    void delete(int id);

    void edit(int id, String newString);

    void edit(int id, int newInt);

    StringBuilder printDatabase();

}
