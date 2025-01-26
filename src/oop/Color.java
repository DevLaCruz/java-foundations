package oop;

public enum Color {
    RED("Red"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    WHITE("White"),
    DARK_GRAY("Dark Gray"),
    ORANGE("Orange");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
