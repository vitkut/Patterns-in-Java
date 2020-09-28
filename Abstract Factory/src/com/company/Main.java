package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("American (1) or Russian (2)");
        NationalFactory factory;
        if(scanner.nextInt() == 1){
            factory = new AmericanFactory();
        } else {
            factory = new RussianFactory();
        }
        Man man = factory.createMan();
        Woman woman = factory.createWoman();
        man.say();
        woman.say();
    }
}
