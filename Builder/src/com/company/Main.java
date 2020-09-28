package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();
        System.out.println("Simple house (1) or huge house (2) or castle (3)");
        int number = scanner.nextInt();
        switch (number){
            case 1:{
                director.createSimpleHouse(houseBuilder);
                break;
            }
            case 2:{
                director.createHugeHouse(houseBuilder);
                break;
            }
            case 3:{
                director.createCastle(houseBuilder);
                break;
            }
            default:{
                System.out.println("Unknown number!");
            }
        }
        System.out.println();
        House newHouse = houseBuilder.getResult();
        newHouse.getInfo();
    }
}
