package com.company;

public class Main {

    public static void main(String[] args) {
        God buddha = God.getGod();
        System.out.println("Buddha said:");
        buddha.sayHello();
        System.out.println("Buddha hashCode:");
        System.out.println(buddha.hashCode());
        God allah = God.getGod();
        System.out.println("Allah said:");
        allah.sayHello();
        System.out.println("Allah hashCode:");
        System.out.println(allah.hashCode());
    }
}
