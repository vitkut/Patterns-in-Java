package com.company;

public class Main {

    public static void main(String[] args) {
        Branch mainBranch = setup();
        System.out.println(mainBranch.getCountOfLeafs());
        Leaf leaf = new Leaf();
        mainBranch.add(leaf);
        System.out.println(mainBranch.getCountOfLeafs());
        mainBranch.remove(leaf);
        System.out.println(mainBranch.getCountOfLeafs());

    }

    public static Branch setup(){
        Leaf leaf = new Leaf();

        Branch branch2 = new Branch();
        Branch branch3 = new Branch();
        Branch branch4 = new Branch();
        Branch branch5 = new Branch();
        Branch mainBranch = new Branch();

        branch2.add(leaf);
        branch2.add(leaf);
        branch3.add(leaf);
        branch4.add(branch2);
        branch4.add(branch3);
        branch5.add(leaf);
        branch5.add(leaf);

        mainBranch.add(branch4);
        mainBranch.add(branch5);

        return mainBranch;
    }
}
