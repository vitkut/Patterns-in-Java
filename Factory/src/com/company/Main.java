package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dialog man (1) or woman (2)");
        Dialog dialog;
        if(scanner.nextInt() == 1){
            dialog = new CreateMan();
        } else {
            dialog = new CreateWoman();
        }
        dialog.makeSomething();

    }
}
