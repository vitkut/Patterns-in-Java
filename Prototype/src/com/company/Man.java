package com.company;

public class Man extends Person {

    public String gender = "Man";


    public Man(){}

    public Man(Man man){
        super(man);
        this.gender = man.gender;
    }

    @Override
    public Person clone(){
        return new Man(this);
    }
}
