package com.company;

public class Director {

    public void createSimpleHouse(Builder builder){
        builder.reset();
        builder.setWalls(4);
        builder.setRoof(true);
        builder.setFloor(true);
        builder.setTowers(0);
        builder.setHeight(4);
        builder.setFireplace(false);
        builder.setAreaInSquareMeters(20);
    }

    public void createHugeHouse(Builder builder) {
        builder.reset();
        builder.setWalls(6);
        builder.setRoof(true);
        builder.setFloor(true);
        builder.setTowers(0);
        builder.setHeight(10);
        builder.setFireplace(true);
        builder.setAreaInSquareMeters(150);
    }

    public void createCastle(Builder builder){
        builder.reset();
        builder.setWalls(4);
        builder.setRoof(false);
        builder.setFloor(false);
        builder.setTowers(6);
        builder.setHeight(12);
        builder.setFireplace(true);
        builder.setAreaInSquareMeters(2000);
    }
}
