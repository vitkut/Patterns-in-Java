package com.company;

public class PhoneDecorator implements Phone {

    private Phone wrappee;

    public PhoneDecorator(Phone wrappee){
        this.wrappee = wrappee;
    }

    @Override
    public String getInfo() {
        return wrappee.getInfo();
    }

    @Override
    public int getPrice() {
        return wrappee.getPrice();
    }
}
