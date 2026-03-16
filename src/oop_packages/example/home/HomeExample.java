package oop_packages.example.home;

import oop_packages.example.garden.Dog;

import static oop_packages.example.home.Person.greet;

public class HomeExample {
    public static void main(String[] args) {
        Person p = new Person();
        Dog dog = new Dog();
        String greet = greet();
    }
}
