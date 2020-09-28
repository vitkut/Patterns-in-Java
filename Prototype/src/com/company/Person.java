package com.company;

public abstract class Person {

    public int height;
    public int weight;
    private int age;

    public Person(){}

    public Person(Person person){
        this.height = person.height;
        this.weight = person.weight;
        this.age = person.age;
    }

    public abstract Person clone();

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
