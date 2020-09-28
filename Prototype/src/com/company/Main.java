package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Man man1 = new Man();
        man1.height = 190;
        man1.weight = 80;
        man1.setAge(20);
        Woman woman1 = new Woman();
        woman1.height = 160;
        woman1.weight = 50;
        woman1.setAge(18);

        Man man2 = (Man) man1.clone();
        Woman woman2 = (Woman) woman1.clone();
        System.out.println(man1.height+" "+man1.weight+" "+man1.getAge()+" "+man1.gender+" "+man1);
        System.out.println(man2.height+" "+man2.weight+" "+man2.getAge()+" "+man2.gender+" "+man2);
        System.out.println();
        System.out.println(woman1.height+" "+woman1.weight+" "+woman1.getAge()+" "+woman1.gender+" "+woman1);
        System.out.println(woman2.height+" "+woman2.weight+" "+woman2.getAge()+" "+woman2.gender+" "+woman2);

    }
}
