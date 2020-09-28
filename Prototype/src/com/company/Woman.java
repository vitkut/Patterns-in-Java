package com.company;

public class Woman extends Person {

    public String gender = "Woman";

    public Woman(){

    }

    public Woman(Woman woman){
        super(woman);
        this.gender = woman.gender;
    }

    @Override
    public Person clone(){
        return new Woman(this);
    }
}
