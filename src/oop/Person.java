package oop;
public class Person {

    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = name;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
