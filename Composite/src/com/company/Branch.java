package com.company;

import java.util.ArrayList;

public class Branch implements Component {

    private ArrayList<Component> componentsOfBranch = new ArrayList<>();

    public void add(Component component){
        componentsOfBranch.add(component);
    }

    public void remove(Component component){
        componentsOfBranch.remove(component);
    }

    public ArrayList<Component> getChildren(){
        return componentsOfBranch;
    }

    @Override
    public int getCountOfLeafs() {
        int count = 0;
        for(Component component:componentsOfBranch){
            count += component.getCountOfLeafs();
        }
        return count;
    }

    @Override
    public String getName() {
        return "Branch";
    }

}
