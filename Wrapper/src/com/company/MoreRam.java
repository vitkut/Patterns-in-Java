package com.company;

public class MoreRam extends PhoneDecorator {

    private Phone phone;

    public MoreRam(Phone wrappee) {
        super(wrappee);
        this.phone = wrappee;
    }

    @Override
    public String getInfo(){
        return phone.getInfo()+" with More RAM";
    }

    @Override
    public int getPrice(){
        return phone.getPrice()+500;
    }
}
