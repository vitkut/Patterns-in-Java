package com.company;

public class CalculatorFacade {

    public static void printAnswer(int numOfOperation, int firstNum, int secondNum){
        int answer;
        switch (numOfOperation){
            case 1:{
                answer = Summator.getAnswer(firstNum, secondNum);
                System.out.println("Summation of "+firstNum+" and "+secondNum+" is "+answer);
                break;
            }
            case 2:{
                answer = Subtractor.getAnswer(firstNum, secondNum);
                System.out.println("Subtraction of "+firstNum+" and "+secondNum+" is "+answer);
                break;
            }
            case 3:{
                answer = Multiplicator.getAnswer(firstNum, secondNum);
                System.out.println("Multiplication of "+firstNum+" and "+secondNum+" is "+answer);
                break;
            }
            case 4:{
                answer = Divider.getAnswer(firstNum, secondNum);
                System.out.println("Division of "+firstNum+" and "+secondNum+" is "+answer);
                break;
            }
            default:{
                System.out.println("Unknown command");
            }
        }
    }

    public static void printAllAnswers(int firstNum, int secondNum){
        for(int i = 1; i < 5; i++){
            printAnswer(i, firstNum, secondNum);
        }
    }
}
