package com.company;

public class Case extends PhoneDecorator {

    private Phone phone;

    public Case(Phone wrappee) {
        super(wrappee);
        this.phone = wrappee;
    }

    @Override
    public String getInfo(){
        return phone.getInfo()+" with case";
    }

    @Override
    public int getPrice(){
        return phone.getPrice()+20;
    }
}
