package com.company;

public class Leaf implements Component {


    @Override
    public int getCountOfLeafs() {
        return 1;
    }

    @Override
    public String getName() {
        return "Leaf";
    }

}
