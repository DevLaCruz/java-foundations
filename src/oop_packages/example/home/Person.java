package oop_packages.example.home;

public class Person {

    private String firstName;
    private String lastName;
    private HairColor hairColor;

    public static final String MALE_GENDER = "Male";
    public static final String FEMALE_GENDER = "Female";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public String throwBall() {
        return "Throw the ball to the dog!";
    }

    public static String greet() {
        return "Hey, what's up!";
    }
}