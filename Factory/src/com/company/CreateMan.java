package com.company;

public class CreateMan extends Dialog {

    @Override
    public Person createPerson(){
        return new Man();
    }
}
