package com.company;

public class CreateWoman extends Dialog {

    @Override
    public Person createPerson(){
        return new Woman();
    }
}
