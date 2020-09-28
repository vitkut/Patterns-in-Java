package com.company;

public class RussianFactory implements NationalFactory {

    @Override
    public Man createMan(){
        return new RussianMan();
    }

    @Override
    public Woman createWoman(){
        return new RussianWoman();
    }
}
