package com.company;

public interface Builder {

    void reset();
    void setWalls(int walls);
    void setRoof(boolean roof);
    void setFloor(boolean floor);
    void setTowers(int towers);
    void setFireplace(boolean fireplace);
    void setAreaInSquareMeters(float areaInSquareMeters);
    void setHeight(int height);
    House getResult();
}
