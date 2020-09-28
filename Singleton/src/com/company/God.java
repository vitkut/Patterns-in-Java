package com.company;

public class God {

    private static God instanceOfGod;

    private God(){}

    public static synchronized God getGod(){
        if(instanceOfGod == null){
            instanceOfGod = new God();
        }
        return instanceOfGod;
    }

    public void sayHello(){
        System.out.println("\tHello, i am God!");
    }
}
