package com.company;

public class Cup {
    public boolean isTaken = false;

    public void takeCup(boolean canTake){
        if(canTake && !isTaken){
            isTaken = true;
        }
        System.out.println("Cup is taken: "+isTaken);
    }
}
