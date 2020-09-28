package com.company;

public abstract class Dialog {

    public void makeSomething(){
        Person person = createPerson();
        person.say();
    }

    public abstract Person createPerson();
}
