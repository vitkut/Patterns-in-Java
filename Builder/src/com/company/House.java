package com.company;

public class House {

    public int walls;
    public boolean roof;
    public boolean floor;
    public int towers;
    public boolean fireplace;
    public float areaInSquareMeters;
    public int height;

    public void getInfo(){
        System.out.println("Walls: "+walls);
        System.out.println("Roof: "+roof);
        System.out.println("Floor: "+floor);
        System.out.println("Towers: "+towers);
        System.out.println("Fireplace: "+fireplace);
        System.out.println("Area: "+areaInSquareMeters);
        System.out.println("Height: "+height);
    }
}
