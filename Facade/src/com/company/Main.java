package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNum = scanner.nextInt();
        System.out.println("Sum(1) or subtract(2) or multiply(3) or divide(4)");
        int numOfOperation = scanner.nextByte();
        CalculatorFacade.printAnswer(numOfOperation, firstNum, secondNum);
        CalculatorFacade.printAllAnswers(firstNum, secondNum);

    }
}
