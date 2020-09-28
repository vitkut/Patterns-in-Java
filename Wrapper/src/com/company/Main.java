package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose phone:");
        System.out.println("1) Iphone 7");
        System.out.println("2) Iphone 10");
        Phone phone;
        if(scanner.nextInt() == 1){
            phone = new Iphone7();
        } else {
            phone = new Iphone10();
        }
        System.out.println("Case? (y/n)");
        scanner.nextLine();
        if(scanner.nextLine().equals("y")){
            phone = new Case(phone);
        }
        System.out.println("More RAM? (y/n)");
        if(scanner.nextLine().equals("y")){
            phone = new MoreRam(phone);
        }
        phone = new PhoneDecorator(phone);
        System.out.println(phone.getInfo()+" = "+phone.getPrice());
    }
}
