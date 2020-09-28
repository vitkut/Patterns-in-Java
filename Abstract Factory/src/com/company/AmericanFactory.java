package com.company;

public class AmericanFactory implements NationalFactory {

    @Override
    public Man createMan(){
        return new AmericanMan();
    }

    @Override
    public Woman createWoman(){
        return new AmericanWoman();
    }
}
