package oop_packages.example.garden;

import oop_packages.example.home.Person;

public class Dog {

    protected String name;
    protected String race;

    String jugar(Person person){
        return person.throwBall();
    }
}
