package oop_packages.example.garden;

import oop_packages.example.home.*;

import static oop_packages.example.home.HairColor.*;
import static oop_packages.example.home.Person.*;

public class PackageExample {
    public static void main(String[] args) {

        Person p = new Person();
        p.setFirstName("Andrés");
        p.setLastName("Guzmán");
        p.setHairColor(BROWN);
        System.out.println(p.getFirstName());

        Dog dog = new Dog();
        dog.name = "tobby";
        dog.race = "Bulldog";
        
        String jugando = dog.jugar(p);
        System.out.println("jugando = " + jugando);
        String greeting = greet();
        System.out.println("saludo = " + greeting);
        String generoMujer = MALE_GENDER;
        String generoHombre = FEMALE_GENDER;
    }
}
