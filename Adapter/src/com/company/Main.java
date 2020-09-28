package com.company;

public class Main {

    public static void main(String[] args) {
        Man man = new Man();
        Cup cup1 = new Cup();
        cup1.takeCup(man.take());
        ManWithoutHands manWithoutHands = new ManWithoutHands();
        Cup cup2 = new Cup();
        cup2.takeCup(manWithoutHands.takeWithoutHands());
        ProthesisAdapter adapter = new ProthesisAdapter();
        cup2.takeCup(adapter.take());
    }
}
