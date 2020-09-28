package com.company;

public class HouseBuilder implements Builder {

    private House house;

    @Override
    public void reset(){
        house = new House();
    }

    @Override
    public void setWalls(int walls) {
        house.walls = walls;
    }

    @Override
    public void setRoof(boolean roof) {
        house.roof = roof;
    }

    @Override
    public void setFloor(boolean floor) {
        house.floor = floor;
    }

    @Override
    public void setTowers(int towers) {
        house.towers = towers;
    }

    @Override
    public void setFireplace(boolean fireplace) {
        house.fireplace = fireplace;
    }

    @Override
    public void setAreaInSquareMeters(float areaInSquareMeters) {
        house.areaInSquareMeters = areaInSquareMeters;
    }

    @Override
    public void setHeight(int height) {
        house.height = height;
    }

    @Override
    public House getResult(){
        return house;
    }

}
